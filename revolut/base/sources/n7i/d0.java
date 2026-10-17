package n7i;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kbb.c f213109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f213110x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kbb.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f213109w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f213110x |= Integer.MIN_VALUE;
        return this.f213109w.A(null, this);
    }
}
