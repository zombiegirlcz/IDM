package n1g;

import ahe.y0;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lfg.d0;
import nyb.m0;
import vkm.t0;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends jki.g implements f {
    public static final /* synthetic */ int z = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelExperiencesBookingDetailsScreenContract$InputData f211341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f211342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c1g.h f211343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hyf.a f211344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f211345t;
    public final com.revolut.feature.rev_points.api.navigation.a u;
    public final a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m0 f211346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r10.f f211347x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f211348y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jki.p stateMapper, TravelExperiencesBookingDetailsScreenContract$InputData inputData, j60.a bottomDialog, c1g.h bookingInteractor, hyf.a experiencesFeatureInteractor, v bookingSuccessDialogFactory, com.revolut.feature.rev_points.api.navigation.a revPointsNavigationFactory, a0 bookingTransactionsExtension, m0 revPointsTransactionsInteractor, r10.f dropOffInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(bookingInteractor, "bookingInteractor");
        Intrinsics.checkNotNullParameter(experiencesFeatureInteractor, "experiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(bookingSuccessDialogFactory, "bookingSuccessDialogFactory");
        Intrinsics.checkNotNullParameter(revPointsNavigationFactory, "revPointsNavigationFactory");
        Intrinsics.checkNotNullParameter(bookingTransactionsExtension, "bookingTransactionsExtension");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(dropOffInteractor, "dropOffInteractor");
        this.f211341p = inputData;
        this.f211342q = bottomDialog;
        this.f211343r = bookingInteractor;
        this.f211344s = experiencesFeatureInteractor;
        this.f211345t = bookingSuccessDialogFactory;
        this.u = revPointsNavigationFactory;
        this.v = bookingTransactionsExtension;
        this.f211346w = revPointsTransactionsInteractor;
        this.f211347x = dropOffInteractor;
        this.f211348y = new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(n1g.r r4, nii.n1 r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof n1g.i
            if (r0 == 0) goto L13
            r0 = r6
            n1g.i r0 = (n1g.i) r0
            int r1 = r0.f211331x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211331x = r1
            goto L18
        L13:
            n1g.i r0 = new n1g.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211331x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n1g.r r4 = r0.u
            yhm.o.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            boolean r5 = r5 instanceof nii.m1
            if (r5 == 0) goto L5a
            com.revolut.feature.rev_points.api.navigation.a r5 = r4.u
            com.revolut.feature.rev_points.models.RevPointsOptInSource$Experiences r6 = com.revolut.feature.rev_points.models.RevPointsOptInSource.Experiences.f83990a
            ufm.i r5 = com.revolut.feature.rev_points.api.navigation.a.a(r5, r6)
            r0.u = r4
            r0.f211331x = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r5.<init>(r6)
            r4.C1(r5)
        L5a:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n1g.r.y2(n1g.r, nii.n1, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        TravelExperiencesBookingDetailsScreenContract$InputData travelExperiencesBookingDetailsScreenContract$InputData = this.f211341p;
        String str = travelExperiencesBookingDetailsScreenContract$InputData.f93018a;
        c1g.h hVar = this.f211343r;
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(hVar.a(str, false), new y0(continuation, this, 17)), null, null, new l(this, continuation, 1), 3);
        String bookingId = travelExperiencesBookingDetailsScreenContract$InputData.f93018a;
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        j0g.j jVar = hVar.f20486a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        w4l.f fVar = jVar.i;
        w4l.i iVar = w4l.i.f294643c;
        yji.l.a1(this, xam.a.h(new n(this, continuation, 1), new d0(vkm.q.q(rd0.e.b(fVar.e(bookingId, iVar))), 14)), null, null, new l(this, continuation, 2), 3);
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        jVar.getClass();
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        yji.l.a1(this, new t0(mo3.a.f(u0.m(new lkf.v(rd0.e.b(jVar.i.e(bookingId, iVar)), this, 29), new v1(new mpd.p(this, continuation, 23))), new n0c.v(2), new mgh.i(this, 14), new n0c.v(3)), 1), null, null, new l(this, continuation, 0), 3);
        int i = 26;
        l2(new m(this, continuation, 0), new yi5.b(i));
        l2(new n(this, continuation, 0), new yi5.b(i));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f211348y;
    }
}
