package bkf;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16403w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.v = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f16403w |= Integer.MIN_VALUE;
        return this.v.Z2(this);
    }
}
