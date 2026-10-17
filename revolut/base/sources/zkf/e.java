package zkf;

import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public t3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f322954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f322955x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f322954w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f322955x |= Integer.MIN_VALUE;
        return this.f322954w.b(null, null, this);
    }
}
