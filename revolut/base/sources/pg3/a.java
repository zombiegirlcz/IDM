package pg3;

import gim.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f235793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f235794x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f235793w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f235794x |= Integer.MIN_VALUE;
        return this.f235793w.g(null, this);
    }
}
