package akl;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f6011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6012x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, gim.c cVar) {
        super(cVar);
        this.f6011w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f6012x |= Integer.MIN_VALUE;
        return h.c(this.f6011w, null, this);
    }
}
