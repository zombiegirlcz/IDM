package ekg;

import a0e.m;
import com.revolut.kompot.navigable.screen.BaseScreen;
import gim.i;
import ie7.h;
import iyg.b0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import qe0.s;
import qta.j;
import te0.w;
import vkm.q;
import vpk.k;
import vpk.p;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f127147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f127148x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f127149y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b80.c cVar, p pVar, Continuation continuation) {
        super(3, continuation);
        this.u = 3;
        this.f127148x = cVar;
        this.f127149y = pVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                a aVar = new a((Continuation) obj4, (g) this.f127149y, 0);
                aVar.f127147w = (FlowCollector) obj2;
                aVar.f127148x = obj3;
                return aVar.invokeSuspend(Unit.f186387a);
            case 1:
                a aVar2 = new a((Continuation) obj4, (BaseScreen) this.f127149y, 1);
                aVar2.f127147w = (FlowCollector) obj2;
                aVar2.f127148x = obj3;
                return aVar2.invokeSuspend(Unit.f186387a);
            case 2:
                a aVar3 = new a(this.f127149y, (Continuation) obj4);
                aVar3.f127147w = (FlowCollector) obj2;
                aVar3.f127148x = obj3;
                return aVar3.invokeSuspend(Unit.f186387a);
            default:
                a aVar4 = new a((b80.c) this.f127148x, (p) this.f127149y, (Continuation) obj4);
                aVar4.f127147w = (vpk.g) obj3;
                return aVar4.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowQ;
        FlowCollector flowCollector;
        Object objA;
        int i = this.u;
        int i2 = 0;
        Long lValueOf = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ?? r56 = this.f127149y;
        switch (i) {
            case 0:
                g gVar = (g) r56;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f127147w;
                    dkg.a aVar2 = (dkg.a) this.f127148x;
                    if (aVar2 == null || !aVar2.f115516a.K5(gVar.f127162c)) {
                        akg.o oVar = (akg.o) gVar.f127161b;
                        flowQ = q.q(q.Q(oVar.f5953g, new m((Continuation) (objArr == true ? 1 : 0), (Object) oVar, 20)));
                    } else {
                        flowQ = new go.g(zi0.c.P(aVar2, false, null, 3), 2);
                    }
                    this.f127147w = null;
                    this.f127148x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, flowQ, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f127147w;
                    jki.m mVar = (jki.m) this.f127148x;
                    BaseScreen baseScreen = (BaseScreen) r56;
                    Flow gVar2 = baseScreen.f98411t == yji.b.NONE ? new go.g(mVar, 2) : new h(q.P(new b0(baseScreen.J, 5), 1), mVar, 15);
                    this.f127147w = null;
                    this.f127148x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, gVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    flowCollector = (FlowCollector) this.f127147w;
                    Object obj3 = this.f127148x;
                    this.f127147w = flowCollector;
                    this.v = 1;
                    obj2 = r56.invoke(obj3, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector = (FlowCollector) this.f127147w;
                    o.b(obj2);
                }
                this.f127147w = null;
                this.v = 2;
                if (flowCollector.emit(obj2, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
            default:
                p pVar = (p) r56;
                s sVar = pVar.f291251g;
                vpk.g gVar3 = (vpk.g) this.f127147w;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                try {
                } catch (Throwable th10) {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = o.a(th10);
                }
                if (i21 == 0) {
                    o.b(obj2);
                    b80.c cVar = (b80.c) this.f127148x;
                    m.Companion companion2 = yhm.m.INSTANCE;
                    k kVar = new k(gVar3, pVar, objArr2 == true ? 1 : 0, i2);
                    this.f127147w = gVar3;
                    this.v = 1;
                    obj2 = w.m0(cVar, kVar, this);
                    if (obj2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                objA = (qta.b) obj2;
                m.Companion companion3 = yhm.m.INSTANCE;
                obj4 = objA;
                if (!(obj4 instanceof n)) {
                    qta.b bVar = (qta.b) obj4;
                    if (pVar.b()) {
                        String strF = p.f(gVar3);
                        if (!bVar.a().isEmpty()) {
                            j jVar = (j) d0.b0(bVar.a());
                            lValueOf = Long.valueOf(jVar.a().getMillis() - jVar.b().getMillis());
                        }
                        sVar.g(strF, lValueOf);
                    }
                }
                Throwable thA = yhm.m.a(obj4);
                if (thA != null && !(thA instanceof CancellationException) && pVar.b()) {
                    sVar.e(p.f(gVar3));
                }
                o.b(obj4);
                return obj4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f127149y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.u = 2;
        this.f127149y = function2;
    }
}
