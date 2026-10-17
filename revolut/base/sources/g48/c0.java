package g48;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends gim.c {
    public n38.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f140355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r0 f140356x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f140357y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f140356x = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f140355w = obj2;
        this.f140357y |= Integer.MIN_VALUE;
        return this.f140356x.b(null, this);
    }
}
