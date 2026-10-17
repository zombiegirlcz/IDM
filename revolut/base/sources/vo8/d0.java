package vo8;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends gim.c {
    public eb8.f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b f290877w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f290878x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, gim.c cVar) {
        super(cVar);
        this.f290877w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f290878x |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b.K2(this.f290877w, null, this);
    }
}
