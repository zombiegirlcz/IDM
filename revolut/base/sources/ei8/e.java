package ei8;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public kf8.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e f126453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f126454x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e eVar, gim.c cVar) {
        super(cVar);
        this.f126453w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f126454x |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e.I2(this.f126453w, null, null, this);
    }
}
