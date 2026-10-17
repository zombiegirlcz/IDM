package l9j;

import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StakingPocket f193266b;

    public /* synthetic */ l(StakingPocket stakingPocket, int i) {
        this.f193265a = i;
        this.f193266b = stakingPocket;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193265a) {
            case 0:
                return f.a((f) obj2, this.f193266b, null, null, null, 14);
            default:
                return uyh.j.a((uyh.j) obj2, null, this.f193266b, false, null, 27);
        }
    }
}
