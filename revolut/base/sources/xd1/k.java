package xd1;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g f304223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f304224x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar, gim.c cVar) {
        super(cVar);
        this.f304223w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f304224x |= Integer.MIN_VALUE;
        return com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g.I2(this.f304223w, this);
    }
}
