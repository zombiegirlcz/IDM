package iz1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionFlowCallback;
import com.revolut.feature.onboarding.impl.onboarding.passcode.PasscodeScreen;
import com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import ft3.h1;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f169842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f169843x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f169842w = obj2;
        this.f169843x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p((q) this.f169842w, (t02.g) this.f169843x, continuation, 0);
            case 1:
                return new p((iz3.c) this.f169842w, (String) this.f169843x, continuation, 1);
            case 2:
                return new p((j07.i) this.f169843x, continuation, 2);
            case 3:
                return new p((j15.d) this.f169842w, (ux4.m) this.f169843x, continuation, 3);
            case 4:
                return new p((com.revolut.feature.travel.experiences.impl.ui.flow.home.b) this.f169842w, (TravelExperienceDatesSelection) this.f169843x, continuation, 4);
            case 5:
                return new p((com.revolut.feature.travel.experiences.impl.ui.flow.home.b) this.f169842w, (TravelExperiencesSelectedLocation) this.f169843x, continuation, 5);
            case 6:
                return new p((j1k.f) this.f169842w, (ihm.f) this.f169843x, continuation, 6);
            case 7:
                return new p((com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a) this.f169842w, (f0) this.f169843x, continuation, 7);
            case 8:
                return new p((j44.a) this.f169842w, (h1) this.f169843x, continuation, 8);
            case 9:
                return new p((com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b) this.f169842w, (j1j.d) this.f169843x, continuation, 9);
            case 10:
                p pVar = new p((j48.b) this.f169843x, continuation, 10);
                pVar.f169842w = obj2;
                return pVar;
            case 11:
                return new p((mp.p) this.f169842w, (wj0.b) this.f169843x, continuation, 11);
            case 12:
                return new p((j4g.a) this.f169842w, (Function0) this.f169843x, continuation, 12);
            case 13:
                return new p((vkm.d) this.f169842w, (j4h.b) this.f169843x, continuation, 13);
            case 14:
                return new p((vkm.d) this.f169842w, (j4h.c) this.f169843x, continuation, 14);
            case 15:
                return new p((vkm.d) this.f169842w, (j4h.d) this.f169843x, continuation, 15);
            case 16:
                return new p((com.revolut.feature.apm.iris.impl.ui.pay.b) this.f169842w, (String) this.f169843x, continuation, 16);
            case 17:
                p pVar2 = new p((com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.a) this.f169843x, continuation, 17);
                pVar2.f169842w = obj2;
                return pVar2;
            case 18:
                return new p((j7j.k) this.f169842w, (j7j.b) this.f169843x, continuation, 18);
            case 19:
                return new p((ja.b) this.f169842w, (String) this.f169843x, continuation, 19);
            case 20:
                return new p((com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a) this.f169842w, (oy3.g) this.f169843x, continuation, 20);
            case 21:
                p pVar3 = new p((jb0.i) this.f169843x, continuation, 21);
                pVar3.f169842w = obj2;
                return pVar3;
            case 22:
                p pVar4 = new p((PasscodeScreen) this.f169843x, continuation, 22);
                pVar4.f169842w = obj2;
                return pVar4;
            case 23:
                return new p((com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.b) this.f169842w, (IllionFlowCallback) this.f169843x, continuation, 23);
            case 24:
                return new p((jc7.e) this.f169842w, (qf1.l) this.f169843x, continuation, 24);
            case 25:
                return new p((jd3.h) this.f169842w, (sfe.m) this.f169843x, continuation, 25);
            case 26:
                return new p((jd3.h) this.f169842w, (uc3.a) this.f169843x, continuation, 26);
            case 27:
                return new p((com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c) this.f169842w, (String) this.f169843x, continuation, 27);
            case 28:
                return new p((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a) this.f169842w, (CatalogueCategory) this.f169843x, continuation, 28);
            default:
                return new p((com.revolut.feature.apm.swish.impl.ui.a) this.f169842w, (String) this.f169843x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:268:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0550  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 2620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iz1.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f169843x = obj2;
    }
}
