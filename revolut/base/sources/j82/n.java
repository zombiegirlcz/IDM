package j82;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f172096w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, gim.c cVar) {
        super(cVar);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f172096w |= Integer.MIN_VALUE;
        return s.I2(this.v, this);
    }
}
