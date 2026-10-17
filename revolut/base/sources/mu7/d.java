package mu7;

import bu7.k;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f208997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f208998x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f208997w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f208998x |= Integer.MIN_VALUE;
        return this.f208997w.b(null, this);
    }
}
