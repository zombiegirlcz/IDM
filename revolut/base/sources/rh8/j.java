package rh8;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ prl.e f254345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f254346x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(prl.e eVar, gim.c cVar) {
        super(cVar);
        this.f254345w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f254346x |= Integer.MIN_VALUE;
        return prl.e.d(this.f254345w, null, this);
    }
}
