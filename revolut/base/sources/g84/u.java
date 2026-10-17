package g84;

import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$OutputData;
import ft3.a1;
import ft3.d1;
import ft3.h1;
import grl.r2;
import ix6.a0;
import java.util.Map;
import k4l.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f141278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f141279x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f141280y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = 3;
        this.f141280y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u((com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i) this.f141278w, (IntendedPricingPlan) this.f141279x, (hha.d) this.f141280y, continuation, 0);
            case 1:
                return new u((com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.b) this.f141278w, (h1) this.f141279x, (Map) this.f141280y, continuation, 1);
            case 2:
                return new u((NameControllerDescriptor$OutputData) this.f141279x, (com.revolut.feature.onboarding.impl.onboarding.v) this.f141280y, continuation, 2);
            case 3:
                return new u((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.a) this.f141280y, continuation);
            case 4:
                return new u((gjh.e) this.f141279x, (WealthAccount) this.f141280y, continuation, 4);
            case 5:
                return new u((gkk.k) this.f141279x, (TermsScope) this.f141280y, continuation, 5);
            case 6:
                return new u((gkk.k) this.f141279x, (ggk.a) this.f141280y, continuation, 6);
            case 7:
                return new u((gq2.n) this.f141278w, (gq2.g) this.f141279x, (gq2.h) this.f141280y, continuation, 7);
            case 8:
                return new u((grc.k) this.f141278w, (CoroutineScope) this.f141279x, (bqc.a) this.f141280y, continuation, 8);
            case 9:
                return new u((com.revolut.feature.freelancer.impl.ui.invoice.create.flow.a) this.f141279x, (a0) this.f141280y, continuation, 9);
            case 10:
                return new u((h0a.e) this.f141278w, (String) this.f141279x, (MessageItem) this.f141280y, continuation, 10);
            case 11:
                return new u((com.revolut.feature.rev_points.impl.ui.wrapped.flow.a) this.f141278w, (f1c.n) this.f141279x, (yki.l) this.f141280y, continuation, 11);
            case 12:
                return new u((h25.e) this.f141278w, (d1) this.f141279x, (a1) this.f141280y, continuation, 12);
            case 13:
                return new u((h25.e) this.f141278w, (d1) this.f141279x, (r2) this.f141280y, continuation, 13);
            case 14:
                return new u((com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b) this.f141278w, (f5j.a) this.f141279x, (gpf.a) this.f141280y, continuation, 14);
            case 15:
                return new u((h43.s) this.f141279x, (ufm.i) this.f141280y, continuation, 15);
            case 16:
                return new u((f88.f) this.f141279x, (WealthAccount) this.f141280y, continuation, 16);
            case 17:
                return new u((hkk.p) this.f141279x, (ggk.a) this.f141280y, continuation, 17);
            case 18:
                return new u((hkk.p) this.f141279x, (TermsScope) this.f141280y, continuation, 18);
            case 19:
                return new u((hlb.d) this.f141278w, (String) this.f141279x, (String) this.f141280y, continuation, 19);
            case 20:
                return new u((hmc.e) this.f141278w, (String) this.f141279x, (Template) this.f141280y, continuation, 20);
            case 21:
                return new u((com.revolut.trading.orders.ui.invest.placement.screens.review.o) this.f141278w, (String) this.f141279x, (z) this.f141280y, continuation, 21);
            case 22:
                return new u((com.revolut.feature.topup_screen.impl.flow.topup_methods.d) this.f141278w, (TopupMethod) this.f141279x, (String) this.f141280y, continuation, 22);
            case 23:
                return new u((com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c) this.f141278w, (Ref$ObjectRef) this.f141279x, (String) this.f141280y, continuation, 23);
            case 24:
                return new u((i79.k) this.f141278w, (s69.d) this.f141279x, (String) this.f141280y, continuation, 24);
            case 25:
                return new u((com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) this.f141278w, (xdb.o) this.f141279x, (String) this.f141280y, continuation, 25);
            case 26:
                return new u((ilb.d) this.f141278w, this.f141279x, (String) this.f141280y, continuation, 26);
            case 27:
                return new u((com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f141278w, (String) this.f141279x, (xi0.b) this.f141280y, continuation, 27);
            case 28:
                return new u((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) this.f141278w, (FreelancerInvoice) this.f141279x, this.f141280y, continuation, 28);
            default:
                return new u((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) this.f141279x, (FreelancerInvoice) this.f141280y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:534:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g84.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f141278w = obj2;
        this.f141279x = obj3;
        this.f141280y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f141279x = obj2;
        this.f141280y = obj3;
    }
}
