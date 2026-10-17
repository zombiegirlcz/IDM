package cam;

import com.revolut.retail.feature.esim.impl.service.EsimApnUpdateService;
import k50.j4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f22693x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, int i2, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = i2;
        this.f22693x = obj2;
        this.f22692w = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f22692w, 0, (t) this.f22693x, continuation);
            case 1:
                return new q(this.f22692w, 1, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) this.f22693x, continuation);
            case 2:
                return new q(this.f22692w, 2, (ew1.m) this.f22693x, continuation);
            case 3:
                return new q(3, continuation, (gc1.q) this.f22693x);
            case 4:
                return new q(this.f22692w, 4, (hk9.q) this.f22693x, continuation);
            case 5:
                return new q(this.f22692w, 5, (i84.j) this.f22693x, continuation);
            case 6:
                return new q(this.f22692w, 6, (com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a) this.f22693x, continuation);
            case 7:
                return new q(7, continuation, (j4) this.f22693x);
            case 8:
                return new q(this.f22692w, 8, (nj9.n) this.f22693x, continuation);
            case 9:
                return new q(this.f22692w, 9, (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) this.f22693x, continuation);
            case 10:
                return new q(this.f22692w, 10, (oyl.a) this.f22693x, continuation);
            case 11:
                return new q(this.f22692w, 11, (EsimApnUpdateService) this.f22693x, continuation);
            case 12:
                return new q(this.f22692w, 12, (rld.m) this.f22693x, continuation);
            case 13:
                q qVar = new q(13, continuation, (yf4.j) this.f22693x);
                qVar.f22692w = ((Number) obj2).intValue();
                return qVar;
            default:
                return new q(this.f22692w, 14, (com.revolut.trading.orders.ui.screens.investment_plan.projection.a) this.f22693x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((q) create(Integer.valueOf(((Number) obj2).intValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x026f, code lost:
    
        if ((r0.e.a().toEpochMilli() - r9.getMillis()) >= 28800000) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cam.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Continuation continuation, yji.l lVar) {
        super(2, continuation);
        this.u = i;
        this.f22693x = lVar;
    }
}
