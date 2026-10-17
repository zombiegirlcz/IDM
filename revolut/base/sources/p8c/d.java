package p8c;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f234141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f234142x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f234141w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f234142x |= Integer.MIN_VALUE;
        return this.f234141w.Z2(null, false, this);
    }
}
