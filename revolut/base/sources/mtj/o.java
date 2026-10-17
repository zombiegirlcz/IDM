package mtj;

import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ q B;
    public int C;
    public RewardsHubChallengeDetailsParams u;
    public d0j.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f208887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f208888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f208889y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.B = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return q.a(this.B, null, null, this);
    }
}
