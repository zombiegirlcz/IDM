package mtj;

import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public d0j.k u;
    public RewardsHubChallengeDetailsParams v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f208869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f208870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f208871y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f208870x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f208869w = obj2;
        this.f208871y |= Integer.MIN_VALUE;
        return this.f208870x.a(null, null, this);
    }
}
