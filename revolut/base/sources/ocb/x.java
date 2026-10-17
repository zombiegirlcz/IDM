package ocb;

import ble.o1;
import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.retail.common.ui.api.Toggles;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n33.r0;
import nyb.b0;
import org.jetbrains.annotations.NotNull;
import v6l.b1;
import vkm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends jki.g implements k {

    @NotNull
    public static final n Companion = new n();
    public final jid.z A;
    public final g B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ekg.g f224196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y21.c f224197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final loi.a f224198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xoj.a f224199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l93.f f224200t;
    public final am2.a u;
    public final rcb.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f224201w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final pak.h f224202x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final eub.k f224203y;
    public final rea.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(jki.p stateMapper, ekg.g uiPersonalisationInteractor, y21.c optOutRepository, loi.a analyticsInteractor, xoj.a featuresInteractor, l93.f revolutCardInteractor, am2.a profileTypeInteractor, rcb.e makeMeDiscoverableScreenExtension, gte.a featureToggleInteractor, pak.h makeMeDiscoverableFeaturesChecker, eub.k revPointsPersonalisationAvailabilityInteractor, rea.e hideAccountDetailsInteractor, jid.z delegate) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(revolutCardInteractor, "revolutCardInteractor");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        Intrinsics.checkNotNullParameter(makeMeDiscoverableScreenExtension, "makeMeDiscoverableScreenExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(makeMeDiscoverableFeaturesChecker, "makeMeDiscoverableFeaturesChecker");
        Intrinsics.checkNotNullParameter(revPointsPersonalisationAvailabilityInteractor, "revPointsPersonalisationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(hideAccountDetailsInteractor, "hideAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f224196p = uiPersonalisationInteractor;
        this.f224197q = optOutRepository;
        this.f224198r = analyticsInteractor;
        this.f224199s = featuresInteractor;
        this.f224200t = revolutCardInteractor;
        this.u = profileTypeInteractor;
        this.v = makeMeDiscoverableScreenExtension;
        this.f224201w = featureToggleInteractor;
        this.f224202x = makeMeDiscoverableFeaturesChecker;
        this.f224203y = revPointsPersonalisationAvailabilityInteractor;
        this.z = hideAccountDetailsInteractor;
        this.A = delegate;
        this.B = new g(0);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new nt4.f(this, continuation, 18), new yi5.b(26));
        yji.l.a1(this, rd0.e.b(this.u.a()), null, null, new s(this, continuation, 4), 3);
        ekg.g gVar = this.f224196p;
        mk0.a aVar = ((akg.o) gVar.f127161b).f;
        akg.o.Companion.getClass();
        tk0.b.b("FLIP_GESTURE_ENABLED");
        tk0.b bVar = new tk0.b("FLIP_GESTURE_ENABLED");
        Boolean bool = Boolean.FALSE;
        yji.l.a1(this, new q0(oc.c.t(aVar, bVar, bool), new a2g.q(gVar, continuation, 16), 1), null, null, new t(this, continuation, 3), 3);
        yji.l.a1(this, new dmj.k(rd0.e.b(gVar.e.c()), 25), null, null, new t(this, continuation, 4), 3);
        yoj.c cVar = yoj.c.MESSAGING_WITH_FRIENDS;
        y21.c cVar2 = this.f224197q;
        cVar2.getClass();
        SecuritySettings securitySettings = SecuritySettings.MESSAGING_WITH_FRIENDS_SETTING;
        w4l.h loadingStrategy = w4l.h.f294642c;
        yji.l.a1(this, y2(cVar, new r0(mo3.a.g(rd0.e.b(cVar2.b(securitySettings, loadingStrategy)), null, null, 3), 13)), null, null, new s(this, continuation, 5), 3);
        yji.l.a1(this, mo3.a.g(rd0.e.b(((noi.a) this.f224198r).f218047b.d.e(Unit.f186387a, w4l.j.f294644c)), null, null, 3), null, null, new t(this, continuation, 5), 3);
        yji.l.a1(this, mo3.a.g(rd0.e.b(cVar2.b(SecuritySettings.PROFILE_REVEAL_SETTING, loadingStrategy)), null, null, 3), null, null, new s(this, continuation, 6), 3);
        yji.l.a1(this, y2(yoj.c.GROUP_ADDITION, new r0(mo3.a.g(rd0.e.b(cVar2.b(SecuritySettings.ADDING_TO_GROUPS_SETTINGS, loadingStrategy)), null, null, 3), 14)), null, null, new s(this, continuation, 7), 3);
        yji.l.a1(this, y2(yoj.c.CREDIT_DATA_SHARING_OPT_OUT, mo3.a.g(rd0.e.b(nim.a.w(cVar2.b(SecuritySettings.CREDIT_DATA, loadingStrategy), new y07.m(28))), null, null, 3)), null, null, new s(this, continuation, 0), 3);
        jid.z zVar = this.A;
        yji.l.a1(this, vkm.q.Q(new sa6.o(bla.b.b(((tbk.b) zVar.f174461b).f269551a, "PRICING_PLAN_GIFTING"), 3), new ns9.h(continuation, zVar, 23)), null, null, new s(this, continuation, 1), 3);
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, new n1g.p(mo3.a.g(rd0.e.b(cVar2.b(SecuritySettings.BIRTHDAY_SHARING, loadingStrategy)), null, null, 3), this, 29), null, null, new s(this, continuation, 2), 3);
        mk0.a aVar2 = ((b1) ((ha3.x) this.f224200t).f.f319829a).f;
        b1.Companion.getClass();
        Intrinsics.checkNotNullParameter("SHOW_MEXICO_MCY_CARD", "id");
        yji.l.a1(this, oc.c.t(aVar2, new tk0.b("SHOW_MEXICO_MCY_CARD"), bool), null, null, new t(this, continuation, 0), 3);
        xoj.a aVar3 = (xoj.a) this.f224202x.f234573b;
        yji.l.a1(this, new r7b.e(rd0.e.b(te0.w.l(((cpj.b) aVar3).j(yoj.c.DISCOVERABILITY_BY_USERNAME, w4l.h.f294642c), ((cpj.b) aVar3).j(yoj.c.OPT_OUT, w4l.h.f294642c))), 2), null, null, new s(this, continuation, 3), 3);
        b0 b0Var = (b0) this.f224203y;
        y21.c cVar3 = b0Var.f220776c;
        yji.l.a1(this, mo3.a.g(rd0.e.b(nim.a.w(kli.a.i(cVar3.b(SecuritySettings.TRANSACTIONS_USAGE, loadingStrategy), cVar3.b(SecuritySettings.REVOLUT_PRODUCTS_USAGE, loadingStrategy), cVar3.b(SecuritySettings.REVPOINTS_PROFILE_USAGE, loadingStrategy)), new nya.b0(b0Var, 4))), null, null, 3), null, null, new t(this, continuation, 1), 3);
        if (((jte.d) this.f224201w).c(Toggles.AccountDetailsSurfacing.f98561c)) {
            yji.l.a1(this, this.z.a(), null, null, new t(this, continuation, 2), 3);
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.B;
    }

    public final wkm.l y2(yoj.c cVar, Flow flow) {
        return vkm.q.Q(rd0.e.b(((cpj.b) this.f224199s).j(cVar, w4l.h.f294642c)), new o1(2, null, flow));
    }
}
