package arf;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f8700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8701x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.f8700w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f8701x |= Integer.MIN_VALUE;
        return l.y2(this.f8700w, null, this);
    }
}
