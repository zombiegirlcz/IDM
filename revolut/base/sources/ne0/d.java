package ne0;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f214383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock f214384b;

    public d(b type) {
        HashMap map;
        Intrinsics.checkNotNullParameter(type, "type");
        int i = c.f214382a[type.ordinal()];
        if (i == 1) {
            map = new HashMap();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            map = new LinkedHashMap();
        }
        this.f214383a = map;
        this.f214384b = new ReentrantReadWriteLock();
    }

    @Override // ne0.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantReadWriteLock.ReadLock lock = this.f214384b.readLock();
        lock.lock();
        try {
            Object obj2 = this.f214383a.get(key);
            if (obj2 == null) {
                obj2 = null;
            }
            return obj2;
        } finally {
            lock.unlock();
        }
    }

    @Override // ne0.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void f(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f214384b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f214383a.put(key, value);
            Unit unit = Unit.f186387a;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // od0.e
    public final void clear() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f214384b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f214383a.clear();
            Unit unit = Unit.f186387a;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // ne0.j
    public final boolean contains(Object obj2) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f214383a.containsKey(key);
    }

    @Override // ne0.j
    public final List getAll() {
        ReentrantReadWriteLock.ReadLock lock = this.f214384b.readLock();
        lock.lock();
        try {
            Collection collectionValues = this.f214383a.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            List listD1 = d0.d1(collectionValues);
            Intrinsics.i(listD1, "null cannot be cast to non-null type kotlin.collections.List<T of com.revolut.core.data.memory.HashMapMemoryCache.getAll>");
            return listD1;
        } finally {
            lock.unlock();
        }
    }

    @Override // ne0.j
    public final Object remove(Object obj2) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f214384b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Object objRemove = this.f214383a.remove(key);
            if (objRemove == null) {
                objRemove = null;
            }
            return objRemove;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // ne0.j
    public final void t1(Collection values, Function1 keySelector) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f214384b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            clear();
            HashMap map = this.f214383a;
            Collection collection = values;
            int iB = q0.b(w.t(collection, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            for (Object obj2 : collection) {
                linkedHashMap.put((String) keySelector.invoke(obj2), obj2);
            }
            map.putAll(linkedHashMap);
            Unit unit = Unit.f186387a;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th10) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th10;
        }
    }

    public d() {
        this(b.HASH);
    }
}
