package v6e;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f286362w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, gim.c cVar) {
        super(cVar);
        this.v = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f286362w |= Integer.MIN_VALUE;
        return this.v.f(this);
    }
}
