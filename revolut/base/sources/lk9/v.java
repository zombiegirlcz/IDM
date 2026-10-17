package lk9;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f196330w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, gim.c cVar) {
        super(cVar);
        this.v = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f196330w |= Integer.MIN_VALUE;
        return y.z2(this.v, this);
    }
}
