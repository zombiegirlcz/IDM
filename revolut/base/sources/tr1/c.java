package tr1;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f273629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f273630x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f273629w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f273630x |= Integer.MIN_VALUE;
        return this.f273629w.c(null, this);
    }
}
