package cul;

import aw0.f4;
import aw0.n6;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InvestOrderEditScreen f109097w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(InvestOrderEditScreen investOrderEditScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109097w = investOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f109097w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f109097w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f109097w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            case 3:
                f fVar4 = new f(this.f109097w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
            case 4:
                f fVar5 = new f(this.f109097w, continuation, 4);
                fVar5.v = obj2;
                return fVar5;
            case 5:
                f fVar6 = new f(this.f109097w, continuation, 5);
                fVar6.v = obj2;
                return fVar6;
            case 6:
                f fVar7 = new f(this.f109097w, continuation, 6);
                fVar7.v = obj2;
                return fVar7;
            default:
                f fVar8 = new f(this.f109097w, continuation, 7);
                fVar8.v = obj2;
                return fVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((bw0.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create((d01.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((rp0.z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0312  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cul.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
