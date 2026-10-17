package com.revolut.sso.impl.ui.auth;

import com.revolut.sso.impl.domain.models.Challenge;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f106363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Challenge f106364x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Challenge challenge, n nVar, Continuation continuation) {
        super(2, continuation);
        this.f106363w = nVar;
        this.f106364x = challenge;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.f106364x, this.f106363w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d6, code lost:
    
        if (r1.X2(true, r14, new okl.w(r1, null, 1), r13) == r7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ed, code lost:
    
        if (r1.X2(true, r14, new okl.w(r1, null, 1), r13) == r7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:
    
        if (com.revolut.sso.impl.ui.auth.n.Q2(r1, null, r2, null, r13, 5) == r7) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
