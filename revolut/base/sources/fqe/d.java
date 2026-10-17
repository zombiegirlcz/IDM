package fqe;

import r10.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f137255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f137256x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar, gim.c cVar) {
        super(cVar);
        this.f137255w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f137256x |= Integer.MIN_VALUE;
        return v.b(this.f137255w, null, null, null, this);
    }
}
