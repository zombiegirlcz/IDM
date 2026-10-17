package sbb;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.feature.transport.impl.data.TransportService;
import com.revolut.feature.transport.models.TransportLocation;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f261561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f261562x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261561w = obj2;
        this.f261562x = obj3;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            suf.h hVar = (suf.h) this.f261561w;
            TransportService transportService = hVar.f265753a;
            cvf.a0 a0Var = (cvf.a0) this.f261562x;
            String strB = hVar.f.b("TRANSIT_IDEMPOTENCY_TAG");
            this.v = 1;
            obj2 = transportService.postAsyncTransitTicketPurchase(a0Var, strB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return ((cvf.a) obj2).getPurchasedTicketIds();
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        wli.x xVar = ((sv7.c) this.f261561w).f265848l;
        String str = ((com.revolut.feature.insurance_embedded.impl.data.model.y) ((com.revolut.feature.insurance_embedded.impl.data.model.v) this.f261562x)).f76039b;
        lg0.a aVar2 = lg0.a.OPEN_BROWSER;
        this.v = 1;
        Object objX1 = lg0.b.x1(xVar, str, aVar2, null, this, 4);
        return objX1 == aVar ? aVar : objX1;
    }

    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.card_design.impl.card_design.carousel.e eVar = (com.revolut.feature.card_design.impl.card_design.carousel.e) this.f261561w;
            com.revolut.feature.card_design.impl.card_design.carousel.c cVar = new com.revolut.feature.card_design.impl.card_design.carousel.c(eVar, (hx2.h) this.f261562x, null);
            this.v = 1;
            if (eVar.p2(this, cVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w((x) this.f261562x, continuation, 0);
                wVar.f261561w = obj2;
                return wVar;
            case 1:
                return new w((sc7.j) this.f261561w, (jq9.t) this.f261562x, continuation, 1);
            case 2:
                return new w((sc7.j) this.f261561w, (jq9.k) this.f261562x, continuation, 2);
            case 3:
                w wVar2 = new w((scc.j) this.f261562x, continuation, 3);
                wVar2.f261561w = obj2;
                return wVar2;
            case 4:
                return new w((ogm.i) this.f261561w, (qua.p) this.f261562x, continuation, 4);
            case 5:
                return new w((com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.a) this.f261561w, (udk.h) this.f261562x, continuation, 5);
            case 6:
                return new w((se1.i) this.f261561w, (xi0.b) this.f261562x, continuation, 6);
            case 7:
                w wVar3 = new w((se4.o) this.f261562x, continuation, 7);
                wVar3.f261561w = obj2;
                return wVar3;
            case 8:
                return new w((sf9.g) this.f261561w, (Biller) this.f261562x, continuation, 8);
            case 9:
                return new w((sf9.g) this.f261561w, (String) this.f261562x, continuation, 9);
            case 10:
                w wVar4 = new w((aah.g) this.f261562x, continuation, 10);
                wVar4.f261561w = obj2;
                return wVar4;
            case 11:
                return new w((si5.b) this.f261561w, (bi5.c) this.f261562x, continuation, 11);
            case 12:
                return new w((sij.d) this.f261561w, (EsimProfile) this.f261562x, continuation, 12);
            case 13:
                w wVar5 = new w((sj6.f) this.f261562x, continuation, 13);
                wVar5.f261561w = obj2;
                return wVar5;
            case 14:
                return new w((sl5.h) this.f261561w, (String) this.f261562x, continuation, 14);
            case 15:
                return new w((slj.k) this.f261561w, (String) this.f261562x, continuation, 15);
            case 16:
                return new w((smd.u) this.f261561w, (LinkedHashSet) this.f261562x, continuation, 16);
            case 17:
                return new w((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) this.f261561w, (String) this.f261562x, continuation, 17);
            case 18:
                return new w((sne.g) this.f261561w, (TaxExemptionAggregate) this.f261562x, continuation, 18);
            case 19:
                return new w((snk.r) this.f261561w, (String) this.f261562x, continuation, 19);
            case 20:
                return new w((com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a) this.f261561w, (qua.p) this.f261562x, continuation, 20);
            case 21:
                return new w((rul.e) this.f261561w, (String) this.f261562x, continuation, 21);
            case 22:
                return new w((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) this.f261561w, (wi0.b) this.f261562x, continuation, 22);
            case 23:
                return new w((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) this.f261561w, (dqd.m) this.f261562x, continuation, 23);
            case 24:
                return new w((com.revolut.feature.transfer_reasons.impl.flow.refund.b) this.f261561w, (ptf.f) this.f261562x, continuation, 24);
            case 25:
                return new w((suf.h) this.f261561w, (TransportLocation) this.f261562x, continuation, 25);
            case 26:
                return new w((suf.h) this.f261561w, (cvf.a0) this.f261562x, continuation, 26);
            case 27:
                return new w((sv7.c) this.f261561w, (com.revolut.feature.insurance_embedded.impl.data.model.v) this.f261562x, continuation, 27);
            case 28:
                return new w((com.revolut.feature.card_design.impl.card_design.carousel.e) this.f261561w, (hx2.h) this.f261562x, continuation, 28);
            default:
                w wVar6 = new w((com.revolut.feature.card_design.impl.card_design.carousel.e) this.f261562x, continuation, 29);
                wVar6.f261561w = obj2;
                return wVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((w) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((w) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0657 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:536:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:546:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v167, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v169, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sbb.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261562x = obj2;
    }
}
