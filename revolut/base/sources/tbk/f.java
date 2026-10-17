package tbk;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public kbk.f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f269556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f269557x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f269556w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f269557x |= Integer.MIN_VALUE;
        return this.f269556w.a(null, null, this);
    }
}
