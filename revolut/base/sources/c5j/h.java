package c5j;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tw0.x;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ MissingFieldsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MissingFieldsScreen missingFieldsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = missingFieldsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        KProperty[] kPropertyArr = MissingFieldsScreen.S;
        ScreenContentRecyclerView recyclerView = this.u.d3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        Intrinsics.i(recyclerView.getLayoutManager(), "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        x.b(recyclerView, ((LinearLayoutManager) r0).getItemCount() - 1);
        return Unit.f186387a;
    }
}
