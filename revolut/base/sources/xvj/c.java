package xvj;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f309284w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f309285x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f309284w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f309285x |= Integer.MIN_VALUE;
        return this.f309284w.c(null, this);
    }
}
