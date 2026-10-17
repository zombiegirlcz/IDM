package sb0;

import androidx.recyclerview.widget.RecyclerView;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f261469w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RecyclerView recyclerView, Continuation continuation) {
        super(2, continuation);
        this.f261469w = recyclerView;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f261469w, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            RecyclerView.Adapter adapter = this.f261469w.getAdapter();
            if (adapter == null) {
                return Unit.f186387a;
            }
            a aVar2 = new a(producerScope);
            adapter.registerAdapterDataObserver(aVar2);
            s86.a aVar3 = new s86.a(adapter, aVar2, 3);
            this.v = null;
            this.u = 1;
            if (com.bumptech.glide.d.d(producerScope, aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
