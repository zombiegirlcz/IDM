package fk6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lf6.g;
import lf6.j;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f135729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f135730x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f135729w = str;
        this.f135730x = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f135729w, this.f135730x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a aVar2 = dVar.o;
            this.u = 1;
            j jVar = (j) ((com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b) aVar2).f72410a;
            jVar.getClass();
            g gVar = new g(jVar, this.f135729w, null, 2);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, gVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        String str = (String) obj2;
        if (str == null) {
            return dVar.C1(new MainContainerScreenDestination.JustShow(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(R$string.open_finance_payment_authorization_payment_rejected, null, null, 14), null))), (AccountCreationTransitionAnimation) null, 12));
        }
        com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d.I2(dVar, this.f135730x, str);
        return Unit.f186387a;
    }
}
