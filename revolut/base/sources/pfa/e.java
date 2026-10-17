package pfa;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public boolean u;
    public wi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f235548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f235549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f235550y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, gim.c cVar) {
        super(cVar);
        this.f235549x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f235548w = obj2;
        this.f235550y |= Integer.MIN_VALUE;
        return this.f235549x.c(false, null, this);
    }
}
