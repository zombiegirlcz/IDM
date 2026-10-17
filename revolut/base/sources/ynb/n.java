package ynb;

import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.c {
    public s u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f315413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f315414x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, gim.c cVar) {
        super(cVar);
        this.f315413w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f315414x |= Integer.MIN_VALUE;
        return this.f315413w.l3(null, null, this);
    }
}
