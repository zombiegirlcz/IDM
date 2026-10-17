package ard;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ScreenContentRecyclerView f8651w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ScreenContentRecyclerView screenContentRecyclerView, Continuation continuation) {
        super(2, continuation);
        this.f8651w = screenContentRecyclerView;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g0 g0Var = new g0(this.f8651w, continuation);
        g0Var.v = obj2;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            RecyclerView.Adapter adapter = this.f8651w.getAdapter();
            if (adapter == null) {
                return Unit.f186387a;
            }
            f0 f0Var = new f0(producerScope);
            adapter.registerAdapterDataObserver(f0Var);
            agh.b bVar = new agh.b(adapter, f0Var, 25);
            this.v = null;
            this.u = 1;
            if (com.bumptech.glide.d.d(producerScope, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
