package ud3;

import akl.w0;
import com.revolut.data.model.Data;
import et6.h1;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 extends jki.g implements k {
    public final a A;
    public final eub.a B;
    public final com.revolut.feature.rev_points.api.navigation.a C;
    public final eub.i D;
    public final sha.c E;
    public final p9g.g F;
    public final i G;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bd3.a f279094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gd3.b f279095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ffk.t f279096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f279097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p8g.a f279098t;
    public final al4.q u;
    public final al4.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final nd3.d f279099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final whf.b f279100x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final nd3.j f279101y;
    public final j60.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(jki.p stateMapper, bd3.a cashbackInteractor, gd3.b cashbackHomeRepository, ffk.t pricingPlanInteractor, h1 freelancerInteractor, p8g.a travelHotelsCashbackInteractor, al4.q creditCardProductInteractor, al4.j creditCardEntryPointDetailsInteractor, al4.p creditCardProductFeatureTogglesInteractor, nd3.d cashbackTransactionsFilterProvider, whf.b transactionsContentProvider, nd3.j cashbackUpgradeNavigationDelegate, j60.a bottomExpandableDialogControllerExtension, a cashbackDisclaimerBottomDialogProvider, eub.a revPointsAvailabilityInteractor, com.revolut.feature.rev_points.api.navigation.a revPointsNavigationFactory, eub.i revPointsOptInInteractor, sha.c proOnboardingCommandFactory, p9g.g staysFeatureEntryPointCommandFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(cashbackHomeRepository, "cashbackHomeRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsCashbackInteractor, "travelHotelsCashbackInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(cashbackUpgradeNavigationDelegate, "cashbackUpgradeNavigationDelegate");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(cashbackDisclaimerBottomDialogProvider, "cashbackDisclaimerBottomDialogProvider");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsNavigationFactory, "revPointsNavigationFactory");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(proOnboardingCommandFactory, "proOnboardingCommandFactory");
        Intrinsics.checkNotNullParameter(staysFeatureEntryPointCommandFactory, "staysFeatureEntryPointCommandFactory");
        this.f279094p = cashbackInteractor;
        this.f279095q = cashbackHomeRepository;
        this.f279096r = pricingPlanInteractor;
        this.f279097s = freelancerInteractor;
        this.f279098t = travelHotelsCashbackInteractor;
        this.u = creditCardProductInteractor;
        this.v = creditCardEntryPointDetailsInteractor;
        this.f279099w = cashbackTransactionsFilterProvider;
        this.f279100x = transactionsContentProvider;
        this.f279101y = cashbackUpgradeNavigationDelegate;
        this.z = bottomExpandableDialogControllerExtension;
        this.A = cashbackDisclaimerBottomDialogProvider;
        this.B = revPointsAvailabilityInteractor;
        this.C = revPointsNavigationFactory;
        this.D = revPointsOptInInteractor;
        this.E = proOnboardingCommandFactory;
        this.F = staysFeatureEntryPointCommandFactory;
        Boolean bool = (Boolean) cashbackHomeRepository.f143048a.T2("STORAGE_KEY_UPGRADE_CARD", Boolean.TYPE);
        this.G = new i(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), bool != null ? bool.booleanValue() : false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false);
    }

    public static final jha.c y2(e0 e0Var, List list, kotlin.jvm.internal.h0 h0Var) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((Boolean) h0Var.invoke(next)).booleanValue()) {
                break;
            }
        }
        hha.d dVar = (hha.d) next;
        if (dVar != null) {
            return dVar.o;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(ud3.e0 r6, uc3.d r7, gim.c r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud3.e0.z2(ud3.e0, uc3.d, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        int i = 26;
        l2(new w0(this, null), new yi5.b(i));
        l2(new u07.b(this, continuation, 27), new yi5.b(i));
        bd3.a aVar = this.f279094p;
        yji.l.a1(this, rd0.e.b(aVar.e()), null, null, new z(this, continuation, 4), 3);
        yji.l.a1(this, rd0.e.b(nim.a.w(bd3.a.d(aVar), new u8c.c(29))), null, null, new z(this, continuation, 5), 3);
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(this, rd0.e.b(nim.a.w(aVar.c(hVar), new bbh.a(12))), null, null, new z(this, continuation, 6), 3);
        ffk.t tVar = this.f279096r;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        yji.l.a1(this, rd0.e.b(nim.a.w(u1.d(tVar.o(), tVar.n()), new ebi.i(12))), null, null, new z(this, continuation, 7), 3);
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        yji.l.a1(this, rd0.e.b(nim.a.w(u1.d(tVar.o(), tVar.n()), new ebi.i(13))), null, null, new z(this, continuation, 8), 3);
        yji.l.a1(this, rd0.e.b(nim.a.w(tVar.n(), new m(0))), null, null, new z(this, continuation, 9), 3);
        yji.l.a1(this, rd0.e.b(nim.a.w(aVar.c(hVar), new bbh.a(11))), null, null, new z(this, continuation, 10), 3);
        yji.l.a1(this, aVar.f(hVar), null, null, new z(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(tVar.q()), null, null, new z(this, continuation, 1), 3);
        if (((i) t2()).f279111n) {
            yji.l.a1(this, rd0.e.b(((nyb.o) this.D).f(true)), null, null, new z(this, continuation, 2), 3);
        } else {
            x2(new m(1));
        }
        yji.l.a1(this, rd0.e.b(pd.b.r(aVar.e(), new u6b.k(this, 29))), null, null, new z(this, continuation, 3), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.G;
    }
}
