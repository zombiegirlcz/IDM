package wfg;

import gim.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f297111w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f297111w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
