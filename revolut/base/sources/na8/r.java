package na8;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f213843w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a f213844x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213845y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a aVar, gim.c cVar) {
        super(cVar);
        this.f213844x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213843w = obj2;
        this.f213845y |= Integer.MIN_VALUE;
        return com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a.I2(this.f213844x, null, null, this);
    }
}
