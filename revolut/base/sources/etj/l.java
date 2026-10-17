package etj;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import dx4.y;
import e54.p;
import ewh.v;
import ff4.b0;
import fg8.g0;
import ft3.h1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f129429w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f129430x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f129431y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 22;
        this.f129430x = bVar;
        this.f129429w = obj2;
        this.f129431y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l((List) this.f129430x, (o) this.f129431y, continuation, 0);
                lVar.f129429w = obj2;
                return lVar;
            case 1:
                return new l((eve.b) this.f129429w, (String) this.f129430x, (yte.n) this.f129431y, continuation, 1);
            case 2:
                return new l((eve.b) this.f129429w, (String) this.f129430x, (aue.c) this.f129431y, continuation, 2);
            case 3:
                return new l((eve.b) this.f129429w, (String) this.f129430x, (String) this.f129431y, continuation, 3);
            case 4:
                l lVar2 = new l((com.revolut.feature.card_add_to_googlepay.impl.a) this.f129431y, continuation, 4);
                lVar2.f129429w = obj2;
                return lVar2;
            case 5:
                return new l(continuation, (ewa.e) this.f129429w, (String) this.f129430x, (String) this.f129431y);
            case 6:
                l lVar3 = new l((v) this.f129430x, (String) this.f129431y, continuation, 6);
                lVar3.f129429w = obj2;
                return lVar3;
            case 7:
                return new l((com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) this.f129429w, (dj0.d) this.f129430x, (Long) this.f129431y, continuation, 7);
            case 8:
                return new l((String) this.f129429w, (f0a.c) this.f129430x, (zm3.a) this.f129431y, continuation, 8);
            case 9:
                return new l((f33.h) this.f129429w, (d93.b) this.f129430x, (d93.b) this.f129431y, continuation, 9);
            case 10:
                return new l((f44.c) this.f129429w, (h1) this.f129430x, (mv3.i) this.f129431y, continuation, 10);
            case 11:
                return new l((String) this.f129429w, (f92.b) this.f129430x, (f92.g) this.f129431y, continuation, 11);
            case 12:
                return new l((f92.g) this.f129429w, (String) this.f129430x, (String) this.f129431y, continuation, 12);
            case 13:
                l lVar4 = new l((GlobalSearchContext) this.f129430x, (fa7.e) this.f129431y, continuation, 13);
                lVar4.f129429w = obj2;
                return lVar4;
            case 14:
                return new l((fe8.i) this.f129429w, (String) this.f129430x, (vd8.b) this.f129431y, continuation, 14);
            case 15:
                return new l((b0) this.f129429w, (y) this.f129430x, (p) this.f129431y, continuation, 15);
            case 16:
                l lVar5 = new l((fg0.e) this.f129431y, continuation, 16);
                lVar5.f129429w = obj2;
                return lVar5;
            case 17:
                return new l((fg8.m) this.f129430x, (String) this.f129431y, continuation, 17);
            case 18:
                return new l((g0) this.f129429w, (jf0.c) this.f129430x, (String) this.f129431y, continuation, 18);
            case 19:
                return new l((g0) this.f129430x, (String) this.f129431y, continuation, 19);
            case 20:
                return new l((com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d) this.f129429w, (String) this.f129430x, (String) this.f129431y, continuation, 20);
            case 21:
                return new l((fl8.d) this.f129430x, (String) this.f129431y, continuation, 21);
            case 22:
                return new l((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) this.f129430x, this.f129429w, (String) this.f129431y, continuation);
            case 23:
                l lVar6 = new l((fna.h) this.f129431y, continuation, 23);
                lVar6.f129429w = obj2;
                return lVar6;
            case 24:
                return new l((com.revolut.feature.payment.counterparty.impl.screen.profile.a) this.f129429w, (PaymentCounterpartyInfo) this.f129430x, (gpf.a) this.f129431y, continuation, 24);
            case 25:
                return new l((com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b) this.f129429w, (i93.i) this.f129430x, (i93.l) this.f129431y, continuation, 25);
            case 26:
                return new l((g0a.g) this.f129429w, (String) this.f129430x, (MessageItem) this.f129431y, continuation, 26);
            case 27:
                l lVar7 = new l((g0c.b) this.f129431y, continuation, 27);
                lVar7.f129429w = obj2;
                return lVar7;
            case 28:
                l lVar8 = new l((g0c.b) this.f129431y, continuation, 28);
                lVar8.f129429w = obj2;
                return lVar8;
            default:
                return new l((com.revolut.feature.topup_screen.impl.mcy.b) this.f129429w, (yki.b) this.f129430x, (h0f.f) this.f129431y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((l) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:505:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v13 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f129429w = obj2;
        this.f129430x = obj3;
        this.f129431y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f129430x = obj2;
        this.f129431y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f129431y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Continuation continuation, ewa.e eVar, String str, String str2) {
        super(2, continuation);
        this.u = 5;
        this.f129429w = eVar;
        this.f129430x = str;
        this.f129431y = str2;
    }
}
