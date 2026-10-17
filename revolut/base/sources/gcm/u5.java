package gcm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes13.dex */
public final class u5 extends z5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f142903c;

    public u5(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f142903c = atomicIntegerFieldUpdater;
    }

    @Override // gcm.z5
    public final boolean o(w5 w5Var) {
        return this.f142903c.compareAndSet(w5Var, 0, -1);
    }

    @Override // gcm.z5
    public final void p(w5 w5Var) {
        this.f142903c.set(w5Var, 0);
    }
}
