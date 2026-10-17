package com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import n32.e;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public Object u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f62389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f62390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f62391y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f62391y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f62391y, continuation);
        cVar.f62390x = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d.J2(r2, r3, r29) == r8) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0173, code lost:
    
        if (com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d.J2(r2, r0, r29) == r8) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024a, code lost:
    
        if (com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d.J2(r2, r0, r29) == r8) goto L74;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
