package ypg;

import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.c {
    public s u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f315885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f315886x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.f315885w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f315886x |= Integer.MIN_VALUE;
        return this.f315885w.b(null, this);
    }
}
