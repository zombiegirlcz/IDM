package eu1;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public zz1.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f129465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129466x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.f129465w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129466x |= Integer.MIN_VALUE;
        return this.f129465w.d(null, this);
    }
}
