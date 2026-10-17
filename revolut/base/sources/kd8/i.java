package kd8;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public String u;
    public v6d.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f182829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f182830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f182831y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, gim.c cVar) {
        super(cVar);
        this.f182830x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f182829w = obj2;
        this.f182831y |= Integer.MIN_VALUE;
        return this.f182830x.c(null, null, this);
    }
}
