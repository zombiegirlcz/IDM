package xyc;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.selfserve.sot.impl.ui.flow.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f309721w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.selfserve.sot.impl.ui.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f309721w |= Integer.MIN_VALUE;
        return com.revolut.feature.selfserve.sot.impl.ui.flow.e.I2(this.v, this);
    }
}
