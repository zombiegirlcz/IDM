package tf1;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.c {
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f270184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f270185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f270186y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f270185x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f270184w = obj2;
        this.f270186y |= Integer.MIN_VALUE;
        return this.f270185x.e(this);
    }
}
