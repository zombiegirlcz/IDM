package su4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import udk.z;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f265656w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f265656w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n((com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) this.f265656w, continuation, 0);
            case 1:
                return new n((com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a) this.f265656w, continuation, 1);
            case 2:
                return new n((com.revolut.feature.card_design.impl.card_design.carousel.e) this.f265656w, continuation, 2);
            case 3:
                return new n((t0l.j) this.f265656w, continuation, 3);
            case 4:
                return new n((t44.p) this.f265656w, continuation, 4);
            case 5:
                return new n((t50.u) this.f265656w, continuation, 5);
            case 6:
                return new n((com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f265656w, continuation, 6);
            case 7:
                return new n((com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a) this.f265656w, continuation, 7);
            case 8:
                return new n((com.revolut.feature.credit.application.plugins.impl.ui.product_articles.a) this.f265656w, continuation, 8);
            case 9:
                return new n((com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.a) this.f265656w, continuation, 9);
            case 10:
                return new n((tjc.f) this.f265656w, continuation, 10);
            case 11:
                return new n((tk9.j) this.f265656w, continuation, 11);
            case 12:
                return new n((tm1.h) this.f265656w, continuation, 12);
            case 13:
                return new n((com.revolut.feature.junior_rewards.impl.ui.list.a) this.f265656w, continuation, 13);
            case 14:
                return new n((tv4.o) this.f265656w, continuation, 14);
            case 15:
                return new n((com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a) this.f265656w, continuation, 15);
            case 16:
                return new n((com.revolut.feature.insurance_home.impl.ui.screen.home.a) this.f265656w, continuation, 16);
            case 17:
                return new n((com.revolut.feature.kyc.impl.ondemand.a) this.f265656w, continuation, 17);
            case 18:
                return new n((u65.i) this.f265656w, continuation, 18);
            case 19:
                return new n((u6b.l) this.f265656w, continuation, 19);
            case 20:
                return new n((com.revolut.feature.pix.impl.flow.b) this.f265656w, continuation, 20);
            case 21:
                return new n((u8d.g) this.f265656w, continuation, 21);
            case 22:
                return new n((com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c) this.f265656w, continuation, 22);
            case 23:
                return new n((com.revolut.feature.pix.impl.flow.automatico.screens.details.a) this.f265656w, continuation, 23);
            case 24:
                return new n((uai.i) this.f265656w, continuation, 24);
            case 25:
                return new n((z) this.f265656w, continuation, 25);
            case 26:
                return new n((skm.q) this.f265656w, continuation, 26);
            case 27:
                return new n((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.b) this.f265656w, continuation, 27);
            case 28:
                return new n((ugb.f) this.f265656w, continuation, 28);
            default:
                return new n((com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b) this.f265656w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0236  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su4.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
