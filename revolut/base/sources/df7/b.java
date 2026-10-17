package df7;

import r10.q;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f113800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f113801x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q qVar, gim.c cVar) {
        super(cVar);
        this.f113800w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f113801x |= Integer.MIN_VALUE;
        return this.f113800w.r0(null, null, this);
    }
}
