package g03;

/* JADX INFO: loaded from: classes21.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f139282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f139282w |= Integer.MIN_VALUE;
        return com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b.I2(this.v, this);
    }
}
