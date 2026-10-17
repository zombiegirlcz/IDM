package z4c;

import com.revolut.core.ui_kit.views.ActionsView;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f319370w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f319370w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f319370w, continuation);
        eVar.v = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (z4c.g.Z2(r5, r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (z4c.g.b3(r5, r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.v
            com.revolut.core.ui_kit.views.ActionsView$Item r0 = (com.revolut.core.ui_kit.views.ActionsView.Item) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            yhm.o.b(r7)
            goto L4b
        L1d:
            yhm.o.b(r7)
            java.lang.String r7 = r0.f58316a
            java.lang.String r0 = "DEPOSIT_ACTION_ID"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            r2 = 0
            z4c.g r5 = r6.f319370w
            if (r0 == 0) goto L38
            r6.v = r2
            r6.u = r4
            java.lang.Object r7 = z4c.g.Z2(r5, r6)
            if (r7 != r1) goto L4b
            goto L4a
        L38:
            java.lang.String r0 = "WITHDRAW_ACTION_ID"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r7 == 0) goto L4b
            r6.v = r2
            r6.u = r3
            java.lang.Object r7 = z4c.g.b3(r5, r6)
            if (r7 != r1) goto L4b
        L4a:
            return r1
        L4b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z4c.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
