package j54;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f171521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f171522x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f171521w = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f171522x |= Integer.MIN_VALUE;
        return this.f171521w.b3(this, null, false);
    }
}
