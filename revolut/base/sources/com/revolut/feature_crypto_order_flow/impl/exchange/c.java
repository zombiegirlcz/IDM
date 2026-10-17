package com.revolut.feature_crypto_order_flow.impl.exchange;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ CryptoOrderDraft v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f96743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f96744x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CryptoOrderDraft cryptoOrderDraft, d dVar, h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoOrderDraft;
        this.f96743w = dVar;
        this.f96744x = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f96743w, this.f96744x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r2 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r2 == r3) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.exchange.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
