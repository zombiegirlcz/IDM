package a84;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ e u;
    public final /* synthetic */ TwinVerticalButton v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, TwinVerticalButton twinVerticalButton, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
        this.v = twinVerticalButton;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = this.u.f2108c;
        int i = c.f2107a[bVar.O0().ordinal()];
        if (i == 1) {
            RecyclerView.LayoutManager layoutManager = bVar.h().getLayoutManager();
            Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            bVar.h().smoothScrollToPosition(((LinearLayoutManager) layoutManager).getItemCount());
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.h().smoothScrollBy(0, bVar.h().computeVerticalScrollRange() - this.v.getScrollY());
        }
        bVar.o1();
        return Unit.f186387a;
    }
}
