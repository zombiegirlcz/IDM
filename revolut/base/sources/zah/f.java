package zah;

import af4.p;
import android.graphics.Bitmap;
import dh4.j;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;
import rp0.y;
import zkk.t;
import zmd.o;
import zqf.k;
import zr2.n;
import zr5.l;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f320712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f320713x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320712w = obj2;
        this.f320713x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f((g) this.f320713x, continuation, 0);
                fVar.f320712w = obj2;
                return fVar;
            case 1:
                return new f((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.a) this.f320712w, (p) this.f320713x, continuation, 1);
            case 2:
                return new f((com.revolut.feature.crypto.exchange.fees.impl.ui.c) this.f320712w, (hha.d) this.f320713x, continuation, 2);
            case 3:
                return new f((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a) this.f320712w, (j) this.f320713x, continuation, 3);
            case 4:
                f fVar2 = new f((com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b) this.f320713x, continuation, 4);
                fVar2.f320712w = obj2;
                return fVar2;
            case 5:
                f fVar3 = new f((zge.i) this.f320713x, continuation, 5);
                fVar3.f320712w = obj2;
                return fVar3;
            case 6:
                return new f((com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) this.f320712w, (String) this.f320713x, continuation, 6);
            case 7:
                return new f((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e) this.f320712w, (hha.d) this.f320713x, continuation, 7);
            case 8:
                return new f((zh3.j) this.f320712w, (rh3.a) this.f320713x, continuation, 8);
            case 9:
                return new f((zh3.j) this.f320712w, (k3l.j) this.f320713x, continuation, 9);
            case 10:
                return new f((zh6.c) this.f320712w, (String) this.f320713x, continuation, 10);
            case 11:
                return new f((zh6.c) this.f320712w, (lg6.a) this.f320713x, continuation, 11);
            case 12:
                return new f((vkm.d) this.f320712w, (zhf.a) this.f320713x, continuation, 12);
            case 13:
                return new f((vkm.d) this.f320712w, (zhf.b) this.f320713x, continuation, 13);
            case 14:
                return new f((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a) this.f320712w, (hha.d) this.f320713x, continuation, 14);
            case 15:
                return new f((t) this.f320712w, (ty0.a) this.f320713x, continuation, 15);
            case 16:
                return new f((com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.c) this.f320712w, (String) this.f320713x, continuation, 16);
            case 17:
                return new f((zm2.j) this.f320712w, (Bitmap) this.f320713x, continuation, 17);
            case 18:
                return new f((o) this.f320712w, (qua.p) this.f320713x, continuation, 18);
            case 19:
                return new f((com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) this.f320712w, (String) this.f320713x, continuation, 19);
            case 20:
                f fVar4 = new f((com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) this.f320713x, continuation, 20);
                fVar4.f320712w = obj2;
                return fVar4;
            case 21:
                return new f((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) this.f320712w, (yld.c) this.f320713x, continuation, 21);
            case 22:
                return new f((com.revolut.feature.bank_account_switching.impl.ui.review.b) this.f320712w, (List) this.f320713x, continuation, 22);
            case 23:
                return new f((com.revolut.feature.crypto.withdraw.impl.ui_v3.a) this.f320712w, (x2j.b) this.f320713x, continuation, 23);
            case 24:
                return new f((com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) this.f320712w, (dp8.b) this.f320713x, continuation, 24);
            case 25:
                return new f((com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) this.f320712w, (zp8.e) this.f320713x, continuation, 25);
            case 26:
                f fVar5 = new f((com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) this.f320713x, continuation, 26);
                fVar5.f320712w = obj2;
                return fVar5;
            case 27:
                return new f((k) this.f320712w, (kse.a) this.f320713x, continuation, 27);
            case 28:
                f fVar6 = new f((n) this.f320713x, continuation, 28);
                fVar6.f320712w = obj2;
                return fVar6;
            default:
                return new f((vkm.d) this.f320712w, (l) this.f320713x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((f) create((chj.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((f) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01df  */
    /* JADX WARN: Type inference failed for: r11v15, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zah.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320713x = obj2;
    }
}
