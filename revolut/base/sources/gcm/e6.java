package gcm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.e0[] f142632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f142633b = new AtomicBoolean(false);

    static {
        new e6(new ecm.e0[0]);
    }

    public e6(ecm.e0[] e0VarArr) {
        this.f142632a = e0VarArr;
    }

    public final void a(long j2) {
        for (ecm.e0 e0Var : this.f142632a) {
            e0Var.h(j2);
        }
    }
}
