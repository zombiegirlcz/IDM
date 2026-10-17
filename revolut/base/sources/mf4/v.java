package mf4;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.c {
    public cv3.a u;
    public cv3.d0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f204891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a0 f204892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f204893y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f204892x = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f204891w = obj2;
        this.f204893y |= Integer.MIN_VALUE;
        return this.f204892x.u(null, this);
    }
}
