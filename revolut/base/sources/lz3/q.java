package lz3;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.c {
    public it3.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f200930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f200931x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, gim.c cVar) {
        super(cVar);
        this.f200930w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f200931x |= Integer.MIN_VALUE;
        return this.f200930w.a(null, this);
    }
}
