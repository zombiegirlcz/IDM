package kyl;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fl1.c f191007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f191008x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fl1.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f191007w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f191008x |= Integer.MIN_VALUE;
        return this.f191007w.a(null, this);
    }
}
