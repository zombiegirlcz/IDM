package er5;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f128542w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f128543x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f128542w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f128543x |= Integer.MIN_VALUE;
        return this.f128542w.Z2(this);
    }
}
