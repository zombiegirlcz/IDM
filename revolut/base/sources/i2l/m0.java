package i2l;

import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 extends oki.h implements y {

    @NotNull
    private static final a0 Companion = new a0();
    public final TravelStatusPartnerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1l.d f158025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f158026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1l.e f158027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wli.x f158028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sfk.a f158029t;
    public final i7d.o u;
    public a2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f158030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f158031x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cli.y f158032y;

    public m0(TravelStatusPartnerScreenContract$InputData inputData, z1l.d partnerInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, z1l.e destinationProvider, wli.x deeplinkHandler, sfk.a pricingPlanChangeObservable, i7d.o helpWidgetControllerModelExtension, p0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(partnerInteractor, "partnerInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f158025p = partnerInteractor;
        this.f158026q = transactionsInteractor;
        this.f158027r = destinationProvider;
        this.f158028s = deeplinkHandler;
        this.f158029t = pricingPlanChangeObservable;
        this.u = helpWidgetControllerModelExtension;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f158031x = z1VarB;
        this.f158032y = mra.d.b(this, new q(0), stateMapper, new i(), false, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(i2l.m0 r21, a2l.n r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2l.m0.I2(i2l.m0, a2l.n, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, xam.a.h(new f0(1, this, continuation), vkm.q.Q(this.f158031x, new c0(1, this, continuation))), null, null, new f0(2, this, continuation), 3);
        String partnerId = this.o.f104322a;
        z1l.d dVar = this.f158025p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        u1l.e eVar = (u1l.e) dVar.f318897a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, eVar.d.b(partnerId, loadingStrategy), null, null, new f0(3, this, continuation), 3);
        yji.l.a1(this, rd0.e.b(this.f158029t.a()), null, null, new i0(1, this, continuation), 3);
        yji.l.a1(this, vkm.q.Q(vkm.q.q(new g4b.a0(this.f158032y.B(new i2i.o(8)), 21)), new c0(0, this, continuation)), null, null, new f0(0, this, continuation), 3);
    }

    public final void J2(String str) {
        C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(str, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
    }

    @Override // yji.l
    public final void T1(long j2) {
        cli.y yVar = this.f158032y;
        if (((q) ((j2) yVar.f22677a).getValue()).d) {
            H2(yVar, new i2i.o(9));
            n2(new i0(0, this, null), new whi.b(6));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f158032y;
    }
}
