package rrc;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f256757w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f256757w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
