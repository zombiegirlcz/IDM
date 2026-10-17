package wq8;

import wh3.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f299419w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f299420x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f299419w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f299420x |= Integer.MIN_VALUE;
        return c.a(this.f299419w, null, null, this);
    }
}
