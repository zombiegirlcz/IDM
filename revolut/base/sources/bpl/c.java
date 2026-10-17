package bpl;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.sso.api.email.change.RevolutSsoChangeEmailFlowDestination;
import com.revolut.sso.api.models.SsoChangeClaimMode;
import com.revolut.sso.api.phone.change.RevolutSsoChangePhoneFlowDestination;
import com.revolut.sso.impl.ui.revolut_id.account_details.AccountDetailsScreen;
import com.revolut.sso.impl.ui.revolut_id.account_details.AccountDetailsScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccountDetailsScreen accountDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.R.getValue();
        Intrinsics.h(model);
        j jVar = (j) fVar;
        AccountDetailsScreenContract$InputData accountDetailsScreenContract$InputData = jVar.o;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51871a;
        if (Intrinsics.f(str, "EMAIL")) {
            jVar.C1(new RevolutSsoChangeEmailFlowDestination(new RevolutSsoChangeEmailFlowDestination.InputData(new SsoChangeClaimMode.Multiple(accountDetailsScreenContract$InputData.f106708b.f106203a), cjl.o.SHOT, 1)));
        } else if (Intrinsics.f(str, "PHONE_NUMBER")) {
            jVar.C1(new RevolutSsoChangePhoneFlowDestination(new RevolutSsoChangePhoneFlowDestination.InputData(new SsoChangeClaimMode.Multiple(accountDetailsScreenContract$InputData.f106708b.f106203a), cjl.o.SHOT)));
        }
        return Unit.f186387a;
    }
}
