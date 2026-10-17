package zh3;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public th3.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f322219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f322220x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f322219w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f322220x |= Integer.MIN_VALUE;
        return this.f322219w.a(null, this);
    }
}
