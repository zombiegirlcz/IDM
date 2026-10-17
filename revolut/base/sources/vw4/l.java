package vw4;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f292642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f292643x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f292642w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f292643x |= Integer.MIN_VALUE;
        return this.f292642w.b(null, this);
    }
}
