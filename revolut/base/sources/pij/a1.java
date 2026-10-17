package pij;

/* JADX INFO: loaded from: classes11.dex */
public final class a1 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236527x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, gim.c cVar) {
        super(cVar);
        this.f236526w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f236527x |= Integer.MIN_VALUE;
        return this.f236526w.O2(null, this);
    }
}
