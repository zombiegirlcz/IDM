package yie;

import gim.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f314319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f314320x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f314319w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f314320x |= Integer.MIN_VALUE;
        return this.f314319w.d(false, this);
    }
}
