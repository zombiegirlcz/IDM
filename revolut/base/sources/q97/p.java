package q97;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public abstract class p implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq3.w f243762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f243763b;

    public p(t97.c productCellProvider, xq3.w creditPrimaryEntryPointsInteractor) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(creditPrimaryEntryPointsInteractor, "creditPrimaryEntryPointsInteractor");
        this.f243762a = creditPrimaryEntryPointsInteractor;
        this.f243763b = te0.w.y0(new pyc.a(this, 23));
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == e();
    }

    @Override // p97.c
    public final efm.r b() {
        return rd0.e.c(vkm.q.Q(vkm.q.q(f()), new q7b.j((Continuation) null, this, 5)), skm.p0.f264003c);
    }

    public abstract fs3.b d();

    public abstract t97.d e();

    public abstract Flow f();
}
