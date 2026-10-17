package jx;

import xv.m;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends gim.c {
    public m u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f179026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179027x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f179026w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179027x |= Integer.MIN_VALUE;
        return d.d(this.f179026w, null, null, this);
    }
}
