package c34;

import cam.t;
import cc7.l;
import ccb.c0;
import cdh.j;
import chj.u0;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import com.revolut.feature.credit.application.plugins.impl.ui.form.FormFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$Step;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature_move_money.impl.interactor.MoveMoneyBalanceSyncWorker;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import dej.k;
import dej.m1;
import ft3.h1;
import gim.i;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import mri.v;
import oki.g;
import rp0.z;
import xl2.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f20869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f20870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f20871y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f20870x = obj2;
        this.f20869w = str;
        this.f20871y = obj3;
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r10v26, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v10, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.u] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((e) this.f20870x, (h1) this.f20871y, (String) this.f20869w, continuation, 0);
            case 1:
                return new d(1, (com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b) this.f20870x, (String) this.f20871y, (String) this.f20869w, continuation);
            case 2:
                return new d((com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) this.f20870x, (DeFiExchangeOrderDraft) this.f20871y, (String) this.f20869w, continuation, 2);
            case 3:
                return new d(3, (f) this.f20870x, (nd0.c) this.f20871y, (String) this.f20869w, continuation);
            case 4:
                return new d((f) this.f20869w, continuation, 4);
            case 5:
                d dVar = new d((v) this.f20871y, (MoveMoneyBalanceSyncWorker) this.f20869w, continuation, 5);
                dVar.f20870x = obj2;
                return dVar;
            case 6:
                return new d(6, (ca8.a) this.f20870x, (List) this.f20871y, (String) this.f20869w, continuation);
            case 7:
                return new d((t) this.f20870x, (String) this.f20869w, (Function1) this.f20871y, continuation);
            case 8:
                return new d(8, (t) this.f20870x, (Map) this.f20871y, (String) this.f20869w, continuation);
            case 9:
                return new d((qam.e) this.f20871y, (qam.b) this.f20869w, continuation, 9);
            case 10:
                return new d((cc4.c) this.f20870x, (m90.b) this.f20871y, (FormFlowContract$Step) this.f20869w, continuation, 10);
            case 11:
                d dVar2 = new d((c0) this.f20869w, continuation, 11);
                dVar2.f20871y = obj2;
                return dVar2;
            case 12:
                return new d((Function3) this.f20870x, (String) this.f20869w, (h0) this.f20871y, continuation);
            case 13:
                d dVar3 = new d((j) this.f20869w, continuation, 13);
                dVar3.f20871y = obj2;
                return dVar3;
            case 14:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d) this.f20870x, (MortgageOfferFlowContract$Step) this.f20871y, (g) this.f20869w, continuation, 14);
            case 15:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d) this.f20870x, (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a) this.f20871y, (g) this.f20869w, continuation, 15);
            case 16:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d) this.f20870x, (MortgageOfferFlowContract$OfferUpdateContext) this.f20871y, (String) this.f20869w, continuation, 16);
            case 17:
                return new d(17, (chj.g) this.f20870x, (m1) this.f20871y, (String) this.f20869w, continuation);
            case 18:
                return new d((u0) this.f20870x, (EsimDataPlan) this.f20871y, (k) this.f20869w, continuation, 18);
            case 19:
                d dVar4 = new d((Ref$BooleanRef) this.f20871y, (Function3) this.f20869w, continuation);
                dVar4.f20870x = obj2;
                return dVar4;
            case 20:
                return new d((com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f20870x, (ProductAccountDescriptor$Value) this.f20871y, (sfe.i) this.f20869w, continuation, 20);
            case 21:
                d dVar5 = new d((Flow) this.f20871y, (com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f20869w, continuation, 21);
                dVar5.f20870x = obj2;
                return dVar5;
            case 22:
                return new d(22, (cj1.c) this.f20870x, (String) this.f20871y, (String) this.f20869w, continuation);
            case 23:
                return new d((cj1.k) this.f20870x, (Address) this.f20871y, (AddressFormat) this.f20869w, continuation, 23);
            case 24:
                return new d((com.revolut.feature.shops.impl.ui.details.a) this.f20871y, (TermsScope) this.f20869w, continuation, 24);
            case 25:
                return new d((com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a) this.f20871y, (String) this.f20869w, continuation, 25);
            case 26:
                d dVar6 = new d((crf.k) this.f20871y, (kse.a) this.f20869w, continuation, 26);
                dVar6.f20870x = obj2;
                return dVar6;
            case 27:
                return new d((Function1) this.f20870x, (cta.c) this.f20871y, (String) this.f20869w, continuation);
            case 28:
                return new d((z) this.f20870x, (com.revolut.feature.kyc.impl.f) this.f20871y, (wi0.b) this.f20869w, continuation, 28);
            default:
                return new d((cua.a) this.f20870x, (l) this.f20871y, (ProducerScope) this.f20869w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:388:0x0866, code lost:
    
        if (skm.k0.b(500, r15) == r1) goto L389;
     */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06c4  */
    /* JADX WARN: Type inference failed for: r0v97, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r1v76, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r4v17, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.u] */
    /* JADX WARN: Type inference failed for: r4v54, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 2518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c34.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(t tVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.f20870x = tVar;
        this.f20869w = str;
        this.f20871y = (u) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f20870x = obj2;
        this.f20871y = obj3;
        this.f20869w = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f20871y = obj2;
        this.f20869w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f20869w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Function1 function1, cta.c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 27;
        this.f20870x = (i) function1;
        this.f20871y = cVar;
        this.f20869w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Function3 function3, String str, h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 12;
        this.f20870x = (i) function3;
        this.f20869w = str;
        this.f20871y = h0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Ref$BooleanRef ref$BooleanRef, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.u = 19;
        this.f20871y = ref$BooleanRef;
        this.f20869w = (i) function3;
    }
}
