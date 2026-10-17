package n7i;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ kbb.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f213106w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(kbb.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f213106w |= Integer.MIN_VALUE;
        return this.v.z(null, this);
    }
}
