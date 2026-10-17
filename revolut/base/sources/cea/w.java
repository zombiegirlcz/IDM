package cea;

import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ x10 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.linked_account_details.a f23465w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x10 x10Var, com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = x10Var;
        this.f23465w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.v, this.f23465w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a.J2(r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a.I2(r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            yhm.o.b(r6)
            goto L46
        L19:
            yhm.o.b(r6)
            ip0.x10 r6 = r5.v
            com.revolut.core.ui_kit.views.ActionsView$Item r6 = r6.f167082b
            java.lang.String r6 = r6.f58316a
            java.lang.String r1 = "LIST_ID_ACCESS_WIDGET_BUTTON"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            com.revolut.feature.pockets.impl.details_v2.linked_account_details.a r4 = r5.f23465w
            if (r1 == 0) goto L35
            r5.u = r3
            java.lang.Object r6 = com.revolut.feature.pockets.impl.details_v2.linked_account_details.a.J2(r4, r5)
            if (r6 != r0) goto L46
            goto L45
        L35:
            java.lang.String r1 = "LIST_ID_CONFIRM_WIDGET_BUTTON"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            if (r6 == 0) goto L46
            r5.u = r2
            java.lang.Object r6 = com.revolut.feature.pockets.impl.details_v2.linked_account_details.a.I2(r4, r5)
            if (r6 != r0) goto L46
        L45:
            return r0
        L46:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cea.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
