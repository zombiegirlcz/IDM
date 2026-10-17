package kf9;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public xo1.g u;
    public wi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f183336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f183337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f183338y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f183337x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f183336w = obj2;
        this.f183338y |= Integer.MIN_VALUE;
        return this.f183337x.b(null, this);
    }
}
