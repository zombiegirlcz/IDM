package kk8;

import a0e.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.c {
    public w u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f184508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184509x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f184508w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184509x |= Integer.MIN_VALUE;
        return this.f184508w.b(this);
    }
}
