package kuf;

import k71.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f189782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f189783x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f189782w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f189783x |= Integer.MIN_VALUE;
        return this.f189782w.Z2(null, null, this);
    }
}
