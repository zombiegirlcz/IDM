package vo8;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290922w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f290922w |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b.J2(this.v, null, this);
    }
}
