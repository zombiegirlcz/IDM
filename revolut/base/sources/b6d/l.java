package b6d;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.c {
    public e6d.r u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f12723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12724x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, gim.c cVar) {
        super(cVar);
        this.f12723w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f12724x |= Integer.MIN_VALUE;
        return this.f12723w.h(null, this);
    }
}
