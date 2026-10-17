package rh8;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ prl.e f254348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f254349x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(prl.e eVar, gim.c cVar) {
        super(cVar);
        this.f254348w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f254349x |= Integer.MIN_VALUE;
        return prl.e.e(this.f254348w, null, this);
    }
}
