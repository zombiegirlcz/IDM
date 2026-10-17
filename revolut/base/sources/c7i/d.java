package c7i;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public int A;
    public q u;
    public o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f21995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m f21996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f21997y;
    public final /* synthetic */ zq.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.z = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21997y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.p(null, null, null, null, null, this);
    }
}
