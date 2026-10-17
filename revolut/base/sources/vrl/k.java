package vrl;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f291644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f291645x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, gim.c cVar) {
        super(cVar);
        this.f291644w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f291645x |= Integer.MIN_VALUE;
        return this.f291644w.c(null, null, this);
    }
}
