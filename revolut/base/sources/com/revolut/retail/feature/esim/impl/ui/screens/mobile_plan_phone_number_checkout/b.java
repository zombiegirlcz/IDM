package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import nii.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y0 f101380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f101381x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y0 y0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.f101380w = y0Var;
        this.f101381x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f101380w, this.f101381x, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c.I2(r1, r11) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cd, code lost:
    
        if (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c.I2(r1, r11) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        return r4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
