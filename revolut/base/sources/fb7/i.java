package fb7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ HiddenAccountsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(HiddenAccountsListScreen hiddenAccountsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = hiddenAccountsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarE3 = this.v.d();
        Intrinsics.h(model);
        i0 i0Var = (i0) b0VarE3;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof v) {
            i0Var.C2(new o(((v) obj3).f133498a));
        } else if (obj3 instanceof j1j.d) {
            i0Var.C2(new q((j1j.d) obj3));
        } else {
            hx7.e.h(new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.o(model.f53228a, ": Unexpected parcel: ", obj3 != null ? obj3.getClass().getName() : null)));
        }
        return Unit.f186387a;
    }
}
