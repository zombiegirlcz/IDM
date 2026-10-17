package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.c {
    public qua.p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f127357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127358x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, gim.c cVar) {
        super(cVar);
        this.f127357w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127358x |= Integer.MIN_VALUE;
        return this.f127357w.e3(null, this);
    }
}
