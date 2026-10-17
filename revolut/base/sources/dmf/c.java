package dmf;

import aie.v;
import gim.i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import skm.e0;
import vc.s;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f116121w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f116122x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ArrayList arrayList, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116122x = arrayList;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f116122x, continuation, 0);
                cVar.f116121w = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f116122x, continuation, 1);
                cVar2.f116121w = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f116121w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i == 1) {
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return Unit.f186387a;
                }
                o.b(obj2);
                ArrayList arrayList = this.f116122x;
                int size = arrayList.size();
                if (size == 0) {
                    f0 f0Var = f0.f322471a;
                    this.f116121w = null;
                    this.v = 1;
                    if (flowCollector.emit(f0Var, this) == aVar) {
                        return aVar;
                    }
                    return Unit.f186387a;
                }
                b bVar = new b(size, arrayList, s.a(-1, null, null, 6), flowCollector, new AtomicReferenceArray(size), null);
                this.f116121w = null;
                this.v = 2;
                if (e0.o(bVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f116121w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    v vVar = new v(this.f116122x, flowCollector2, (Continuation) null, 8);
                    this.f116121w = null;
                    this.v = 1;
                    if (e0.o(vVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
