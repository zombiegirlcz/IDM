package com.feature.user.details.impl.ui.details;

import db.i0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends i implements Function1 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ra.a f26229w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i0 f26230x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ra.a aVar, i0 i0Var, Continuation continuation) {
        super(1, continuation);
        this.f26229w = aVar;
        this.f26230x = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f26229w, this.f26230x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r10 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        if (r10 == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
    
        if (db.i0.I2(r6, r1, r9) == r0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[PHI: r1
      0x0080: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v1 java.lang.String), (r1v3 java.lang.String) binds: [B:13:0x0055, B:15:0x005f, B:20:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.feature.user.details.impl.ui.details.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
