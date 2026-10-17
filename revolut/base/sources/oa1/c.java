package oa1;

import ihm.f;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f223496a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f223497b = v0.a.d("create(...)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantReadWriteLock f223498c = new ReentrantReadWriteLock();

    public final void a() {
        ReentrantReadWriteLock.ReadLock lock = this.f223498c.readLock();
        lock.lock();
        try {
            Integer numValueOf = Integer.valueOf(this.f223496a.size());
            lock.unlock();
            this.f223497b.onNext(numValueOf);
        } catch (Throwable th10) {
            lock.unlock();
            throw th10;
        }
    }
}
