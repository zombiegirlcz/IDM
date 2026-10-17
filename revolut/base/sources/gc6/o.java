package gc6;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import d7j.o0;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sa6.t;
import ya6.z;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends jki.g implements l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dc6.c f142360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f142361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ua6.a f142362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a31.a f142363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f142364t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(dc6.c presentationModel, j60.a bottomExpandableDialogControllerExtension, ua6.a donationsNaviCommandsProvider, gte.a featureToggleInteractor, a31.a donationsAvailabilityInteractor, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(donationsNaviCommandsProvider, "donationsNaviCommandsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f142360p = presentationModel;
        this.f142361q = bottomExpandableDialogControllerExtension;
        this.f142362r = donationsNaviCommandsProvider;
        this.f142363s = donationsAvailabilityInteractor;
        this.f142364t = new h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        dc6.c cVar = this.f142360p;
        yji.l.a1(this, rd0.e.b(((z) ((t) cVar.f112804a).f261345a).f311995n.f(Unit.f186387a, true)), null, null, new n(this, null, 2), 3);
        aa6.c cVar2 = cVar.f112804a;
        yji.l.a1(this, rd0.e.b(pd.b.r(aa6.c.a(cVar2, false), new dc6.a(cVar, 2))), null, null, new n(this, null, 3), 3);
        yji.l.a1(this, rd0.e.b(pd.b.r(aa6.c.a(cVar2, false), new dc6.a(cVar, 3))), null, null, new n(this, null, 4), 3);
        if (this.f142363s.f()) {
            yji.l.a1(this, rd0.e.b(cVar.f112807g.a(new CharityTransactionsParams(null, 12))), null, null, new n(this, null, 0), 3);
            return;
        }
        r map = m70.a.g(aa6.c.a(cVar2, false), null, new o0(22), 1).map(new d73.n(new dak.c(10), 13));
        whf.b bVar = cVar.f;
        Intrinsics.h(map);
        yji.l.a1(this, rd0.e.b(whf.b.a(bVar, map, null, null, null, 14)), null, null, new n(this, null, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        dc6.c cVar = this.f142360p;
        sfm.b bVar = new sfm.b(cVar.f112806c.x(AccountId.Personal.f51414a), new d73.n(new dc6.a(cVar, 1), 14), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        yji.l.b1(this, rd0.e.b(bVar), null, new n(this, null, 5), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f142364t;
    }
}
