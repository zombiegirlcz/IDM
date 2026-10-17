package vp1;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.c {
    public c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f291038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f291039x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f291038w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f291039x |= Integer.MIN_VALUE;
        return this.f291038w.e(null, this);
    }
}
