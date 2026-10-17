package a82;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.multibanco.impl.ui.home.area.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2027w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.apm.multibanco.impl.ui.home.area.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f2027w |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.multibanco.impl.ui.home.area.b.I2(this.v, this);
    }
}
