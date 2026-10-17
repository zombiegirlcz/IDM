package kk1;

import gim.c;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k18.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184500w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k18.c cVar, c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184500w |= Integer.MIN_VALUE;
        return this.v.I(null, this);
    }
}
