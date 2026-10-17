package a6e;

import com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f1645x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1645x = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f1645x, continuation, 0);
                rVar.f1644w = obj2;
                return rVar;
            default:
                r rVar2 = new r(this.f1645x, continuation, 1);
                rVar2.f1644w = obj2;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
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
        Unit unitZ2;
        switch (this.u) {
            case 0:
                um0 um0Var = (um0) this.f1644w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Object obj3 = um0Var.d;
                    String str = um0Var.f166695a;
                    boolean z = obj3 instanceof GroupMemberClickData;
                    s sVar = this.f1645x;
                    rsi.f bVar = null;
                    Object[] objArr = 0;
                    if (z) {
                        GroupMemberClickData groupMemberClickData = (GroupMemberClickData) obj3;
                        this.f1644w = null;
                        this.v = 1;
                        if (Intrinsics.f(str, "ACTION_ID_CONFIRM_REMOVE")) {
                            bVar = new rsi.a(groupMemberClickData);
                        } else if (Intrinsics.f(str, "ACTION_ID_CONFIRM_WITHDRAW")) {
                            bVar = new rsi.b(groupMemberClickData);
                        }
                        if (bVar == null || (unitZ2 = sVar.o.Z2(bVar, this)) != aVar) {
                            unitZ2 = Unit.f186387a;
                        }
                        if (unitZ2 == aVar) {
                            return aVar;
                        }
                    } else if (obj3 instanceof k6e.f) {
                        sVar.T2(new n(str, sVar, (k6e.f) obj3, objArr == true ? 1 : 0, 1), new yi5.b(27));
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj4 = this.f1644w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    oqk.k kVar = this.f1645x.f1647n;
                    this.f1644w = null;
                    this.v = 1;
                    if (kVar.b3(obj4, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
