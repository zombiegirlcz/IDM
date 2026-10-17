package sqd;

import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent.ManualConsentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tjf.l0;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f265064w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f265064w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h0((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) this.f265064w, continuation, 0);
            case 1:
                return new h0((ss4.y) this.f265064w, continuation, 1);
            case 2:
                return new h0((sw2.h) this.f265064w, continuation, 2);
            case 3:
                return new h0((com.revolut.feature.rev_points.giftcards.impl.ui.screen.downloadcards.a) this.f265064w, continuation, 3);
            case 4:
                return new h0((sxd.z) this.f265064w, continuation, 4);
            case 5:
                return new h0((sxi.q) this.f265064w, continuation, 5);
            case 6:
                return new h0((com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a) this.f265064w, continuation, 6);
            case 7:
                return new h0((szb.j) this.f265064w, continuation, 7);
            case 8:
                return new h0((t05.x) this.f265064w, continuation, 8);
            case 9:
                return new h0((t0e.l) this.f265064w, continuation, 9);
            case 10:
                return new h0((ManualConsentScreen) this.f265064w, continuation, 10);
            case 11:
                return new h0((t20.n) this.f265064w, continuation, 11);
            case 12:
                return new h0((t44.p) this.f265064w, continuation, 12);
            case 13:
                return new h0((t48.y) this.f265064w, continuation, 13);
            case 14:
                return new h0((t50.u) this.f265064w, continuation, 14);
            case 15:
                return new h0((t72.m) this.f265064w, continuation, 15);
            case 16:
                return new h0((c84.c) this.f265064w, continuation, 16);
            case 17:
                return new h0((com.revolut.feature.subaccount.impl.ui.qr_link.a) this.f265064w, continuation, 17);
            case 18:
                return new h0((t9e.w) this.f265064w, continuation, 18);
            case 19:
                return new h0((ta4.j) this.f265064w, continuation, 19);
            case 20:
                return new h0((com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a) this.f265064w, continuation, 20);
            case 21:
                return new h0((com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) this.f265064w, continuation, 21);
            case 22:
                return new h0((tf9.f) this.f265064w, continuation, 22);
            case 23:
                return new h0((com.revolut.feature.credit.application.plugins.impl.ui.product_articles.a) this.f265064w, continuation, 23);
            case 24:
                return new h0((com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.a) this.f265064w, continuation, 24);
            case 25:
                return new h0((th6.h) this.f265064w, continuation, 25);
            case 26:
                return new h0((th9.v) this.f265064w, continuation, 26);
            case 27:
                return new h0((tic.d) this.f265064w, continuation, 27);
            case 28:
                return new h0((tjc.f) this.f265064w, continuation, 28);
            default:
                return new h0((l0) this.f265064w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:301:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:437:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:438:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v52, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v71, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sqd.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
