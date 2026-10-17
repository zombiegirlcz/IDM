package ym;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pfm.n;
import wf6.w;
import zhm.a0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends rm.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f314826b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantReadWriteLock f314827c = new ReentrantReadWriteLock();

    @Override // rm.f, qm.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void D(b payload) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f314826b;
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!Intrinsics.f(payload.f314825c, "")) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f314827c;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                a0.E(copyOnWriteArrayList, new kn.a(payload, 1));
                copyOnWriteArrayList.add(payload);
                Unit unit = Unit.f186387a;
            } finally {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        }
        super.D(payload);
    }

    @Override // rm.f, qm.a
    public final efm.b c0(Object obj2) {
        b payload = (b) obj2;
        Intrinsics.checkNotNullParameter(payload, "payload");
        n nVar = new n(new w(this, payload, 5), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        return nVar;
    }
}
