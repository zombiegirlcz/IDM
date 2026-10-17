package d3i;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ a5h.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f111205w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a5h.g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f111205w |= Integer.MIN_VALUE;
        return this.v.x0(null, this);
    }
}
