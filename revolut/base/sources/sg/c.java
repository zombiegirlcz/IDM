package sg;

import androidx.collection.LruCache;
import cam.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f262569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LruCache f262570c;
    public final ReentrantReadWriteLock d;
    public final ExecutorService e;

    public c(b bVar) {
        super(11);
        this.f262570c = new LruCache(5);
        this.d = new ReentrantReadWriteLock();
        this.e = Executors.newCachedThreadPool();
        this.f262569b = bVar;
    }

    public final Set F(int i) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        ReentrantReadWriteLock reentrantReadWriteLock2 = this.d;
        reentrantReadWriteLock2.readLock().lock();
        LruCache lruCache = this.f262570c;
        Set set = (Set) lruCache.get(Integer.valueOf(i));
        reentrantReadWriteLock2.readLock().unlock();
        if (set == null) {
            reentrantReadWriteLock2.writeLock().lock();
            set = (Set) lruCache.get(Integer.valueOf(i));
            if (set == null) {
                b bVar = this.f262569b;
                double d = 2.0d;
                double dPow = (((double) bVar.f262567b) / Math.pow(2.0d, i)) / 256.0d;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                synchronized (bVar.d) {
                    try {
                        for (a aVar : bVar.f262568c) {
                            if (!hashSet.contains(aVar)) {
                                double d5 = d;
                                wg.a aVar2 = aVar.f262565b;
                                double d6 = dPow / d5;
                                ReentrantReadWriteLock reentrantReadWriteLock3 = reentrantReadWriteLock2;
                                double d10 = aVar2.f297214a;
                                double d15 = d10 - d6;
                                double d41 = d10 + d6;
                                double d51 = aVar2.f297215b;
                                vg.a aVar3 = new vg.a(d15, d41, d51 - d6, d51 + d6);
                                xg.a aVar4 = bVar.d;
                                aVar4.getClass();
                                ArrayList arrayList = new ArrayList();
                                aVar4.c(aVar3, arrayList);
                                if (arrayList.size() == 1) {
                                    hashSet2.add(aVar);
                                    hashSet.add(aVar);
                                    map.put(aVar, Double.valueOf(0.0d));
                                    reentrantReadWriteLock2 = reentrantReadWriteLock3;
                                    d = d5;
                                } else {
                                    e eVar = new e(aVar.f262564a.a());
                                    hashSet2.add(eVar);
                                    Iterator it8 = arrayList.iterator();
                                    while (it8.hasNext()) {
                                        Iterator it9 = it8;
                                        a aVar5 = (a) it8.next();
                                        Double d68 = (Double) map.get(aVar5);
                                        b bVar2 = bVar;
                                        wg.a aVar6 = aVar5.f262565b;
                                        wg.a aVar7 = aVar.f262565b;
                                        double d81 = dPow;
                                        double d82 = aVar6.f297214a - aVar7.f297214a;
                                        double d95 = d82 * d82;
                                        double d100 = aVar6.f297215b - aVar7.f297215b;
                                        double d101 = (d100 * d100) + d95;
                                        if (d68 == null) {
                                            map.put(aVar5, Double.valueOf(d101));
                                            eVar.f262573b.add(aVar5.f262564a);
                                            map2.put(aVar5, eVar);
                                        } else if (d68.doubleValue() >= d101) {
                                            ((e) map2.get(aVar5)).f262573b.remove(aVar5.f262564a);
                                            map.put(aVar5, Double.valueOf(d101));
                                            eVar.f262573b.add(aVar5.f262564a);
                                            map2.put(aVar5, eVar);
                                        }
                                        it8 = it9;
                                        bVar = bVar2;
                                        dPow = d81;
                                    }
                                    hashSet.addAll(arrayList);
                                    reentrantReadWriteLock2 = reentrantReadWriteLock3;
                                    d = d5;
                                    bVar = bVar;
                                    dPow = dPow;
                                }
                            }
                        }
                        reentrantReadWriteLock = reentrantReadWriteLock2;
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                lruCache.put(Integer.valueOf(i), hashSet2);
                set = hashSet2;
            } else {
                reentrantReadWriteLock = reentrantReadWriteLock2;
            }
            reentrantReadWriteLock.writeLock().unlock();
        }
        return set;
    }

    public final boolean G(ai0.d dVar) {
        boolean zRemove;
        b bVar = this.f262569b;
        bVar.getClass();
        a aVar = new a(dVar);
        synchronized (bVar.d) {
            try {
                zRemove = bVar.f262568c.remove(aVar);
                if (zRemove) {
                    xg.a aVar2 = bVar.d;
                    aVar2.getClass();
                    wg.a aVar3 = aVar.f262565b;
                    if (aVar2.f305455a.a(aVar3.f297214a, aVar3.f297215b)) {
                        aVar2.b(aVar3.f297214a, aVar3.f297215b, aVar);
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (zRemove) {
            this.f262570c.evictAll();
        }
        return zRemove;
    }
}
