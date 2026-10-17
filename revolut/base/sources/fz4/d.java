package fz4;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.credit.direct.debit.new_account.DirectDebitNewAccountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ DirectDebitNewAccountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DirectDebitNewAccountScreen directDebitNewAccountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = directDebitNewAccountScreen;
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
        KProperty[] kPropertyArr = DirectDebitNewAccountScreen.i0;
        DirectDebitNewAccountScreen directDebitNewAccountScreen = this.u;
        RecyclerView.LayoutManager layoutManager = directDebitNewAccountScreen.h().getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        directDebitNewAccountScreen.h().smoothScrollToPosition(((LinearLayoutManager) layoutManager).getItemCount());
        return Unit.f186387a;
    }
}
