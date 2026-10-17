package sb0;

import androidx.recyclerview.widget.RecyclerView;
import ard.h0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import yhm.o;
import yp0.y;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f261470w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RecyclerView recyclerView, Continuation continuation) {
        super(2, continuation);
        this.f261470w = recyclerView;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f261470w, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            h0 h0Var = new h0(producerScope, 2);
            RecyclerView recyclerView = this.f261470w;
            s86.a aVar2 = new s86.a(recyclerView, y.a(recyclerView, 5, true, h0Var), 4);
            this.v = null;
            this.u = 1;
            if (com.bumptech.glide.d.d(producerScope, aVar2, this) == aVar) {
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
