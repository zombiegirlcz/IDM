package ee8;

import r10.v;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public zm3.f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f125151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125152x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v vVar, gim.c cVar) {
        super(cVar);
        this.f125151w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f125152x |= Integer.MIN_VALUE;
        return this.f125151w.t(null, this);
    }
}
