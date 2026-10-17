package com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f72684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f72685x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f72686y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z, d dVar, String str, boolean z3, Continuation continuation) {
        super(1, continuation);
        this.v = z;
        this.f72684w = dVar;
        this.f72685x = str;
        this.f72686y = z3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f72684w, this.f72685x, this.f72686y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        return r4;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
