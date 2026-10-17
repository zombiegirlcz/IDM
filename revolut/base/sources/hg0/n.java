package hg0;

import com.revolut.feature.credit.application.close.provider.CancellationDialogProvider$CancellationConfirmationOption;
import com.revolut.feature.retail.savings.api.navigation.providers.SavingsNavigationProvider$TopUpConfig;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import hib.q;
import ht2.w;
import hu1.e0;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f152060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f152061x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f152061x = obj2;
        this.f152060w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n((o) this.f152061x, (String) this.f152060w, continuation, 0);
            case 1:
                return new n((com.revolut.feature.retail.salary_account.impl.salary_hub.a) this.f152061x, (String) this.f152060w, continuation, 1);
            case 2:
                return new n((com.revolut.feature.retail.salary_account.impl.salary_hub.a) this.f152061x, (Function0) this.f152060w, continuation, 2);
            case 3:
                return new n((com.revolut.feature.shared_separate_favourites.converter.ui.flow.b) this.f152061x, (igd.c) this.f152060w, continuation, 3);
            case 4:
                return new n((hh6.p) this.f152061x, (hh6.i) this.f152060w, continuation, 4);
            case 5:
                return new n((q) this.f152061x, (TermsScope) this.f152060w, continuation, 5);
            case 6:
                return new n((hje.n) this.f152060w, continuation, 6);
            case 7:
                return new n((f88.f) this.f152061x, (WealthAccount) this.f152060w, continuation, 7);
            case 8:
                return new n((hkb.d) this.f152061x, (String) this.f152060w, continuation, 8);
            case 9:
                return new n((hkj.f) this.f152061x, (String) this.f152060w, continuation, 9);
            case 10:
                return new n((hkk.p) this.f152061x, (ggk.a) this.f152060w, continuation, 10);
            case 11:
                return new n((hkk.p) this.f152061x, (TermsScope) this.f152060w, continuation, 11);
            case 12:
                return new n((hlf.c) this.f152061x, (fof.f) this.f152060w, continuation, 12);
            case 13:
                return new n((com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d) this.f152061x, (String) this.f152060w, continuation, 13);
            case 14:
                return new n((ho8.j) this.f152061x, (um0) this.f152060w, continuation, 14);
            case 15:
                return new n((hob.d) this.f152061x, (SavingsNavigationProvider$TopUpConfig) this.f152060w, continuation, 15);
            case 16:
                return new n((com.revolut.feature.corporate_events.impl.ui.screen.home.b) this.f152061x, (String) this.f152060w, continuation, 16);
            case 17:
                return new n((CancellationDialogProvider$CancellationConfirmationOption) this.f152061x, (hq3.o) this.f152060w, continuation, 17);
            case 18:
                return new n((com.revolut.feature.terminated_users.impl.ui.logout_confirmation.b) this.f152061x, (UserOnboardingNavigationProvider$UseCase) this.f152060w, continuation, 18);
            case 19:
                return new n((hs1.c) this.f152060w, continuation, 19);
            case 20:
                return new n((hs1.c) this.f152061x, (b02.a) this.f152060w, continuation, 20);
            case 21:
                return new n((hs1.c) this.f152061x, (String) this.f152060w, continuation, 21);
            case 22:
                return new n((hsa.m) this.f152061x, (hsa.e) this.f152060w, continuation, 22);
            case 23:
                n nVar = new n((w) this.f152060w, continuation, 23);
                nVar.f152061x = obj2;
                return nVar;
            case 24:
                return new n((com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b) this.f152061x, (bp9.f) this.f152060w, continuation, 24);
            case 25:
                return new n((e0) this.f152061x, (Function0) this.f152060w, continuation, 25);
            case 26:
                return new n((hu7.j) this.f152061x, (String) this.f152060w, continuation, 26);
            case 27:
                return new n((com.revolut.feature.security_hub.impl.ui.flow.m) this.f152061x, (String) this.f152060w, continuation, 27);
            case 28:
                return new n((com.revolut.feature.staking.impl.confirmation.a) this.f152061x, (ty0.a) this.f152060w, continuation, 28);
            default:
                return new n((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c) this.f152061x, (lui.e) this.f152060w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:367:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:494:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hg0.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f152060w = obj2;
    }
}
