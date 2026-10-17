package jc6;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f172724w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, gim.c cVar) {
        super(cVar);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f172724w |= Integer.MIN_VALUE;
        return s.z2(this.v, null, this);
    }
}
