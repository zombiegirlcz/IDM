package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import nii.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f101455w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y0 y0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = y0Var;
        this.f101455w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f101455w, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            nii.y0 r0 = r6.v
            java.lang.String r0 = r0.f216243a
            com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c r1 = r6.f101455w
            vii.b r2 = r1.f101459s
            java.lang.Object r3 = r6.u
            nii.n1 r3 = (nii.n1) r3
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            boolean r7 = r3 instanceof nii.l1
            java.lang.String r4 = "ID_TOKEN_EXPIRATION_ERROR_DIALOG"
            java.lang.String r5 = "ID_GENERAL_ERROR_DIALOG"
            if (r7 == 0) goto L29
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r0, r5)
            if (r7 != 0) goto L25
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r0, r4)
            if (r7 == 0) goto L60
        L25:
            r2.a()
            goto L60
        L29:
            boolean r7 = r3 instanceof nii.k1
            if (r7 == 0) goto L60
            if (r0 == 0) goto L60
            int r7 = r0.hashCode()
            switch(r7) {
                case -1716811131: goto L56;
                case -1511859654: goto L4f;
                case -973684556: goto L40;
                case 1559771336: goto L37;
                default: goto L36;
            }
        L36:
            goto L60
        L37:
            java.lang.String r7 = "ID_SUCCESS_DIALOG"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L49
            goto L60
        L40:
            java.lang.String r7 = "ID_PENDING_DIALOG"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L49
            goto L60
        L49:
            com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a$b r7 = com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.a.b.f101454a
            r1.C2(r7)
            goto L60
        L4f:
            boolean r7 = r0.equals(r5)
            if (r7 != 0) goto L5d
            goto L60
        L56:
            boolean r7 = r0.equals(r4)
            if (r7 != 0) goto L5d
            goto L60
        L5d:
            r2.a()
        L60:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
