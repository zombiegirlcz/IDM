package val;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TwinVerticalButton v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tal.c f287332w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TwinVerticalButton twinVerticalButton, tal.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = twinVerticalButton;
        this.f287332w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, this.f287332w, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.views.buttons.TwinVerticalButton] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.revolut.core.ui_kit.models.Clause] */
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
        Boolean bool = (Boolean) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean zBooleanValue = bool.booleanValue();
        ?? r06 = this.v;
        if (zBooleanValue) {
            r06.setSecondaryButtonText(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            r06.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.o);
            r06.setSecondaryButtonEnabled(false);
        } else {
            tal.b bVar = this.f287332w.f269369c;
            r06.setSecondaryButtonText(bVar != null ? bVar.f269364a : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            r06.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
            r06.setSecondaryButtonEnabled(true);
        }
        return Unit.f186387a;
    }
}
