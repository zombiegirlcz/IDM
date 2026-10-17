package o26;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public wd6.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f221497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f221498x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f221497w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f221498x |= Integer.MIN_VALUE;
        return g.e3(this.f221497w, null, this);
    }
}
