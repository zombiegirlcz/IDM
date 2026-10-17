package rk6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.ui.choose_account_type.ChooseAccountTypeScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rk6.b;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChooseAccountTypeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChooseAccountTypeScreen chooseAccountTypeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chooseAccountTypeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.v.R;
        String listId = model.f53228a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "retail_id")) {
            cVar.C2(b.C1406b.f254749a);
        } else if (Intrinsics.f(listId, "business_id")) {
            cVar.C2(b.a.f254748a);
        }
        return Unit.f186387a;
    }
}
