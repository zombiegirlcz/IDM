package com.revolut.sso.impl.ui.auth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function2 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f106366w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Continuation continuation) {
        super(2, continuation);
        this.f106366w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.f106366w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r15 != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        if (com.revolut.sso.impl.ui.auth.n.Q2(r8, null, null, null, r14, 7) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[PHI: r0 r15
      0x0083: PHI (r0v8 java.lang.String) = (r0v4 java.lang.String), (r0v28 java.lang.String) binds: [B:34:0x007f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r15v8 java.lang.Object) = (r15v6 java.lang.Object), (r15v0 java.lang.Object) binds: [B:34:0x007f, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
