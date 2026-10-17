package wm3;

import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pfk.s;
import pfm.r;
import skm.e0;
import skm.p0;
import wna.t;
import wp4.i0;
import x84.q;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f298606w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f298606w = obj2;
    }

    private final Object b(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.onboarding.impl.playbilling.b bVar = ((com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a) this.f298606w).o;
            this.v = 1;
            objA = bVar.a(this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objA = ((yhm.m) obj2).f314193a;
        }
        return new yhm.m(objA);
    }

    private final Object c(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e eVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e) this.f298606w;
            cha.b bVar = eVar.f103033q;
            zgk.d dVar = eVar.o;
            String str = dVar.f322194b;
            String str2 = dVar.f322193a;
            this.v = 1;
            s sVar = (s) ((ffk.h) bVar).f134833b;
            sVar.getClass();
            pfk.m mVar = new pfk.m(sVar, str, str2, null, 4);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, mVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((l) this.f298606w, continuation, 0);
            case 1:
                return new j((wma.f) this.f298606w, continuation, 1);
            case 2:
                return new j((t) this.f298606w, continuation, 2);
            case 3:
                return new j((i0) this.f298606w, continuation, 3);
            case 4:
                return new j((wv4.i) this.f298606w, continuation, 4);
            case 5:
                return new j((wvl.g) this.f298606w, continuation, 5);
            case 6:
                return new j((q) this.f298606w, continuation, 6);
            case 7:
                return new j((com.revolut.feature.credit.loan.impl.ui.statements.flow.a) this.f298606w, continuation, 7);
            case 8:
                return new j((LoginFragment) this.f298606w, continuation, 8);
            case 9:
                return new j((com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a) this.f298606w, continuation, 9);
            case 10:
                return new j((com.revolut.feature.retail.savings.impl.ui.details.a) this.f298606w, continuation, 10);
            case 11:
                return new j((xw3.b) this.f298606w, continuation, 11);
            case 12:
                return new j((com.revolut.feature.selfserve.sot.impl.ui.flow.e) this.f298606w, continuation, 12);
            case 13:
                return new j((y07.l) this.f298606w, continuation, 13);
            case 14:
                return new j((com.revolut.feature.freelancer.impl.ui.sales.new_sale.a) this.f298606w, continuation, 14);
            case 15:
                return new j((com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) this.f298606w, continuation, 15);
            case 16:
                return new j((y9e.g) this.f298606w, continuation, 16);
            case 17:
                return new j((com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b) this.f298606w, continuation, 17);
            case 18:
                return new j((r) this.f298606w, continuation, 18);
            case 19:
                return new j((com.revolut.feature.apm.upi.impl.flow.pending_payment.a) this.f298606w, continuation, 19);
            case 20:
                return new j((com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) this.f298606w, continuation, 20);
            case 21:
                return new j((com.revolut.feature.junior_onboarding.impl.ui.app_invite.b) this.f298606w, continuation, 21);
            case 22:
                return new j((com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a) this.f298606w, continuation, 22);
            case 23:
                return new j((pfm.t) this.f298606w, continuation, 23);
            case 24:
                return new j((com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a) this.f298606w, continuation, 24);
            case 25:
                return new j((com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.a) this.f298606w, continuation, 25);
            case 26:
                return new j((j50.k) this.f298606w, continuation, 26);
            case 27:
                return new j((com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a) this.f298606w, continuation, 27);
            case 28:
                return new j((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e) this.f298606w, continuation, 28);
            default:
                return new j((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a) this.f298606w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:316:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b A[Catch: all -> 0x005f, LOOP:0: B:34:0x007b->B:494:?, LOOP_START, TryCatch #2 {all -> 0x005f, blocks: (B:23:0x005b, B:32:0x0071, B:34:0x007b, B:41:0x009c, B:43:0x00aa, B:52:0x00cb, B:44:0x00b1, B:46:0x00b5, B:47:0x00bc, B:49:0x00c4, B:55:0x00d9, B:56:0x00de, B:37:0x0089, B:38:0x0094, B:57:0x00df, B:29:0x0068), top: B:490:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00d6 -> B:32:0x0071). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm3.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
