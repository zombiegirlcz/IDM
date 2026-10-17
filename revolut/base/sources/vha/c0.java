package vha;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f289357w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(q0 q0Var, Continuation continuation) {
        super(2, continuation);
        this.f289357w = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c0 c0Var = new c0(this.f289357w, continuation);
        c0Var.v = obj2;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.v
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.RowDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.u
            r3 = 1
            if (r2 == 0) goto L19
            if (r2 != r3) goto L11
            yhm.o.b(r9)
            goto L71
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            yhm.o.b(r9)
            vha.q0 r9 = r8.f289357w
            vha.l r2 = r9.f289423w
            kotlin.jvm.internal.Intrinsics.h(r0)
            r2.getClass()
            java.lang.String r4 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.Object r0 = r0.u
            boolean r4 = r0 instanceof vha.v
            r5 = 0
            if (r4 == 0) goto L35
            vha.v r0 = (vha.v) r0
            goto L36
        L35:
            r0 = r5
        L36:
            if (r0 != 0) goto L3a
        L38:
            r2 = r5
            goto L64
        L3a:
            java.lang.Object r4 = r0.f289446b
            boolean r6 = r4 instanceof ida.d
            if (r6 == 0) goto L43
            ida.d r4 = (ida.d) r4
            goto L44
        L43:
            r4 = r5
        L44:
            if (r4 == 0) goto L38
            io3.g r4 = r4.f160458a
            if (r4 == 0) goto L38
            io3.d r4 = r4.f163163a
            if (r4 != 0) goto L4f
            goto L38
        L4f:
            j60.a r2 = r2.f289403n
            r6 = 3
            r7 = 0
            j60.a.v(r2, r7, r5, r6)
            sfe.m r2 = new sfe.m
            java.lang.String r0 = r0.f289445a
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            java.lang.String r7 = r4.f163145a
            r6.<init>(r7, r5)
            r2.<init>(r0, r6, r4)
        L64:
            if (r2 == 0) goto L71
            r8.v = r5
            r8.u = r3
            java.lang.Object r9 = r9.b3(r2, r8)
            if (r9 != r1) goto L71
            return r1
        L71:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vha.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
