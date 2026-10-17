package a6e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f1642w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Continuation continuation) {
        super(2, continuation);
        this.f1642w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.f1642w, continuation);
        pVar.v = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [lqk.d] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [rsi.f] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
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
        RowDelegate.Model model = (RowDelegate.Model) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = model.u;
            String str = model.f53228a;
            boolean z = obj3 instanceof GroupMemberClickData;
            s sVar = this.f1642w;
            ?? eVar = 0;
            eVar = 0;
            eVar = 0;
            eVar = 0;
            if (z) {
                GroupMemberClickData groupMemberClickData = (GroupMemberClickData) obj3;
                this.v = null;
                this.u = 1;
                int iHashCode = str.hashCode();
                if (iHashCode != -1318579942) {
                    if (iHashCode != 1610352096) {
                        if (iHashCode == 1610358111 && str.equals("ACTION_ID_REMOVE")) {
                            eVar = new rsi.d(groupMemberClickData);
                        }
                    } else if (str.equals("ACTION_ID_REMIND")) {
                        eVar = new rsi.c(groupMemberClickData);
                    }
                } else if (str.equals("ACTION_ID_TOGGLE_WITHDRAW")) {
                    eVar = new rsi.e(groupMemberClickData);
                }
                if (eVar == 0 || (unitZ2 = sVar.o.Z2(eVar, this)) != aVar) {
                    unitZ2 = Unit.f186387a;
                }
                if (unitZ2 == aVar) {
                    return aVar;
                }
            } else if (obj3 instanceof k6e.f) {
                sVar.T2(new n(str, sVar, (k6e.f) obj3, eVar, 0), new yi5.b(27));
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
