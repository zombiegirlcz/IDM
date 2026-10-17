package gca;

import hh6.p;
import hs4.o;
import htf.r;
import hw1.u;
import i6f.u0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f142388w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f142388w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l((m) this.f142388w, continuation, 0);
            case 1:
                return new l((com.revolut.feature.revolutpay.shared.ui.add_payment_method.c) this.f142388w, continuation, 1);
            case 2:
                return new l((gjh.e) this.f142388w, continuation, 2);
            case 3:
                return new l((gn6.j) this.f142388w, continuation, 3);
            case 4:
                return new l((gp4.e) this.f142388w, continuation, 4);
            case 5:
                return new l((com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a) this.f142388w, continuation, 5);
            case 6:
                return new l((gqh.e) this.f142388w, continuation, 6);
            case 7:
                return new l((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) this.f142388w, continuation, 7);
            case 8:
                return new l((com.revolut.feature.topup_screen.impl.flow.init_top_up.a) this.f142388w, continuation, 8);
            case 9:
                return new l((com.revolut.feature.topup_screen.impl.mcy.account_verification.c) this.f142388w, continuation, 9);
            case 10:
                return new l((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a) this.f142388w, continuation, 10);
            case 11:
                return new l((h64.c) this.f142388w, continuation, 11);
            case 12:
                return new l((com.revolut.feature.pockets.impl.details_v2.pocket_details.a) this.f142388w, continuation, 12);
            case 13:
                return new l((com.revolut.feature.retail.salary_account.impl.salary_hub.a) this.f142388w, continuation, 13);
            case 14:
                return new l((p) this.f142388w, continuation, 14);
            case 15:
                return new l((ho8.j) this.f142388w, continuation, 15);
            case 16:
                return new l((o) this.f142388w, continuation, 16);
            case 17:
                return new l((r) this.f142388w, continuation, 17);
            case 18:
                return new l((u) this.f142388w, continuation, 18);
            case 19:
                return new l((hzb.i) this.f142388w, continuation, 19);
            case 20:
                return new l((com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.a) this.f142388w, continuation, 20);
            case 21:
                return new l((com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) this.f142388w, continuation, 21);
            case 22:
                return new l((com.revolut.feature.masav.impl.ui.review.a) this.f142388w, continuation, 22);
            case 23:
                return new l((u0) this.f142388w, continuation, 23);
            case 24:
                return new l((afa.u) this.f142388w, continuation, 24);
            case 25:
                return new l((com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) this.f142388w, continuation, 25);
            case 26:
                return new l((com.revolut.sso.impl.ui.consolidation.b) this.f142388w, continuation, 26);
            case 27:
                return new l((ipb.k) this.f142388w, continuation, 27);
            case 28:
                return new l((com.revolut.sso.impl.ui.signup.b) this.f142388w, continuation, 28);
            default:
                return new l((com.revolut.feature.sca_prompt.impl.flow.b) this.f142388w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (r1 == r0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r19v1, types: [com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.BillingAddress] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gca.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
