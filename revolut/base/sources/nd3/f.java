package nd3;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public xfa.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f214313w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214314x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, gim.c cVar) {
        super(cVar);
        this.f214313w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f214314x |= Integer.MIN_VALUE;
        return this.f214313w.a(null, null, null, this);
    }
}
