package j54;

/* JADX INFO: loaded from: classes22.dex */
public final class l0 extends gim.c {
    public it3.d u;
    public it3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f171524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f171525x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r0 f171526y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f171526y = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f171525x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f171526y.c3(null, null, false, this);
    }
}
