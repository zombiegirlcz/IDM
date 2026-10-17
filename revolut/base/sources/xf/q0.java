package xf;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends com.google.protobuf.p0 implements u0 {
    public final void h(t0 t0Var) {
        c();
        ((t0) this.f49761b).addSubtraces(t0Var);
    }

    public final void i(long j2, String str) {
        str.getClass();
        c();
        ((t0) this.f49761b).getMutableCountersMap().put(str, Long.valueOf(j2));
    }

    public final void j(long j2) {
        c();
        ((t0) this.f49761b).setClientStartTimeUs(j2);
    }

    public final void k(long j2) {
        c();
        ((t0) this.f49761b).setDurationUs(j2);
    }

    public final void l(String str) {
        c();
        ((t0) this.f49761b).setName(str);
    }
}
