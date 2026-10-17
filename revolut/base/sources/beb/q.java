package beb;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar = this.v;
        cli.y yVar = aVar.f82839s;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Object[] objArr = 0;
        if (i == 0) {
            yhm.o.b(obj2);
            a2 a2Var = aVar.f82838r;
            if (a2Var != null) {
                a2Var.f(null);
            }
            aVar.H2(yVar, new bbh.a(19));
            wdb.n nVar = aVar.f82836p;
            String str = aVar.o.f82833a;
            this.u = 1;
            nVar.getClass();
            obj2 = nVar.h(new w64.d(nVar, str, objArr == true ? 1 : 0, 5), this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Data data = (Data) obj2;
        aVar.H2(yVar, new p(data, 0));
        if (zi0.c.E(data)) {
            xdb.y yVar2 = (xdb.y) ((h) ((j2) yVar.f22677a).getValue()).f14736b.getContent();
            aVar.I2(yVar2 != null ? yVar2.f304415a : null);
        }
        return Unit.f186387a;
    }
}
