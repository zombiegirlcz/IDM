package zb9;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public long u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a f320847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f320848x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a aVar, gim.c cVar) {
        super(cVar);
        this.f320847w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f320848x |= Integer.MIN_VALUE;
        return this.f320847w.J2(this);
    }
}
