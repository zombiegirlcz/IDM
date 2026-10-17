package fk4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.screen.AccountSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AccountSelectionScreen accountSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f53228a, "linked_account_item_list_id")) {
            i iVar = (i) this.v.Z.getValue();
            Object obj3 = model.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.models.AccountDetails.LinkedAccount");
            AccountDetails.LinkedAccount selectedAccount = (AccountDetails.LinkedAccount) obj3;
            q qVar = (q) iVar;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
            qVar.v2(new g(selectedAccount));
        }
        return Unit.f186387a;
    }
}
