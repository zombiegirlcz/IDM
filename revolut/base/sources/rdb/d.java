package rdb;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f253397w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, gim.c cVar) {
        super(cVar);
        this.v = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f253397w |= Integer.MIN_VALUE;
        return this.v.a(null, null, null, this);
    }
}
