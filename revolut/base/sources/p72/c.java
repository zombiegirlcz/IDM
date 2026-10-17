package p72;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public h02.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f233514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f233515x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f233514w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f233515x |= Integer.MIN_VALUE;
        return this.f233514w.d(null, this);
    }
}
