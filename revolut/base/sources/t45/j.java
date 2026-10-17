package t45;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f267905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267906x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f267905w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267906x |= Integer.MIN_VALUE;
        return this.f267905w.j(null, this);
    }
}
