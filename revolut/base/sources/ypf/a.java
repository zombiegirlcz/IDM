package ypf;

import gim.c;
import prf.g;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {
    public g u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f315860w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f315861x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f315860w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f315861x |= Integer.MIN_VALUE;
        return this.f315860w.a(null, this);
    }
}
