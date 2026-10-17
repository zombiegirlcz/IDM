package k49;

import com.revolut.core.ui_kit.delegates.t;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import ggk.l0;
import k50.j4;
import k79.r;
import kjk.o;
import kk9.n;
import kmc.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ks9.f0;
import kye.k3;
import mii.q;
import nii.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f180852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f180853x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 27;
        this.f180852w = bVar;
        this.f180853x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r2v51, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((l) this.f180852w, (t) this.f180853x, continuation, 0);
            case 1:
                return new f((l) this.f180852w, (n1) this.f180853x, continuation, 1);
            case 2:
                return new f((l) this.f180852w, (q) this.f180853x, continuation, 2);
            case 3:
                return new f((j4) this.f180852w, this.f180853x, continuation, 3);
            case 4:
                return new f((r) this.f180852w, (ProductArticleParams) this.f180853x, continuation, 4);
            case 5:
                return new f((com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) this.f180852w, this.f180853x, continuation, 5);
            case 6:
                return new f((com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) this.f180852w, (String) this.f180853x, continuation, 6);
            case 7:
                return new f((com.revolut.feature.rewards.impl.ui.details.flow.b) this.f180852w, (jic.a) this.f180853x, continuation, 7);
            case 8:
                return new f((com.revolut.feature.rewards.impl.ui.details.flow.b) this.f180852w, (zjc.f) this.f180853x, continuation, 8);
            case 9:
                return new f((com.revolut.feature.rewards.impl.ui.details.flow.b) this.f180852w, (tjc.d) this.f180853x, continuation, 9);
            case 10:
                return new f((com.revolut.feature.rewards.impl.ui.details.flow.b) this.f180852w, (String) this.f180853x, continuation, 10);
            case 11:
                return new f((com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) this.f180852w, (xi0.b) this.f180853x, continuation, 11);
            case 12:
                return new f((o) this.f180852w, (String) this.f180853x, continuation, 12);
            case 13:
                return new f((o) this.f180852w, (kjk.l) this.f180853x, continuation, 13);
            case 14:
                return new f((n) this.f180852w, (kk9.e) this.f180853x, continuation, 14);
            case 15:
                return new f((s) this.f180852w, (ilc.a) this.f180853x, continuation, 15);
            case 16:
                return new f((s) this.f180852w, (OnboardingFlowContract$State) this.f180853x, continuation, 16);
            case 17:
                return new f((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.f180852w, (PlansDashboardLayout$Button) this.f180853x, continuation, 17);
            case 18:
                return new f((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.f180852w, (ty0.a) this.f180853x, continuation, 18);
            case 19:
                return new f((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.f180852w, (l0) this.f180853x, continuation, 19);
            case 20:
                return new f((kpb.l) this.f180853x, continuation, 20);
            case 21:
                return new f((kq5.e) this.f180852w, (CryptoAddress) this.f180853x, continuation, 21);
            case 22:
                return new f((f0) this.f180852w, (PaymentGroup) this.f180853x, continuation, 22);
            case 23:
                return new f((f0) this.f180852w, (oq9.o) this.f180853x, continuation, 23);
            case 24:
                return new f((kx4.a) this.f180852w, (String) this.f180853x, continuation, 24);
            case 25:
                return new f((TopupMethodType) this.f180852w, (k3) this.f180853x, continuation, 25);
            case 26:
                return new f((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a) this.f180853x, continuation, 26);
            case 27:
                return new f((com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b) this.f180852w, (Function1) this.f180853x, continuation);
            case 28:
                return new f((com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.b) this.f180852w, (m64.f) this.f180853x, continuation, 28);
            default:
                return new f((z87.f) this.f180852w, (l97.l0) this.f180853x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0146, code lost:
    
        if (r0 == r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        if (r0 == r2) goto L67;
     */
    /* JADX WARN: Type inference failed for: r11v28, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k49.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f180852w = obj2;
        this.f180853x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(oki.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f180853x = hVar;
    }
}
