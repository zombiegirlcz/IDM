package gmh;

import a07.p;
import cli.y;
import com.revolut.data.model.Data;
import d9.e1;
import fi7.s;
import gd3.i;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends oki.h implements c {
    public final ryc.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o5d.a f144859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f144860q;

    public h(ryc.a popularAssetsInteractor, o5d.a swipeActionsControllerModelExtension, ac4.g mapper) {
        Intrinsics.checkNotNullParameter(popularAssetsInteractor, "popularAssetsInteractor");
        Intrinsics.checkNotNullParameter(swipeActionsControllerModelExtension, "swipeActionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = popularAssetsInteractor;
        this.f144859p = swipeActionsControllerModelExtension;
        this.f144860q = mra.d.b(this, new d(new Data(null, null, true, 3, null), null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        v1 v1VarN = e1.N(new s(2, this, h.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 4), nim.a.v(rd0.e.b(this.o.h(new a0h.b(a0h.a.COMMODITIES, f0.f322471a), false)), new i(this, 28)));
        l.b1(this, v1VarN, null, new g(this, null, 0), 3);
        l.b1(this, this.f144859p.Z2(new p(nim.a.v(v1VarN, new gk7.a(25)), 17)), null, new g(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f144860q;
    }
}
