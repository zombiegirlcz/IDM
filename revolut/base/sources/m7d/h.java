package m7d;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k18.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f203398w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k18.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f203398w |= Integer.MIN_VALUE;
        return this.v.K(this, null, false);
    }
}
