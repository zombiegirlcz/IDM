package feb;

import com.revolut.data.model.Data;
import gim.i;
import ik3.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f134486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f134487x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f134487x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f134487x, continuation, 0);
                aVar.f134486w = obj2;
                return aVar;
            default:
                a aVar2 = new a(this.f134487x, continuation, 1);
                aVar2.f134486w = obj2;
                return aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        b bVar = this.f134487x;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f134486w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    List<String> listB = ((c) bVar.f134489b).b();
                    ArrayList arrayList = new ArrayList();
                    for (String str : listB) {
                        try {
                            m.Companion companion = m.INSTANCE;
                            wi0.b.Companion.getClass();
                            objA = wi0.a.a(str);
                        } catch (Throwable th10) {
                            m.Companion companion2 = m.INSTANCE;
                            objA = o.a(th10);
                        }
                        if (objA instanceof n) {
                            objA = null;
                        }
                        wi0.b bVar2 = (wi0.b) objA;
                        if (bVar2 != null) {
                            arrayList.add(bVar2);
                        }
                        break;
                    }
                    Data dataP = zi0.c.P(arrayList, false, null, 3);
                    this.f134486w = null;
                    this.v = 1;
                    if (flowCollector.emit(dataP, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f134486w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    Data dataP2 = zi0.c.P(((c) bVar.f134489b).g(), false, null, 3);
                    this.f134486w = null;
                    this.v = 1;
                    if (flowCollector2.emit(dataP2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
