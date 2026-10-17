package b6d;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public e6d.r u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f12718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12719x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, gim.c cVar) {
        super(cVar);
        this.f12718w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f12719x |= Integer.MIN_VALUE;
        return this.f12718w.e(null, this);
    }
}
