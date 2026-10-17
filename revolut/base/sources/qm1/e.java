package qm1;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public Throwable u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f247748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f247749x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f247748w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f247749x |= Integer.MIN_VALUE;
        return this.f247748w.a(null, this);
    }
}
