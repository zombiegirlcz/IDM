package com.revolut.feature.apm.core.ui.impl.ui.qr.common;

import e60.l;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import n32.g;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f62366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f62367x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f62366w = lVar;
        this.f62367x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f62366w, this.f62367x, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[PHI: r11
      0x0082: PHI (r11v13 java.lang.Object) = (r11v11 java.lang.Object), (r11v0 java.lang.Object) binds: [B:26:0x007f, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.qr.common.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
