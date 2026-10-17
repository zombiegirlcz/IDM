package ve0;

import gim.i;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import vkm.b2;
import vkm.d2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f288096w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f288097x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f288098y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Flow flow, MutableSharedFlow mutableSharedFlow, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f288097x = flow;
        this.f288098y = (wkm.a) mutableSharedFlow;
        this.z = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.MutableSharedFlow, wkm.a] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlinx.coroutines.flow.MutableSharedFlow, wkm.a] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b((c) this.f288097x, (String) this.f288098y, (Type) this.z, continuation, 0);
                bVar.f288096w = obj2;
                return bVar;
            case 1:
                b bVar2 = new b((Flow) this.f288097x, (wkm.a) this.f288098y, this.z, continuation);
                bVar2.f288096w = obj2;
                return bVar2;
            case 2:
                return new b((d2) this.f288097x, (Flow) this.f288098y, (MutableSharedFlow) this.z, this.f288096w, continuation);
            default:
                b bVar3 = new b((xe0.c) this.f288097x, (String) this.f288098y, (Type) this.z, continuation, 3);
                bVar3.f288096w = obj2;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((b2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.MutableSharedFlow, wkm.a] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.MutableSharedFlow, wkm.a] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ve0.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ue0.c cVar, String str, Type type, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f288097x = cVar;
        this.f288098y = str;
        this.z = type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(d2 d2Var, Flow flow, MutableSharedFlow mutableSharedFlow, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f288097x = d2Var;
        this.f288098y = flow;
        this.z = (wkm.a) mutableSharedFlow;
        this.f288096w = obj2;
    }
}
