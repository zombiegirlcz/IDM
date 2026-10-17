package o9k;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.c {
    public JuniorBankingProfile u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kbb.c f223331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f223332x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kbb.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f223331w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f223332x |= Integer.MIN_VALUE;
        return this.f223331w.w(null, this);
    }
}
