package a88;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f2130w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2131x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f2130w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f2131x |= Integer.MIN_VALUE;
        return this.f2130w.c(null, null, this);
    }
}
