package db;

import androidx.recyclerview.widget.RecyclerView;
import com.feature.user.details.impl.ui.details.UserDetailsController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes16.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ UserDetailsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(UserDetailsController userDetailsController, Continuation continuation) {
        super(2, continuation);
        this.u = userDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = UserDetailsController.V;
        UserDetailsController userDetailsController = this.u;
        RecyclerView.Adapter adapter = userDetailsController.d3().d.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            ScreenContentRecyclerView userDetailsRecyclerView = userDetailsController.d3().d;
            Intrinsics.checkNotNullExpressionValue(userDetailsRecyclerView, "userDetailsRecyclerView");
            tw0.x.a(userDetailsRecyclerView, itemCount - 1);
        }
        return Unit.f186387a;
    }
}
