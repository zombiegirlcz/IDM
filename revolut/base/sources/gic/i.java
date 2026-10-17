package gic;

import com.revolut.data.model.Data;
import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import efm.d0;
import ge6.j;
import ggc.l;
import ggc.q;
import ghk.r;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ twg.c f144122b;

    public /* synthetic */ i(twg.c cVar, int i) {
        this.f144121a = i;
        this.f144122b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 iVar;
        switch (this.f144121a) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Pair pair = (Pair) data.getContent();
                if (pair == null) {
                    Throwable error = data.getError();
                    if (error == null) {
                        error = new IllegalStateException("Reward not available");
                    }
                    return d0.l(error);
                }
                l lVar = (l) pair.f186385a;
                kic.h hVar = (kic.h) pair.f186386b;
                twg.c cVar = this.f144122b;
                RewardOutlet rewardOutlet = ((PerkDetailsFlowContract$InputData) cVar.f275017a).d;
                if (rewardOutlet != null) {
                    od0.i.Companion.getClass();
                    iVar = d0.m(od0.h.a(rewardOutlet));
                    Intrinsics.checkNotNullExpressionValue(iVar, "just(...)");
                } else if (lVar.f143644h.d == q.ONLINE) {
                    od0.i.Companion.getClass();
                    iVar = d0.m(od0.i.f224256b);
                    Intrinsics.checkNotNullExpressionValue(iVar, "just(...)");
                } else {
                    iVar = new ufm.i(new ufm.i(((ugc.g) ((bgc.e) cVar.f275018b)).e(), new j(19, new i(cVar, 1)), 0), new j(14, new r(15)), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                }
                return new ufm.i(iVar, new j(18, new g31.e(cVar, 7, lVar, hVar)), 1);
            default:
                od0.i location = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(location, "location");
                twg.c cVar2 = this.f144122b;
                bgc.e eVar = (bgc.e) cVar2.f275018b;
                fgc.a args = new fgc.a(((PerkDetailsFlowContract$InputData) cVar2.f275017a).f84922a, (co3.a) location.f224257a);
                ugc.g gVar = (ugc.g) eVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(args, "args");
                phc.j jVar = (phc.j) gVar.f280008b;
                Intrinsics.checkNotNullParameter(args, "args");
                return jVar.k.f(args, false).filter(new j(15, new r(16))).firstOrError();
        }
    }
}
