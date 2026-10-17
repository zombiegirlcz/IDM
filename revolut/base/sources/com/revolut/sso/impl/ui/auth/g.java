package com.revolut.sso.impl.ui.auth;

import com.revolut.sso.impl.domain.models.Challenge;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Challenge f106362w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Challenge challenge, n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f106362w = challenge;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f106362w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (com.revolut.sso.impl.ui.auth.n.Q2(r4, null, r6, null, r10, 5) == r0) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
