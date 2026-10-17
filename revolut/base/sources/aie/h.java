package aie;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public int A;
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5243x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f5244y;
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.spaces.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.tab.accounts.impl.ui.spaces.c cVar, gim.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f5244y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(this);
    }
}
