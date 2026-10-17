package x59;

import gim.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ ugc.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f302921w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ugc.a aVar, c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f302921w |= Integer.MIN_VALUE;
        return this.v.s(null, null, this);
    }
}
