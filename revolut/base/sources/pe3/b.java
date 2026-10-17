package pe3;

import pe0.f;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f235327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f235328x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f235327w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f235328x |= Integer.MIN_VALUE;
        return this.f235327w.b(null, this);
    }
}
