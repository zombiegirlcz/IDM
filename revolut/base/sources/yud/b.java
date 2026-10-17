package yud;

import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import wf0.f0;
import yrb.i;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f317006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f317007c;

    public /* synthetic */ b(g gVar, xi0.b bVar, int i) {
        this.f317005a = i;
        this.f317006b = gVar;
        this.f317007c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f317005a) {
            case 0:
                vtd.c rewardsData = (vtd.c) obj2;
                Intrinsics.checkNotNullParameter(rewardsData, "rewardsData");
                xi0.b bVar = rewardsData.f292101b.f115083b;
                ppk.f fVar = this.f317006b.f317014b;
                xi0.b bVar2 = this.f317007c;
                return nim.a.v(rd0.e.b(fVar.b(v1.c.w(bVar, bVar2), false)), new yrk.e(rewardsData, 5, bVar, bVar2));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                zvd.b bVar3 = (zvd.b) pair.f186385a;
                StakingProduct stakingProduct = (StakingProduct) pair.f186386b;
                g gVar = this.f317006b;
                return nim.a.v(q.Q(rd0.e.b(xv5.c.b(gVar.f317015c)), new f0((Continuation) null, gVar, this.f317007c, 14)), new i(bVar3, stakingProduct, 19));
        }
    }
}
