package rrc;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f256780w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f256780w |= Integer.MIN_VALUE;
        return this.v.h(null, this);
    }
}
