package nh9;

import xo1.n;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f215383w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f215384x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f215383w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f215384x |= Integer.MIN_VALUE;
        return this.f215383w.b3(null, this);
    }
}
