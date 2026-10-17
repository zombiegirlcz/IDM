package sfj;

import dfj.z2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import oki.h;
import vkm.j2;
import yki.g;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d extends h implements g {
    public final z2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f262496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f262497q;

    /* JADX WARN: Multi-variable type inference failed */
    public d(z2 esimRestrictionsInteractor, Function1 restrictedStep) {
        Intrinsics.checkNotNullParameter(esimRestrictionsInteractor, "esimRestrictionsInteractor");
        Intrinsics.checkNotNullParameter(restrictedStep, "restrictedStep");
        this.o = esimRestrictionsInteractor;
        this.f262496p = (q) restrictedStep;
        this.f262497q = vkm.q.c(null);
    }

    @Override // yji.l
    public final void I1() {
        l2(new s64.a(this, null, 17), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new c(this, null), new whi.b(6));
    }
}
