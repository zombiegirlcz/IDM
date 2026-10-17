package ow3;

import ft3.h1;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public h1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f230298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f230299x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f230298w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f230299x |= Integer.MIN_VALUE;
        return this.f230298w.a(null, this);
    }
}
