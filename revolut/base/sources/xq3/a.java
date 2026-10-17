package xq3;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f308059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f308060x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f308059w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f308060x |= Integer.MIN_VALUE;
        return this.f308059w.a(null, null, this);
    }
}
