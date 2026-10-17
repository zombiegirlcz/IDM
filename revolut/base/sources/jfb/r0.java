package jfb;

/* JADX INFO: loaded from: classes6.dex */
public final class r0 extends gim.c {
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f173834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.reverywhere.impl.web_app.d f173835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f173836y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.revolut.feature.retail.reverywhere.impl.web_app.d dVar, gim.c cVar) {
        super(cVar);
        this.f173835x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f173834w = obj2;
        this.f173836y |= Integer.MIN_VALUE;
        return this.f173835x.I2(this);
    }
}
