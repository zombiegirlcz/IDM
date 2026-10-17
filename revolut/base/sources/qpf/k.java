package qpf;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f248391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f248392x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f248391w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f248392x |= Integer.MIN_VALUE;
        return this.f248391w.e(null, this);
    }
}
