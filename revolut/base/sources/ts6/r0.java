package ts6;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274019w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, gim.c cVar) {
        super(cVar);
        this.v = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f274019w |= Integer.MIN_VALUE;
        return this.v.e(null, this);
    }
}
