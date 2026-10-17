package jc6;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.c {
    public ba6.l u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f172722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f172723x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, gim.c cVar) {
        super(cVar);
        this.f172722w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f172723x |= Integer.MIN_VALUE;
        return s.y2(this.f172722w, this);
    }
}
