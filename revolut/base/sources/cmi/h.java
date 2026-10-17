package cmi;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public clk.b u;
    public zli.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f25278x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f25279y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, gim.c cVar) {
        super(cVar);
        this.f25278x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f25277w = obj2;
        this.f25279y |= Integer.MIN_VALUE;
        return this.f25278x.l3(null, null, null, this);
    }
}
