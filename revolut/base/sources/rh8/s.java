package rh8;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f254368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ prl.e f254369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f254370y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(prl.e eVar, gim.c cVar) {
        super(cVar);
        this.f254369x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f254368w = obj2;
        this.f254370y |= Integer.MIN_VALUE;
        return this.f254369x.n(this, null, false);
    }
}
