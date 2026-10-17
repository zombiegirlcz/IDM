package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes17.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class AtomicLongMap<K> implements Serializable {
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.map = (ConcurrentHashMap) Preconditions.checkNotNull(concurrentHashMap);
    }

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    private Map<K, Long> createAsMap() {
        return Collections.unmodifiableMap(Maps.transformValues(this.map, new Function<AtomicLong, Long>() { // from class: com.google.common.util.concurrent.AtomicLongMap.1
            @Override // com.google.common.base.Function
            public Long apply(AtomicLong atomicLong) {
                return Long.valueOf(atomicLong.get());
            }
        }));
    }

    public long addAndGet(K k, long j2) {
        AtomicLong atomicLongPutIfAbsent;
        long j3;
        long j5;
        do {
            atomicLongPutIfAbsent = this.map.get(k);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k, new AtomicLong(j2))) == null) {
                break;
            }
            do {
                j3 = atomicLongPutIfAbsent.get();
                if (j3 != 0) {
                    j5 = j3 + j2;
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j3, j5));
            return j5;
        } while (!this.map.replace(k, atomicLongPutIfAbsent, new AtomicLong(j2)));
        return j2;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Long> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object obj2) {
        return this.map.containsKey(obj2);
    }

    public long decrementAndGet(K k) {
        return addAndGet(k, -1L);
    }

    public long get(K k) {
        AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    public long getAndAdd(K k, long j2) {
        AtomicLong atomicLongPutIfAbsent;
        long j3;
        do {
            atomicLongPutIfAbsent = this.map.get(k);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k, new AtomicLong(j2))) == null) {
                return 0L;
            }
            do {
                j3 = atomicLongPutIfAbsent.get();
                if (j3 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j3, j3 + j2));
            return j3;
        } while (!this.map.replace(k, atomicLongPutIfAbsent, new AtomicLong(j2)));
        return 0L;
    }

    public long getAndDecrement(K k) {
        return getAndAdd(k, -1L);
    }

    public long getAndIncrement(K k) {
        return getAndAdd(k, 1L);
    }

    public long incrementAndGet(K k) {
        return addAndGet(k, 1L);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public long put(K k, long j2) {
        AtomicLong atomicLongPutIfAbsent;
        long j3;
        do {
            atomicLongPutIfAbsent = this.map.get(k);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k, new AtomicLong(j2))) == null) {
                return 0L;
            }
            do {
                j3 = atomicLongPutIfAbsent.get();
                if (j3 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j3, j2));
            return j3;
        } while (!this.map.replace(k, atomicLongPutIfAbsent, new AtomicLong(j2)));
        return 0L;
    }

    public void putAll(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    public long putIfAbsent(K k, long j2) {
        AtomicLong atomicLongPutIfAbsent;
        do {
            atomicLongPutIfAbsent = this.map.get(k);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k, new AtomicLong(j2))) == null) {
                return 0L;
            }
            long j3 = atomicLongPutIfAbsent.get();
            if (j3 != 0) {
                return j3;
            }
        } while (!this.map.replace(k, atomicLongPutIfAbsent, new AtomicLong(j2)));
        return 0L;
    }

    public long remove(K k) {
        long j2;
        AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j2 = atomicLong.get();
            if (j2 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j2, 0L));
        this.map.remove(k, atomicLong);
        return j2;
    }

    public void removeAllZeros() {
        Iterator<Map.Entry<K, AtomicLong>> it8 = this.map.entrySet().iterator();
        while (it8.hasNext()) {
            AtomicLong value = it8.next().getValue();
            if (value != null && value.get() == 0) {
                it8.remove();
            }
        }
    }

    public boolean removeIfZero(K k) {
        return remove(k, 0L);
    }

    public boolean replace(K k, long j2, long j3) {
        if (j2 == 0) {
            return putIfAbsent(k, j3) == 0;
        }
        AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(j2, j3);
    }

    public int size() {
        return this.map.size();
    }

    public long sum() {
        Iterator<AtomicLong> it8 = this.map.values().iterator();
        long j2 = 0;
        while (it8.hasNext()) {
            j2 += it8.next().get();
        }
        return j2;
    }

    public String toString() {
        return this.map.toString();
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map) {
        AtomicLongMap<K> atomicLongMapCreate = create();
        atomicLongMapCreate.putAll(map);
        return atomicLongMapCreate;
    }

    public boolean remove(K k, long j2) {
        AtomicLong atomicLong = this.map.get(k);
        if (atomicLong == null) {
            return false;
        }
        long j3 = atomicLong.get();
        if (j3 != j2) {
            return false;
        }
        if (j3 != 0 && !atomicLong.compareAndSet(j3, 0L)) {
            return false;
        }
        this.map.remove(k, atomicLong);
        return true;
    }
}
