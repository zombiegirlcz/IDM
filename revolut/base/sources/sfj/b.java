package sfj;

import dfj.z2;
import dki.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b extends g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z2 f262495t;
    public final q u;
    public final j2 v;

    /* JADX WARN: Multi-variable type inference failed */
    public b(z2 esimRestrictionsInteractor, Function1 restrictedStep) {
        Intrinsics.checkNotNullParameter(esimRestrictionsInteractor, "esimRestrictionsInteractor");
        Intrinsics.checkNotNullParameter(restrictedStep, "restrictedStep");
        this.f262495t = esimRestrictionsInteractor;
        this.u = (q) restrictedStep;
        this.v = vkm.q.c(null);
    }

    @Override // yji.l
    public void I1() {
        l2(new s64.a(this, null, 16), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new a(this, null), new whi.b(6));
    }
}
