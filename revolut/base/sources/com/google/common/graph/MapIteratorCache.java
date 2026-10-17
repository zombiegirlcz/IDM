package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
class MapIteratorCache<K, V> {
    private final Map<K, V> backingMap;
    private volatile transient Map.Entry<K, V> cacheEntry;

    public MapIteratorCache(Map<K, V> map) {
        this.backingMap = (Map) Preconditions.checkNotNull(map);
    }

    public final void clear() {
        clearCache();
        this.backingMap.clear();
    }

    public void clearCache() {
        this.cacheEntry = null;
    }

    public final boolean containsKey(Object obj2) {
        return getIfCached(obj2) != null || this.backingMap.containsKey(obj2);
    }

    public V get(Object obj2) {
        Preconditions.checkNotNull(obj2);
        V ifCached = getIfCached(obj2);
        return ifCached == null ? getWithoutCaching(obj2) : ifCached;
    }

    public V getIfCached(Object obj2) {
        Map.Entry<K, V> entry = this.cacheEntry;
        if (entry == null || entry.getKey() != obj2) {
            return null;
        }
        return entry.getValue();
    }

    public final V getWithoutCaching(Object obj2) {
        Preconditions.checkNotNull(obj2);
        return this.backingMap.get(obj2);
    }

    public final V put(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        clearCache();
        return this.backingMap.put(k, v);
    }

    public final V remove(Object obj2) {
        Preconditions.checkNotNull(obj2);
        clearCache();
        return this.backingMap.remove(obj2);
    }

    public final Set<K> unmodifiableKeySet() {
        return new AbstractSet<K>() { // from class: com.google.common.graph.MapIteratorCache.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj2) {
                return MapIteratorCache.this.containsKey(obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return MapIteratorCache.this.backingMap.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<K> iterator() {
                final Iterator<Map.Entry<K, V>> it8 = MapIteratorCache.this.backingMap.entrySet().iterator();
                return new UnmodifiableIterator<K>(this) { // from class: com.google.common.graph.MapIteratorCache.1.1
                    final /* synthetic */ AnonymousClass1 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it8.hasNext();
                    }

                    @Override // java.util.Iterator
                    public K next() {
                        Map.Entry entry = (Map.Entry) it8.next();
                        MapIteratorCache.this.cacheEntry = entry;
                        return (K) entry.getKey();
                    }
                };
            }
        };
    }
}
