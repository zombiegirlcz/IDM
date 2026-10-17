package hsd;

import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$Step;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.sso.impl.domain.models.Claim;
import dsh.p;
import ft3.h1;
import gim.i;
import hve.o;
import hyk.h;
import i4h.p0;
import i79.k;
import in1.s;
import ise.n0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import nel.z;
import nii.n1;
import yki.l;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f155030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f155031x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f155032y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(ivh.c cVar, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 28;
        this.f155030w = cVar;
        this.f155031x = str;
        this.f155032y = (i) function1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((f) this.f155032y, continuation, 0);
                cVar.f155031x = obj2;
                return cVar;
            case 1:
                return new c((o) this.f155031x, (TopUpMethodsContext) this.f155032y, continuation, 1);
            case 2:
                c cVar2 = new c(this.f155030w, this.f155032y, false, continuation, 2);
                cVar2.f155031x = obj2;
                return cVar2;
            case 3:
                return new c((com.revolut.feature.topup_screen.impl.flow.topup_methods.d) this.f155030w, (TopupMethodsFlowContract$Step) this.f155031x, (l) this.f155032y, continuation, 3);
            case 4:
                return new c((hyk.c) this.f155030w, (String) this.f155031x, (LinkedHashMap) this.f155032y, continuation, 4);
            case 5:
                return new c((hyk.c) this.f155030w, (String) this.f155031x, (List) this.f155032y, continuation, 5);
            case 6:
                return new c((h) this.f155031x, (String) this.f155032y, continuation, 6);
            case 7:
                return new c((h) this.f155031x, (pxk.a) this.f155032y, continuation, 7);
            case 8:
                c cVar3 = new c(this.f155030w, this.f155032y, false, continuation, 8);
                cVar3.f155031x = obj2;
                return cVar3;
            case 9:
                c cVar4 = new c(this.f155030w, this.f155032y, false, continuation, 9);
                cVar4.f155031x = obj2;
                return cVar4;
            case 10:
                return new c((i1b.f) this.f155030w, (String) this.f155031x, (Map) this.f155032y, continuation, 10);
            case 11:
                return new c((j28.e) this.f155030w, (InvestWidgetContext) this.f155031x, (String) this.f155032y, continuation, 11);
            case 12:
                return new c((x35.e) this.f155030w, (i44.b) this.f155031x, (h1) this.f155032y, continuation, 12);
            case 13:
                return new c((p0) this.f155030w, (z) this.f155031x, (eel.i) this.f155032y, continuation, 13);
            case 14:
                return new c((p0) this.f155030w, (z) this.f155031x, (i4l.a) this.f155032y, continuation, 14);
            case 15:
                return new c((k) this.f155030w, (s69.d) this.f155031x, (String) this.f155032y, continuation, 15);
            case 16:
                return new c((i97.d) this.f155031x, (i97.c) this.f155032y, continuation, 16);
            case 17:
                return new c((Class) this.f155030w, (i97.l) this.f155031x, (String) this.f155032y, continuation, 17);
            case 18:
                c cVar5 = new c(this.f155030w, this.f155032y, false, continuation, 18);
                cVar5.f155031x = obj2;
                return cVar5;
            case 19:
                return new c((ilb.d) this.f155030w, this.f155031x, (String) this.f155032y, continuation, 19);
            case 20:
                return new c((h1j.d) this.f155031x, (s) this.f155032y, continuation, 20);
            case 21:
                c cVar6 = new c(this.f155030w, this.f155032y, false, continuation, 21);
                cVar6.f155031x = obj2;
                return cVar6;
            case 22:
                return new c((com.revolut.sso.impl.ui.signup.b) this.f155030w, (Claim) this.f155031x, (ukl.f) this.f155032y, continuation, 22);
            case 23:
                c cVar7 = new c(this.f155030w, this.f155032y, false, continuation, 23);
                cVar7.f155031x = obj2;
                return cVar7;
            case 24:
                c cVar8 = new c(this.f155030w, this.f155032y, false, continuation, 24);
                cVar8.f155031x = obj2;
                return cVar8;
            case 25:
                c cVar9 = new c(this.f155030w, this.f155032y, false, continuation, 25);
                cVar9.f155031x = obj2;
                return cVar9;
            case 26:
                return new c((com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f155030w, (String) this.f155031x, (xi0.b) this.f155032y, continuation, 26);
            case 27:
                return new c((ish.z) this.f155030w, (WidgetContext) this.f155031x, (p) this.f155032y, continuation, 27);
            case 28:
                return new c((ivh.c) this.f155030w, (String) this.f155031x, (Function1) this.f155032y, continuation);
            default:
                c cVar10 = new c((g) this.f155032y, continuation, 29);
                cVar10.f155031x = obj2;
                return cVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((n0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0972 A[Catch: Exception -> 0x092c, TRY_LEAVE, TryCatch #1 {Exception -> 0x092c, blocks: (B:456:0x0927, B:459:0x092f, B:470:0x096d, B:472:0x0972, B:467:0x0962), top: B:526:0x0912 }] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0a17  */
    /* JADX WARN: Type inference failed for: r0v9, types: [hve.o] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v23, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ne0.j] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.revolut.domain.models.topup.methods.TopupMethod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.revolut.domain.models.topup.methods.TopupMethod] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hsd.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155030w = obj2;
        this.f155031x = obj3;
        this.f155032y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155031x = obj2;
        this.f155032y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155030w = obj2;
        this.f155032y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155032y = obj2;
    }
}
