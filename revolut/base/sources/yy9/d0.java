package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 extends gim.c {
    public int A;
    public String u;
    public Object[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f317877w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317878x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f317879y;
    public final /* synthetic */ e0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.z = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f317879y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
