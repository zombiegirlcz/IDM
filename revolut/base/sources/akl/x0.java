package akl;

import androidx.room.util.DBUtil;
import com.revolut.sso.impl.network.services.UserInfoService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ e1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f6112w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(e1 e1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.v = e1Var;
        this.f6112w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x0(this.v, this.f6112w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

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
        Object obj3;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f6112w;
        e1 e1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            UserInfoService userInfoService = e1Var.f6003a;
            this.u = 1;
            if (userInfoService.removeUserConsents(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        DBUtil.performBlocking(e1Var.f6004b.f271806a, false, true, new te8.a(str, 8));
        x4l.c cVar = e1Var.f6009l;
        Unit unit = Unit.f186387a;
        List list = (List) e1Var.d.get("CONSENTED_CLIENTS");
        if (list != null) {
            ArrayList arrayListF1 = zhm.d0.f1(list);
            arrayListF1.removeIf(new p(new ak7.g(str, 4), 1));
            obj3 = arrayListF1;
        } else {
            obj3 = zhm.f0.f322471a;
        }
        cVar.g(unit, obj3);
        return unit;
    }
}
