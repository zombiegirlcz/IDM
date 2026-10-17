package bld;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import nx1.u;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f16540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f16541y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a aVar, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.u = 1;
        this.f16540x = aVar;
        this.f16541y = str;
        this.z = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k((m) this.f16540x, (fkd.f) this.f16541y, this.f16539w, (SlotContext) this.z, continuation, 0);
            case 1:
                return new k((com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a) this.f16540x, (String) this.f16541y, (String) this.z, continuation);
            case 2:
                return new k((u) this.f16540x, (n02.b) this.f16541y, this.f16539w, (List) this.z, continuation, 2);
            case 3:
                return new k((String) this.f16541y, (r0f.k) this.z, continuation);
            case 4:
                return new k((rqc.h) this.z, continuation, 4);
            case 5:
                return new k((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f16540x, (dj0.d) this.f16541y, this.f16539w, (CoroutineScope) this.z, continuation, 5);
            default:
                return new k((com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) this.z, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02c5, code lost:
    
        if (r2 == r0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r3 == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bld.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, int i, Object obj4, Continuation continuation, int i2) {
        super(1, continuation);
        this.u = i2;
        this.f16540x = obj2;
        this.f16541y = obj3;
        this.f16539w = i;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, r0f.k kVar, Continuation continuation) {
        super(1, continuation);
        this.u = 3;
        this.f16541y = str;
        this.z = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(oki.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.z = hVar;
    }
}
