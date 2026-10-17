package mb7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.screens.root.SecretAccountsRootScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SecretAccountsRootScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SecretAccountsRootScreen secretAccountsRootScreen, Continuation continuation) {
        super(2, continuation);
        this.v = secretAccountsRootScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.M.getValue();
        Intrinsics.h(model);
        k kVar = (k) iVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "SECRET_ACCOUNTS_UNHIDE_LIST_ID")) {
            kVar.C2(g.f204176a);
        } else {
            hx7.e.h(new IllegalArgumentException(j6.a.q("Unknown listId ", str)));
        }
        return Unit.f186387a;
    }
}
