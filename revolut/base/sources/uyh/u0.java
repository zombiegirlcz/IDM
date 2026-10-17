package uyh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class u0 extends gim.c {
    public Function1 u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f284409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d f284410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f284411y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, Continuation continuation) {
        super(continuation);
        this.f284410x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f284409w = obj2;
        this.f284411y |= Integer.MIN_VALUE;
        return this.f284410x.T2(this, null);
    }
}
