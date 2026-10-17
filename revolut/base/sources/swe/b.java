package swe;

import prl.e;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public uwe.a u;
    public e93.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f266198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f266199x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f266200y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f266199x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f266198w = obj2;
        this.f266200y |= Integer.MIN_VALUE;
        return e.c(this.f266199x, null, null, this);
    }
}
