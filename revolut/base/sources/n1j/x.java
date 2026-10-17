package n1j;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends gim.c {
    public j1j.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c f211408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f211409x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f211408w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f211409x |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c.I2(this.f211408w, null, this);
    }
}
