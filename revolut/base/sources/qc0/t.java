package qc0;

import java.util.Stack;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f244487b;

    public /* synthetic */ t(j0 j0Var, int i) {
        this.f244486a = i;
        this.f244487b = j0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f244486a) {
            case 0:
                return this.f244487b.l3();
            case 1:
                return this.f244487b.e0();
            default:
                return j0.k3((Stack) this.f244487b.f244440b.r0().get());
        }
    }
}
