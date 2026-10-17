package f88;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f132746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f132747x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f132746w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f132747x |= Integer.MIN_VALUE;
        return this.f132746w.b3(null, null, this);
    }
}
