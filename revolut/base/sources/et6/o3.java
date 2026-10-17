package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class o3 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r10.d f129290w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129291x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(r10.d dVar, gim.c cVar) {
        super(cVar);
        this.f129290w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129291x |= Integer.MIN_VALUE;
        return this.f129290w.B(null, this);
    }
}
