package bwi;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f19356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19357x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f19356w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f19357x |= Integer.MIN_VALUE;
        return this.f19356w.d(null, this);
    }
}
