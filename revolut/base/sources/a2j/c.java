package a2j;

import a32.a0;
import aah.h;
import af4.u;
import ag1.o;
import ahf.z;
import aii.x;
import ajd.s;
import akf.s1;
import aw1.q;
import aye.m;
import b85.j;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$CollectedDetails;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType;
import com.revolut.feature.pricingplans.models.documents.PricingPlanDocument;
import com.revolut.feature.retail.savings.api.domain.interactors.SavingsDisclaimersClickAction;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tof.a3;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f886x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Continuation continuation, l lVar) {
        super(1, continuation);
        this.u = i;
        this.f886x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((d) this.f885w, (SavingsDisclaimersClickAction) this.f886x, continuation, 0);
            case 1:
                return new c((a0) this.f885w, (h1j.d) this.f886x, continuation, 1);
            case 2:
                return new c((a68.l) this.f885w, (r58.b) this.f886x, continuation, 2);
            case 3:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a) this.f885w, (ConsentPreferencesSelection) this.f886x, continuation, 3);
            case 4:
                return new c((a8e.i) this.f885w, (u6e.a) this.f886x, continuation, 4);
            case 5:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.b) this.f885w, (String) this.f886x, continuation, 5);
            case 6:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.b) this.f885w, (it3.d) this.f886x, continuation, 6);
            case 7:
                return new c((h) this.f885w, (x) this.f886x, continuation, 7);
            case 8:
                return new c((ty0.a) this.f885w, (h) this.f886x, continuation, 8);
            case 9:
                return new c((com.revolut.feature_retail_user_declarations.email.verification_screen.a) this.f885w, (String) this.f886x, continuation, 9);
            case 10:
                return new c((com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b) this.f885w, (zm3.l) this.f886x, continuation, 10);
            case 11:
                return new c((com.revolut.feature.onboarding.impl.user_migration.e) this.f885w, (rbi.c) this.f886x, continuation, 11);
            case 12:
                return new c((adf.h) this.f885w, (String) this.f886x, continuation, 12);
            case 13:
                return new c((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a) this.f885w, (List) this.f886x, continuation, 13);
            case 14:
                return new c((u) this.f885w, (String) this.f886x, continuation, 14);
            case 15:
                return new c((o) this.f885w, (qf1.i) this.f886x, continuation, 15);
            case 16:
                return new c((ah4.h) this.f885w, (String) this.f886x, continuation, 16);
            case 17:
                return new c((z) this.f885w, (ExchangeOrder) this.f886x, continuation, 17);
            case 18:
                return new c((com.revolut.feature.tab.accounts.impl.ui.spaces.i) this.f885w, (nie.b) this.f886x, continuation, 18);
            case 19:
                return new c((s) this.f885w, (String) this.f886x, continuation, 19);
            case 20:
                return new c((s1) this.f885w, (a3) this.f886x, continuation, 20);
            case 21:
                return new c((com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.a) this.f885w, (tg6.b) this.f886x, continuation, 21);
            case 22:
                return new c((amk.h) this.f885w, (PricingPlanDocument) this.f886x, continuation, 22);
            case 23:
                return new c((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b) this.f885w, (CryptoAddBeneficiaryFlowContract$CollectedDetails) this.f886x, continuation, 23);
            case 24:
                return new c(24, continuation, (arf.l) this.f886x);
            case 25:
                return new c((q) this.f885w, (Alias) this.f886x, continuation, 25);
            case 26:
                return new c((m) this.f885w, (yte.e) this.f886x, continuation, 26);
            case 27:
                return new c((b4g.u) this.f885w, (String) this.f886x, continuation, 27);
            case 28:
                return new c((com.revolut.feature.joint.impl.ui.invite_flow.d) this.f885w, (InvitationType) this.f886x, continuation, 28);
            default:
                return new c(29, continuation, (j) this.f886x);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x0626, code lost:
    
        if (r8.Y2(r28, r0) == r6) goto L314;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2j.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f885w = obj2;
        this.f886x = obj3;
    }
}
