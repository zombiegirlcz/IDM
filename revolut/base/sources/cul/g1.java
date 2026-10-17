package cul;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes12.dex */
public final class g1 extends gim.c {
    public Ref$ObjectRef u;
    public Ref$ObjectRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f109109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f109111y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, gim.c cVar) {
        super(cVar);
        this.f109110x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f109109w = obj2;
        this.f109111y |= Integer.MIN_VALUE;
        return this.f109110x.S2(this);
    }
}
