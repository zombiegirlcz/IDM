package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    /* JADX INFO: loaded from: classes17.dex */
    public abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        public StandardEntrySet() {
        }

        @Override // com.google.common.collect.Maps.EntrySet
        public Map<K, V> map() {
            return ForwardingMap.this;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public class StandardKeySet extends Maps.KeySet<K, V> {
        public StandardKeySet() {
            super(ForwardingMap.this);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public class StandardValues extends Maps.Values<K, V> {
        public StandardValues() {
            super(ForwardingMap.this);
        }
    }

    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj2) {
        return delegate().containsKey(obj2);
    }

    public boolean containsValue(Object obj2) {
        return delegate().containsValue(obj2);
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj2) {
        return obj2 == this || delegate().equals(obj2);
    }

    public V get(Object obj2) {
        return delegate().get(obj2);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public V remove(Object obj2) {
        return delegate().remove(obj2);
    }

    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        Iterators.clear(entrySet().iterator());
    }

    public boolean standardContainsKey(Object obj2) {
        return Maps.containsKeyImpl(this, obj2);
    }

    public boolean standardContainsValue(Object obj2) {
        return Maps.containsValueImpl(this, obj2);
    }

    public boolean standardEquals(Object obj2) {
        return Maps.equalsImpl(this, obj2);
    }

    public int standardHashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.putAllImpl(this, map);
    }

    public V standardRemove(Object obj2) {
        Iterator<Map.Entry<K, V>> it8 = entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry<K, V> next = it8.next();
            if (Objects.equal(next.getKey(), obj2)) {
                V value = next.getValue();
                it8.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return Maps.toStringImpl(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
