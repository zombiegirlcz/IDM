package jyk;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f179496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179497x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, gim.c cVar) {
        super(cVar);
        this.f179496w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179497x |= Integer.MIN_VALUE;
        return this.f179496w.h(null, this);
    }
}
