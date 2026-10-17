package k49;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gim.i f180858w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(l lVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
        this.f180858w = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f180858w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [gim.i, kotlin.jvm.functions.Function1] */
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
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        l lVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = lVar.Y2(this, this.f180858w);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        j49.h hVar = (j49.h) obj2;
        if (!(hVar instanceof j49.c) && !(hVar instanceof j49.a)) {
            if (hVar instanceof j49.b) {
                return lVar.A2(((j49.b) hVar).f171321a);
            }
            Continuation continuation = null;
            if (hVar instanceof j49.g) {
                return n.j2(lVar, lVar.L2(new y0(null, ((j49.g) hVar).f171327a, false, 5)), null, new i(lVar, continuation, 0), 3);
            }
            if (hVar instanceof j49.d) {
                lVar.f180860m.x(((j49.d) hVar).f171323a);
                return Unit.f186387a;
            }
            if (hVar instanceof j49.e) {
                j49.e eVar = (j49.e) hVar;
                lVar.N2(eVar.f171324a, eVar.f171325b, new k0d.c(lVar, 17));
                return Unit.f186387a;
            }
            if (hVar instanceof j49.f) {
                return n.j2(lVar, lVar.L2(((j49.f) hVar).f171326a), null, new i(lVar, continuation, 1), 3);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
