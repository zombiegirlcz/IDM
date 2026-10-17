package ad9;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.user_migration.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3302w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.onboarding.impl.user_migration.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f3302w |= Integer.MIN_VALUE;
        return this.v.J2(this);
    }
}
