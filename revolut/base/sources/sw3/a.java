package sw3;

import ft3.h1;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.c {
    public h1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f266086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f266087x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f266086w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f266087x |= Integer.MIN_VALUE;
        return this.f266086w.a(null, null, this);
    }
}
