package bqf;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f17822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17823x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f17822w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f17823x |= Integer.MIN_VALUE;
        return this.f17822w.c(this);
    }
}
