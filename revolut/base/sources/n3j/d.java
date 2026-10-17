package n3j;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ AccountFieldsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AccountFieldsScreen accountFieldsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = accountFieldsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        AccountFieldsScreen.Companion aVar2 = AccountFieldsScreen.INSTANCE;
        ScreenContentRecyclerView recyclerView = this.u.d3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        Intrinsics.i(recyclerView.getLayoutManager(), "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        tw0.x.b(recyclerView, ((LinearLayoutManager) r0).getItemCount() - 1);
        return Unit.f186387a;
    }
}
