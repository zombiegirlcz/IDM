package ug6;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public x61.e u;
    public com.revolut.feature.external_accounts.models.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f279938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f279939x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f279940y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f279939x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f279938w = obj2;
        this.f279940y |= Integer.MIN_VALUE;
        return this.f279939x.a(null, this);
    }
}
