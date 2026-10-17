package ozc;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f231297b;

    public /* synthetic */ m0(r0 r0Var, int i) {
        this.f231296a = i;
        this.f231297b = r0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f231296a) {
            case 0:
                s0 s0Var = (s0) ((t) this.f231297b.f231311c).f231329b;
                return (gzc.z) ((od0.i) s0Var.v.getValue(s0Var, s0.z[20]).get()).g();
            case 1:
                r0 r0Var = this.f231297b;
                pfm.a aVar = new pfm.a(((t) r0Var.f231311c).D3(), new j0(18, new n0(r0Var, 9)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            default:
                return this.f231297b.m();
        }
    }
}
