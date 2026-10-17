package ard;

import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ScreenContentRecyclerView f8654w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ScreenContentRecyclerView screenContentRecyclerView, Continuation continuation) {
        super(2, continuation);
        this.f8654w = screenContentRecyclerView;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i0 i0Var = new i0(this.f8654w, continuation);
        i0Var.v = obj2;
        return i0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i0) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            h0 h0Var = new h0(producerScope, 0);
            ScreenContentRecyclerView screenContentRecyclerView = this.f8654w;
            agh.b bVar = new agh.b(screenContentRecyclerView, yp0.y.a(screenContentRecyclerView, 5, true, h0Var), 26);
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
