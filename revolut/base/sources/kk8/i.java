package kk8;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f184510w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184511x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f184510w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184511x |= Integer.MIN_VALUE;
        return this.f184510w.c(null, null, this);
    }
}
