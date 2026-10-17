package gg2;

import gim.c;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ twg.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f143598w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(twg.c cVar, c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f143598w |= Integer.MIN_VALUE;
        return this.v.A(this);
    }
}
