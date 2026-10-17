package iw6;

import a83.o0;
import androidx.lifecycle.LifecycleOwnerKt;
import ard.c0;
import com.feature.navigation.hub.impl.network.NavigationHubService;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.defi.currency.impl.data.network.DeFiCurrencyService;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsContract$InputData;
import com.revolut.feature.transport.impl.common.TransportHubLocation;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreenContract$Context;
import com.revolut.ui_kit.card_scene.CardDesignProxyCarouselView;
import ecm.k0;
import ip0.v7;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jbi.b;
import jgd.x;
import jni.s;
import jv.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lfg.g0;
import mif.e0;
import nr6.b0;
import om4.y3;
import r10.t;
import skm.p0;
import vdl.c1;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.s1;
import vkm.v1;
import vkm.y;
import vkm.z1;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f168978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f168979x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f168980y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f168980y = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                l lVar = new l((Continuation) obj4, (m) this.f168980y, 0);
                lVar.f168978w = (FlowCollector) obj2;
                lVar.f168979x = obj3;
                return lVar.invokeSuspend(Unit.f186387a);
            case 1:
                l lVar2 = new l((Continuation) obj4, (com.revolut.feature_crypto_picker.impl.ui.picker.a) this.f168980y, 1);
                lVar2.f168978w = (FlowCollector) obj2;
                lVar2.f168979x = obj3;
                return lVar2.invokeSuspend(Unit.f186387a);
            case 2:
                l lVar3 = new l((j23.o) this.f168980y, (Continuation) obj4, 2);
                lVar3.f168978w = (FlowCollector) obj2;
                lVar3.f168979x = (Throwable) obj3;
                return lVar3.invokeSuspend(Unit.f186387a);
            case 3:
                l lVar4 = new l((Continuation) obj4, (j27.j) this.f168980y, 3);
                lVar4.f168978w = (FlowCollector) obj2;
                lVar4.f168979x = obj3;
                return lVar4.invokeSuspend(Unit.f186387a);
            case 4:
                l lVar5 = new l((j36.e) this.f168980y, (Continuation) obj4, 4);
                lVar5.f168979x = (Set) obj3;
                return lVar5.invokeSuspend(Unit.f186387a);
            case 5:
                l lVar6 = new l((Continuation) obj4, (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) this.f168980y, 5);
                lVar6.f168978w = (FlowCollector) obj2;
                lVar6.f168979x = obj3;
                return lVar6.invokeSuspend(Unit.f186387a);
            case 6:
                l lVar7 = new l((Continuation) obj4, (j78.g) this.f168980y, 6);
                lVar7.f168978w = (FlowCollector) obj2;
                lVar7.f168979x = obj3;
                return lVar7.invokeSuspend(Unit.f186387a);
            case 7:
                l lVar8 = new l((Continuation) obj4, (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a) this.f168980y, 7);
                lVar8.f168978w = (FlowCollector) obj2;
                lVar8.f168979x = obj3;
                return lVar8.invokeSuspend(Unit.f186387a);
            case 8:
                l lVar9 = new l((Continuation) obj4, (j87.j) this.f168980y, 8);
                lVar9.f168978w = (FlowCollector) obj2;
                lVar9.f168979x = obj3;
                return lVar9.invokeSuspend(Unit.f186387a);
            case 9:
                l lVar10 = new l((Continuation) obj4, (j96.l) this.f168980y, 9);
                lVar10.f168978w = (FlowCollector) obj2;
                lVar10.f168979x = obj3;
                return lVar10.invokeSuspend(Unit.f186387a);
            case 10:
                l lVar11 = new l((ja.b) this.f168980y, (Continuation) obj4, 10);
                lVar11.f168979x = (String) obj3;
                return lVar11.invokeSuspend(Unit.f186387a);
            case 11:
                l lVar12 = new l((Continuation) obj4, (jbi.h) this.f168980y, 11);
                lVar12.f168978w = (FlowCollector) obj2;
                lVar12.f168979x = obj3;
                return lVar12.invokeSuspend(Unit.f186387a);
            case 12:
                l lVar13 = new l((Continuation) obj4, (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) this.f168980y, 12);
                lVar13.f168978w = (FlowCollector) obj2;
                lVar13.f168979x = obj3;
                return lVar13.invokeSuspend(Unit.f186387a);
            case 13:
                l lVar14 = new l((Continuation) obj4, (jd7.l) this.f168980y, 13);
                lVar14.f168978w = (FlowCollector) obj2;
                lVar14.f168979x = obj3;
                return lVar14.invokeSuspend(Unit.f186387a);
            case 14:
                l lVar15 = new l((Continuation) obj4, (com.revolut.feature.retail.reverywhere.impl.web_app.d) this.f168980y, 14);
                lVar15.f168978w = (FlowCollector) obj2;
                lVar15.f168979x = obj3;
                return lVar15.invokeSuspend(Unit.f186387a);
            case 15:
                l lVar16 = new l((Continuation) obj4, (x) this.f168980y, 15);
                lVar16.f168978w = (FlowCollector) obj2;
                lVar16.f168979x = obj3;
                return lVar16.invokeSuspend(Unit.f186387a);
            case 16:
                l lVar17 = new l((Continuation) obj4, (jh9.p) this.f168980y, 16);
                lVar17.f168978w = (FlowCollector) obj2;
                lVar17.f168979x = obj3;
                return lVar17.invokeSuspend(Unit.f186387a);
            case 17:
                l lVar18 = new l((Continuation) obj4, (jie.f) this.f168980y, 17);
                lVar18.f168978w = (FlowCollector) obj2;
                lVar18.f168979x = obj3;
                return lVar18.invokeSuspend(Unit.f186387a);
            case 18:
                l lVar19 = new l((Continuation) obj4, (jig.e) this.f168980y, 18);
                lVar19.f168978w = (FlowCollector) obj2;
                lVar19.f168979x = obj3;
                return lVar19.invokeSuspend(Unit.f186387a);
            case 19:
                l lVar20 = new l((Continuation) obj4, (com.revolut.feature.credit.autopay.ui.screen.amount.input.b) this.f168980y, 19);
                lVar20.f168978w = (FlowCollector) obj2;
                lVar20.f168979x = obj3;
                return lVar20.invokeSuspend(Unit.f186387a);
            case 20:
                l lVar21 = new l((Continuation) obj4, (jmh.c) this.f168980y, 20);
                lVar21.f168978w = (FlowCollector) obj2;
                lVar21.f168979x = obj3;
                return lVar21.invokeSuspend(Unit.f186387a);
            case 21:
                l lVar22 = new l((Continuation) obj4, (jnb.p) this.f168980y, 21);
                lVar22.f168978w = (FlowCollector) obj2;
                lVar22.f168979x = obj3;
                return lVar22.invokeSuspend(Unit.f186387a);
            case 22:
                l lVar23 = new l((Continuation) obj4, (s) this.f168980y, 22);
                lVar23.f168978w = (FlowCollector) obj2;
                lVar23.f168979x = obj3;
                return lVar23.invokeSuspend(Unit.f186387a);
            case 23:
                l lVar24 = new l((Continuation) obj4, (jq.g) this.f168980y, 23);
                lVar24.f168978w = (FlowCollector) obj2;
                lVar24.f168979x = obj3;
                return lVar24.invokeSuspend(Unit.f186387a);
            case 24:
                l lVar25 = new l((Continuation) obj4, (com.revolut.feature.vaults.impl.ui.details.terms_viewer.a) this.f168980y, 24);
                lVar25.f168978w = (FlowCollector) obj2;
                lVar25.f168979x = obj3;
                return lVar25.invokeSuspend(Unit.f186387a);
            case 25:
                l lVar26 = new l((Continuation) obj4, (js7.d) this.f168980y, 25);
                lVar26.f168978w = (FlowCollector) obj2;
                lVar26.f168979x = obj3;
                return lVar26.invokeSuspend(Unit.f186387a);
            case 26:
                l lVar27 = new l((Continuation) obj4, (juk.h) this.f168980y, 26);
                lVar27.f168978w = (FlowCollector) obj2;
                lVar27.f168979x = obj3;
                return lVar27.invokeSuspend(Unit.f186387a);
            case 27:
                l lVar28 = new l((Continuation) obj4, (r) this.f168980y, 27);
                lVar28.f168978w = (FlowCollector) obj2;
                lVar28.f168979x = obj3;
                return lVar28.invokeSuspend(Unit.f186387a);
            case 28:
                l lVar29 = new l((Continuation) obj4, (jwf.n) this.f168980y, 28);
                lVar29.f168978w = (FlowCollector) obj2;
                lVar29.f168979x = obj3;
                return lVar29.invokeSuspend(Unit.f186387a);
            default:
                l lVar30 = new l((Continuation) obj4, (CardDesignProxyCarouselView) this.f168980y, 29);
                lVar30.f168978w = (FlowCollector) obj2;
                lVar30.f168979x = obj3;
                return lVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v145, types: [android.widget.FrameLayout, jxl.a] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        h36.a aVar;
        Object currencies;
        Flow flowV;
        akg.n nVarV;
        k0 k0Var;
        Object navigationHubContent;
        Flow flowV2;
        ie7.h hVar;
        Flow flowC;
        Flow flowV3;
        Flow flowA;
        Flow flowA2;
        int i = this.u;
        int i2 = 24;
        s1 s1Var = s1.f290118a;
        int i3 = 7;
        int i5 = 5;
        int i6 = 15;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i21 = 0;
        int i22 = 3;
        int i32 = 2;
        Object obj3 = this.f168980y;
        Continuation continuation = null;
        int i33 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f168978w;
                    m mVar = (m) obj3;
                    vkm.d dVarB = rd0.e.b(mVar.o.b(mVar.f168981p.f73769a, true));
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector, dVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                nw5.a aVar3 = ((com.revolut.feature_crypto_picker.impl.ui.picker.a) obj3).f96813s;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f168978w;
                    List list = (List) this.f168979x;
                    vkm.d dVarB2 = rd0.e.b(zi0.c.o(aVar3.a(list, n9l.b.SEC_3)));
                    vkm.d dVarB3 = rd0.e.b(zi0.c.o(aVar3.b(list, tzg.j.ONE_DAY)));
                    o0 o0Var = new o0(i22, 9, continuation);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    q.w(flowCollector2);
                    Object objG = e0.g(this, s1Var, new c1((Function3) o0Var, continuation, i6), flowCollector2, new Flow[]{dVarB2, dVarB3});
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj4) {
                        return obj4;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                FlowCollector flowCollector3 = (FlowCollector) this.f168978w;
                Throwable th10 = (Throwable) this.f168979x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    IllegalStateException illegalStateException = new IllegalStateException("Screen block " + ((j23.o) obj3).d + " failed: " + th10, th10);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "OrderNewCardBaseScreenBuilder", null, illegalStateException, h0Var);
                    f0 f0Var = f0.f322471a;
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (flowCollector3.emit(f0Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f168978w;
                    j27.j jVar = (j27.j) obj3;
                    Flow flowT = jVar.o.t(new AcquiringOrderFilter.InitiationPageId(y0.b(jVar.f170717q.f74197a)), new b0(false), new gr6.c(loadingStrategy));
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector4, flowT, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                Set set = (Set) this.f168979x;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    DeFiCurrencyService deFiCurrencyService = ((j36.e) obj3).f170977a;
                    Intrinsics.checkNotNullParameter(set, "<this>");
                    String strK0 = d0.k0(d0.O0(set), ",", null, null, 0, null, 62);
                    this.f168979x = null;
                    aVar = h36.a.f149038a;
                    this.f168978w = aVar;
                    this.v = 1;
                    currencies = deFiCurrencyService.getCurrencies(strK0, this);
                    if (currencies == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h36.a aVar7 = (h36.a) this.f168978w;
                    yhm.o.b(obj2);
                    aVar = aVar7;
                    currencies = obj2;
                }
                aVar.getClass();
                return h36.a.a((List) currencies);
            case 5:
                com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) obj3;
                TakeProfitStopLossParams takeProfitStopLossParams = bVar.o;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f168978w;
                    Pair pair = (Pair) this.f168979x;
                    String str = (String) pair.f186385a;
                    boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                    Pair currencyPair = new Pair(takeProfitStopLossParams.f96826b, takeProfitStopLossParams.f96825a);
                    jx0.a aVar9 = bVar.f96995q;
                    float f = ((j3i.k) ((j2) bVar.v.f22677a).getValue()).e.f171195a;
                    qta.f selectedPeriod = qta.f.valueOf(str);
                    p0i.c side = takeProfitStopLossParams.e == wd6.e.SELL ? p0i.c.BID : p0i.c.ASK;
                    aVar9.getClass();
                    Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                    Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                    Intrinsics.checkNotNullParameter(side, "side");
                    if (zBooleanValue) {
                        vkm.d dVarB4 = rd0.e.b(aVar9.s(currencyPair, selectedPeriod, side));
                        ppk.f fVar = (ppk.f) aVar9.f179039c;
                        int i99 = l3i.a.f191953a[side.ordinal()];
                        if (i99 == 1) {
                            nVarV = nim.a.v(nim.a.v(rd0.e.b(fVar.c(u.c(currencyPair), n9l.b.SEC_3)), new l2d.a(i6)), new l2d.a(16));
                        } else {
                            if (i99 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            nVarV = nim.a.v(rd0.e.b(fVar.d(u.c(currencyPair), n9l.b.SEC_3)), new l2d.a(17));
                        }
                        flowV = new t38.e(dVarB4, i2, nVarV, new l3i.b(aVar9, f, null));
                    } else {
                        flowV = nim.a.v(rd0.e.b(mo3.a.n(aVar9.s(currencyPair, selectedPeriod, side))), new j3i.n(aVar9, f, i33));
                    }
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    q.w(flowCollector5);
                    Object objCollect = flowV.collect(new ahd.b(flowCollector5, str, 19), this);
                    if (objCollect != aVar8) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar8) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                j78.g gVar = (j78.g) obj3;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f168978w;
                    Flow flowF = ((Boolean) this.f168979x).booleanValue() ? mo3.a.f(q.q(((nj8.n) gVar.f171870a).k(null, w4l.i.f294643c)), j78.e.f171868a, new g17.i(gVar, i22), j78.f.f171869a) : new go.g(f0.f322471a, 2);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector6, flowF, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f168978w;
                    Flow flowA3 = ((c6b.i) ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a) obj3).o).a((w4l.k) this.f168979x);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector7, flowA3, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f168978w;
                    q0 q0VarY = v7.y("GlobalMarkersGlobeWidget", "observeGlobeHtml", ((j87.j) obj3).f172148m.b((w4l.k) this.f168979x));
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector8, q0VarY, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f168978w;
                    Pair pair2 = (Pair) this.f168979x;
                    c0 c0VarA = ((j96.l) obj3).o.a((DepositAmount) pair2.f186386b, (String) pair2.f186385a);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector9, c0VarA, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                String str2 = (String) this.f168979x;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    ja.b bVar2 = (ja.b) obj3;
                    k0Var = bVar2.f172399a;
                    NavigationHubService navigationHubService = bVar2.f172400b;
                    this.f168979x = null;
                    this.f168978w = k0Var;
                    this.v = 1;
                    navigationHubContent = navigationHubService.getNavigationHubContent(str2, this);
                    if (navigationHubContent == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k0 k0Var2 = (k0) this.f168978w;
                    yhm.o.b(obj2);
                    k0Var = k0Var2;
                    navigationHubContent = obj2;
                }
                k0Var.getClass();
                return k0.b((ia.f) navigationHubContent);
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f168978w;
                    jbi.e eVar = (jbi.e) this.f168979x;
                    if (eVar.f172640b.length() < 3) {
                        flowV2 = zi0.c.i(b.a.f172637a);
                    } else {
                        jvh.a aVar16 = ((jbi.h) obj3).f172643a;
                        pil.d params = new pil.d(eVar.f172639a, eVar.f172640b);
                        Intrinsics.checkNotNullParameter(params, "params");
                        zuh.o oVar = aVar16.f178883a;
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        flowV2 = nim.a.v(nim.a.A(rd0.e.n(oVar.i.b(params, loadingStrategy), h0.f322473a), jbi.f.f172641a), jbi.g.f172642a);
                    }
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector10, flowV2, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f168978w;
                    com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a aVar18 = (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) obj3;
                    t tVar = aVar18.f102508p;
                    PlanGiftingReceiverPickerScreenContract$Context planGiftingReceiverPickerScreenContract$Context = aVar18.o.f102504a;
                    if (planGiftingReceiverPickerScreenContract$Context instanceof PlanGiftingReceiverPickerScreenContract$Context.General) {
                        tVar.getClass();
                        akg.n nVarV2 = nim.a.v(t.j(tVar), new jcj.n(19));
                        akg.n nVarV3 = nim.a.v(t.j(tVar), new jcj.n(13));
                        vkm.d dVarN = tVar.n();
                        y21.c cVar = aVar18.f102509q;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        hVar = new ie7.h(yh5.b.h(nVarV2, nVarV3, dVarN, nim.a.v(rd0.e.b(cVar.b(SecuritySettings.BIRTHDAY_SHARING, loadingStrategy)), new jcj.n(i3)), aVar18.K2()), aVar18, 11);
                    } else {
                        if (!(planGiftingReceiverPickerScreenContract$Context instanceof PlanGiftingReceiverPickerScreenContract$Context.Birthdays)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tVar.getClass();
                        hVar = new ie7.h(yh5.b.e(nim.a.v(t.j(tVar), new j87.m(tVar, 21)), tVar.n(), aVar18.K2()), aVar18, 10);
                    }
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector11, hVar, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f168978w;
                    jd7.l lVar = (jd7.l) obj3;
                    HtmlDocumentDescriptor htmlDocumentDescriptor = lVar.o.f74752a;
                    pre.c cVar2 = lVar.f172994p;
                    if (htmlDocumentDescriptor instanceof HtmlDocumentDescriptor.TermsDocumentDescriptor) {
                        String termsId = ((HtmlDocumentDescriptor.TermsDocumentDescriptor) htmlDocumentDescriptor).f74746a;
                        cVar2.getClass();
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        sre.h hVar2 = (sre.h) cVar2.f238999a;
                        hVar2.getClass();
                        Intrinsics.checkNotNullParameter(termsId, "termsId");
                        flowC = nim.a.u(new jd7.j(lVar, continuation, i21), rd0.e.b(hVar2.f265201h.f(termsId, false)));
                    } else if (htmlDocumentDescriptor instanceof HtmlDocumentDescriptor.TermsWebDocumentDescriptor) {
                        HtmlDocumentDescriptor.TermsWebDocumentDescriptor termsWebDocumentDescriptor = (HtmlDocumentDescriptor.TermsWebDocumentDescriptor) htmlDocumentDescriptor;
                        String str3 = termsWebDocumentDescriptor.f74747a;
                        flowC = termsWebDocumentDescriptor.f74748b ? nim.a.u(new ie6.q(i32, i5, continuation), rd0.e.b(cVar2.m(str3))) : new go.g(zi0.c.P(new jd7.f(str3), false, null, 3), 2);
                    } else {
                        if (!(htmlDocumentDescriptor instanceof HtmlDocumentDescriptor.HtmlLocalFileDescriptor)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        v1 v1Var = new v1(new jd7.k(lVar, htmlDocumentDescriptor, null));
                        p0 p0Var = p0.f264001a;
                        flowC = q.C(v1Var, elm.f.f127540b);
                    }
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector12, flowC, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f168978w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f168979x;
                    efb.h hVar3 = ((com.revolut.feature.retail.reverywhere.impl.web_app.d) obj3).f82938r;
                    hVar3.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    zeb.k kVar = hVar3.f125312a;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB5 = rd0.e.b(kVar.d.e(Unit.f186387a, loadingStrategy2));
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector13, dVarB5, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f168978w;
                    List items = (List) this.f168979x;
                    d3d.g gVar2 = ((x) obj3).f173987p;
                    gVar2.getClass();
                    Intrinsics.checkNotNullParameter(items, "items");
                    efm.r rVarDefer = efm.r.defer(new h4d.d(gVar2.f111093a, i21));
                    Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
                    wkm.l lVarQ = q.Q(rd0.e.b(rVarDefer), new a32.b(continuation, items, gVar2, i2));
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector14, lVarQ, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                jh9.p pVar = (jh9.p) obj3;
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f168978w;
                    PaymentData paymentData = (PaymentData) this.f168979x;
                    t38.e eVarB = ((q12.f) pVar.f174176q).b(new ApmQuoteDirection.Outgoing(oh9.b.a(pVar.u.f78784a)), paymentData);
                    Flow flowG = ((yt9.g) pVar.f174178s).g(paymentData.f78793a, paymentData.d);
                    a32.c cVar3 = new a32.c(i22, i22, continuation);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    q.w(flowCollector15);
                    Object objG2 = e0.g(this, s1Var, new c1((Function3) cVar3, continuation, i6), flowCollector15, new Flow[]{eVarB, flowG});
                    if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                        objG2 = Unit.f186387a;
                    }
                    if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                        objG2 = Unit.f186387a;
                    }
                    if (objG2 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                jie.f fVar2 = (jie.f) obj3;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f168978w;
                    y yVarJ = fVar2.f174471b.j((md6.c) this.f168979x);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    q.w(flowCollector16);
                    Object objCollect2 = yVarJ.collect(new jie.c(flowCollector16, fVar2, 1), this);
                    if (objCollect2 != aVar22) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar22) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f168978w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f168979x;
                    vfg.r rVar = ((jig.e) obj3).o;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    g0 g0Var = rVar.f288635a;
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    vkm.d dVarB6 = rd0.e.b(g0Var.f194891l.e(Unit.f186387a, loadingStrategy3));
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector17, dVarB6, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f168978w;
                    String str4 = (String) this.f168979x;
                    if (str4 != null) {
                        flowV3 = zi0.c.i(str4);
                    } else {
                        com.revolut.feature.credit.autopay.ui.screen.amount.input.b bVar3 = (com.revolut.feature.credit.autopay.ui.screen.amount.input.b) obj3;
                        flowV3 = nim.a.v(rd0.e.b(osg.b.o(bVar3.o, bVar3.f68610q.f68604b.f115083b, null, null, null, null, 126)), jk4.p.f175085a);
                    }
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector18, flowV3, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                jmh.c cVar4 = (jmh.c) obj3;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f168978w;
                    yj1.b bVar4 = new yj1.b((yj1.d) this.f168979x);
                    akg.n nVarV4 = nim.a.v(cVar4.f176625a.a(bVar4), new ghk.x(cVar4, bVar4, i6));
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector19, nVarV4, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                jnb.p pVar2 = (jnb.p) obj3;
                ProductDocumentsContract$InputData productDocumentsContract$InputData = pVar2.o;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f168978w;
                    w4l.k loadingStrategy4 = (w4l.k) this.f168979x;
                    gnb.b bVar5 = pVar2.f176678p;
                    String challengeId = productDocumentsContract$InputData.f83336b;
                    String str5 = productDocumentsContract$InputData.f83335a;
                    if (challengeId != null) {
                        bVar5.getClass();
                        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                        ugc.a aVar27 = bVar5.f144954c;
                        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                        tjb.g gVar3 = (tjb.g) aVar27.f279998b;
                        gVar3.getClass();
                        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                        flowA = nim.a.v(u0.m(boh.f.e(gVar3.e.b(challengeId, loadingStrategy4), new gnb.a(bVar5, i33)), bVar5.a(str5)), new jn2.a(i32));
                    } else {
                        flowA = bVar5.a(str5);
                    }
                    akg.n nVarV5 = nim.a.v(u0.m(flowA, ijb.a.b(pVar2.f176679q, productDocumentsContract$InputData.f83335a)), jnb.o.f176677a);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector20, nVarV5, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f168978w;
                    Flow flowS = tz4.d.s((s) obj3, (Data) this.f168979x);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector21, flowS, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f168978w;
                    Flow gVar4 = !((Boolean) this.f168979x).booleanValue() ? new go.g(jq.a.LOGIN_REQUIRED, 2) : new jij.d(rd0.e.b(((jq.g) obj3).f177335b.b()), i3);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector22, gVar4, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) this.f168978w;
                    com.revolut.feature.vaults.impl.ui.details.terms_viewer.a aVar31 = (com.revolut.feature.vaults.impl.ui.details.terms_viewer.a) obj3;
                    vkm.d dVarB7 = rd0.e.b(aVar31.f94757p.m(aVar31.o.f94752a));
                    p0 p0Var2 = p0.f264001a;
                    Flow flowC2 = q.C(dVarB7, elm.f.f127540b);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector23, flowC2, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f168978w;
                    Flow flowE = ((y3) ((js7.d) obj3).f178152a).e((w4l.k) this.f168979x, true);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector24, flowE, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f168978w;
                    juk.h hVar4 = (juk.h) obj3;
                    qrk.c cVar5 = hVar4.o;
                    String ref2 = ((juk.e) ((j2) hVar4.f178678s.f22677a).getValue()).f178670a;
                    cVar5.getClass();
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    lrk.o oVar2 = cVar5.f248737a;
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB8 = oVar2.f.b(ref2, loadingStrategy);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector25, dVarB8, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                r rVar2 = (r) obj3;
                iv.c cVar6 = rVar2.f178726p;
                CameraKitClientSettings cameraKitClientSettings = rVar2.f178724m;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) this.f168978w;
                    uv.f fVar3 = (uv.f) this.f168979x;
                    xv.l lVar2 = fVar3.f283256a;
                    if (r.f(cameraKitClientSettings.f50706a) != null) {
                        rVar2.h();
                        cVar6.a(lVar2);
                        rVar2.f178731w = q.G(new q0(rVar2.f178718b.a(), new jl6.b(2, cVar6, iv.c.class, "next", "next(Lcom/revolut/camerakit/core/CameraKitDetectorResult;)V", 4, 3), 1), LifecycleOwnerKt.getLifecycleScope(rVar2.f178719c));
                    }
                    y yVarD = rVar2.d.d(cameraKitClientSettings.f50706a, fVar3.f283256a);
                    jv.k kVar2 = new jv.k(rVar2, fVar3, null);
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    q.w(flowCollector26);
                    Object objCollect3 = yVarD.collect(new akg.m(flowCollector26, kVar2, 5), this);
                    if (objCollect3 != aVar34) {
                        objCollect3 = Unit.f186387a;
                    }
                    if (objCollect3 != aVar34) {
                        objCollect3 = Unit.f186387a;
                    }
                    if (objCollect3 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                Object obj6 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = (FlowCollector) this.f168978w;
                    TransportHubLocation transportHubLocation = (TransportHubLocation) this.f168979x;
                    z1 z1Var = ((jwf.n) obj3).f178994t;
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    q.w(flowCollector27);
                    i52.l lVar3 = new i52.l(flowCollector27, transportHubLocation, 20);
                    z1Var.getClass();
                    Object objM = z1.m(z1Var, lVar3, this);
                    if (objM != obj6) {
                        objM = Unit.f186387a;
                    }
                    if (objM != obj6) {
                        objM = Unit.f186387a;
                    }
                    if (objM == obj6) {
                        return obj6;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                CardDesignProxyCarouselView cardDesignProxyCarouselView = (CardDesignProxyCarouselView) obj3;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i123 = this.v;
                if (i123 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector28 = (FlowCollector) this.f168978w;
                    ixl.a aVar36 = cardDesignProxyCarouselView.f107095a;
                    if (aVar36 == null || (flowA2 = aVar36.a()) == null) {
                        ?? r4 = cardDesignProxyCarouselView.f107096b;
                        flowA2 = r4 != 0 ? r4.a() : vkm.i.f290039a;
                    }
                    this.f168978w = null;
                    this.f168979x = null;
                    this.v = 1;
                    if (q.u(flowCollector28, flowA2, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i123 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f168980y = obj2;
    }
}
