package g4k;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f140590w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.v = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f140590w |= Integer.MIN_VALUE;
        return this.v.c3(null, null, this);
    }
}
