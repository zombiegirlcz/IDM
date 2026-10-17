package n03;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public wy2.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d f210866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f210867x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d dVar, gim.c cVar) {
        super(cVar);
        this.f210866w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f210867x |= Integer.MIN_VALUE;
        return com.revolut.feature.card_management.impl.ui.kompot.replace.flow.d.I2(this.f210866w, null, null, this);
    }
}
