package kf9;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public jf0.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f183332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f183333x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f183332w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f183333x |= Integer.MIN_VALUE;
        return this.f183332w.e(null, this);
    }
}
