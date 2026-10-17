package ch.qos.logback.core.spi;

import com.revolut.data.database.models.openbanking.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractComponentTracker<C> implements ComponentTracker<C> {
    private static final boolean ACCESS_ORDERED = true;
    public static final long LINGERING_TIMEOUT = 10000;
    public static final long WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS = 1000;
    protected int maxComponents = Integer.MAX_VALUE;
    protected long timeout = ComponentTracker.DEFAULT_TIMEOUT;
    LinkedHashMap<String, Entry<C>> liveMap = new LinkedHashMap<>(32, 0.75f, ACCESS_ORDERED);
    LinkedHashMap<String, Entry<C>> lingerersMap = new LinkedHashMap<>(16, 0.75f, ACCESS_ORDERED);
    long lastCheck = 0;
    private RemovalPredicator<C> byExcedent = new RemovalPredicator<C>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.1
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<C> entry, long j2) {
            if (AbstractComponentTracker.this.liveMap.size() > AbstractComponentTracker.this.maxComponents) {
                return AbstractComponentTracker.ACCESS_ORDERED;
            }
            return false;
        }
    };
    private RemovalPredicator<C> byTimeout = new RemovalPredicator<C>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.2
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<C> entry, long j2) {
            return AbstractComponentTracker.this.isEntryStale(entry, j2);
        }
    };
    private RemovalPredicator<C> byLingering = new RemovalPredicator<C>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.3
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<C> entry, long j2) {
            return AbstractComponentTracker.this.isEntryDoneLingering(entry, j2);
        }
    };

    public static class Entry<C> {
        C component;
        String key;
        long timestamp;

        public Entry(String str, C c2, long j2) {
            this.key = str;
            this.component = c2;
            this.timestamp = j2;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return AbstractComponentTracker.ACCESS_ORDERED;
            }
            if (obj2 == null || getClass() != obj2.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj2;
            String str = this.key;
            if (str == null) {
                if (entry.key != null) {
                    return false;
                }
            } else if (!str.equals(entry.key)) {
                return false;
            }
            C c2 = this.component;
            C c3 = entry.component;
            if (c2 == null) {
                if (c3 != null) {
                    return false;
                }
            } else if (!c2.equals(c3)) {
                return false;
            }
            return AbstractComponentTracker.ACCESS_ORDERED;
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public void setTimestamp(long j2) {
            this.timestamp = j2;
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder("(");
            sb6.append(this.key);
            sb6.append(", ");
            return d.t(sb6, this.component, ")");
        }
    }

    public interface RemovalPredicator<C> {
        boolean isSlatedForRemoval(Entry<C> entry, long j2);
    }

    private void genericStaleComponentRemover(LinkedHashMap<String, Entry<C>> linkedHashMap, long j2, RemovalPredicator<C> removalPredicator) {
        Iterator<Map.Entry<String, Entry<C>>> it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            Entry<C> value = it8.next().getValue();
            if (!removalPredicator.isSlatedForRemoval(value, j2)) {
                return;
            }
            it8.remove();
            processPriorToRemoval(value.component);
        }
    }

    private Entry<C> getFromEitherMap(String str) {
        Entry<C> entry = this.liveMap.get(str);
        return entry != null ? entry : this.lingerersMap.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryDoneLingering(Entry<C> entry, long j2) {
        if (entry.timestamp + 10000 < j2) {
            return ACCESS_ORDERED;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryStale(Entry<C> entry, long j2) {
        if (!isComponentStale(entry.component) && entry.timestamp + this.timeout >= j2) {
            return false;
        }
        return ACCESS_ORDERED;
    }

    private boolean isTooSoonForRemovalIteration(long j2) {
        if (this.lastCheck + 1000 > j2) {
            return ACCESS_ORDERED;
        }
        this.lastCheck = j2;
        return false;
    }

    private void removeExcedentComponents() {
        genericStaleComponentRemover(this.liveMap, 0L, this.byExcedent);
    }

    private void removeStaleComponentsFromLingerersMap(long j2) {
        genericStaleComponentRemover(this.lingerersMap, j2, this.byLingering);
    }

    private void removeStaleComponentsFromMainMap(long j2) {
        genericStaleComponentRemover(this.liveMap, j2, this.byTimeout);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Collection<C> allComponents() {
        ArrayList arrayList = new ArrayList();
        Iterator<Entry<C>> it8 = this.liveMap.values().iterator();
        while (it8.hasNext()) {
            arrayList.add(it8.next().component);
        }
        Iterator<Entry<C>> it9 = this.lingerersMap.values().iterator();
        while (it9.hasNext()) {
            arrayList.add(it9.next().component);
        }
        return arrayList;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Set<String> allKeys() {
        HashSet hashSet = new HashSet(this.liveMap.keySet());
        hashSet.addAll(this.lingerersMap.keySet());
        return hashSet;
    }

    public abstract C buildComponent(String str);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public void endOfLife(String str) {
        Entry<C> entryRemove = this.liveMap.remove(str);
        if (entryRemove == null) {
            return;
        }
        this.lingerersMap.put(str, entryRemove);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C find(String str) {
        Entry<C> fromEitherMap = getFromEitherMap(str);
        if (fromEitherMap == null) {
            return null;
        }
        return fromEitherMap.component;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public int getComponentCount() {
        return this.lingerersMap.size() + this.liveMap.size();
    }

    public int getMaxComponents() {
        return this.maxComponents;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C getOrCreate(String str, long j2) {
        Entry<C> fromEitherMap;
        try {
            fromEitherMap = getFromEitherMap(str);
            if (fromEitherMap == null) {
                Entry<C> entry = new Entry<>(str, buildComponent(str), j2);
                this.liveMap.put(str, entry);
                fromEitherMap = entry;
            } else {
                fromEitherMap.setTimestamp(j2);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return fromEitherMap.component;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public abstract boolean isComponentStale(C c2);

    public abstract void processPriorToRemoval(C c2);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized void removeStaleComponents(long j2) {
        if (isTooSoonForRemovalIteration(j2)) {
            return;
        }
        removeExcedentComponents();
        removeStaleComponentsFromMainMap(j2);
        removeStaleComponentsFromLingerersMap(j2);
    }

    public void setMaxComponents(int i) {
        this.maxComponents = i;
    }

    public void setTimeout(long j2) {
        this.timeout = j2;
    }
}
