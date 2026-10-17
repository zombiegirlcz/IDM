package ad9;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.c {
    public com.revolut.feature.onboarding.impl.user_migration.e u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.user_migration.e f3300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3301y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.onboarding.impl.user_migration.e eVar, gim.c cVar) {
        super(cVar);
        this.f3300x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f3299w = obj2;
        this.f3301y |= Integer.MIN_VALUE;
        return this.f3300x.I2(null, this);
    }
}
