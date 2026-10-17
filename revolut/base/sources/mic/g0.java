package mic;

import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m9d.y0;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 extends oki.h implements x {

    @NotNull
    private static final b0 Companion = new b0();
    public final PerkDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bgc.e f205659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gic.a f205660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final twg.c f205661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h4g.g f205662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.b f205663t;
    public final ihm.b u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Lazy f205664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f205665x;

    public g0(PerkDetailsFlowContract$InputData inputData, bgc.e rewardsInteractor, gic.a rewardActionMapper, twg.c rewardActionProvider, h4g.g shopsFeatureAvailabilityInteractor, h0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(rewardActionMapper, "rewardActionMapper");
        Intrinsics.checkNotNullParameter(rewardActionProvider, "rewardActionProvider");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f205659p = rewardsInteractor;
        this.f205660q = rewardActionMapper;
        this.f205661r = rewardActionProvider;
        this.f205662s = shopsFeatureAvailabilityInteractor;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f205663t = bVarE;
        od0.h hVar = od0.i.Companion;
        RewardOutlet rewardOutlet = inputData.d;
        hVar.getClass();
        ihm.b bVarE2 = ihm.b.e(od0.h.a(rewardOutlet));
        Intrinsics.checkNotNullExpressionValue(bVarE2, "createDefault(...)");
        this.u = bVarE2;
        this.f205664w = yhm.j.b(new maa.r(this, 4));
        this.f205665x = mra.d.b(this, new k(0), stateMapper, null, false, 12);
    }

    public static efm.r I2(efm.r rVar, Function0 function0) {
        efm.r map = rVar.map(new mhd.c(new ac1.b(13, function0), 4));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // yji.l
    public final void I1() {
        efm.r rVarJ2 = J2();
        efm.r map = this.f205663t.map(new a31.o(27, c0.f205654a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData = this.o;
        String rewardId = perkDetailsFlowContract$InputData.f84922a;
        boolean z = perkDetailsFlowContract$InputData.f;
        ugc.g gVar = (ugc.g) this.f205659p;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        efm.r rVarI2 = I2(pd.b.r(gVar.h(rewardId, z, false), new ugc.b(gVar, 1)), new mfl.b(16));
        efm.r rVarI22 = I2(this.f205661r.I(), new ht0.b0(0, this, g0.class, "emptyMembershipInfo", "emptyMembershipInfo()Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$PartnerMembershipInfo;", 0, 8));
        efm.r rVarJ22 = J2();
        efm.r map2 = this.u.map(new a31.o(29, e0.f205656a));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r map3 = gVar.e().x().map(new a0(0, f0.f205658a));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r rVarE = mif.a.e(rVarJ22, map2, map3);
        final int i = 1;
        efm.r rVarI23 = I2(pd.b.r(rVarE, new Function1(this) { // from class: mic.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f205686b;

            {
                this.f205686b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        vf0.y yVar = (vf0.y) obj2;
                        Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                        ggc.l lVar = (ggc.l) yVar.f288491a;
                        boolean zBooleanValue = ((Boolean) yVar.f288492b).booleanValue();
                        List list = (List) yVar.f288493c;
                        kic.h hVar = (kic.h) yVar.d;
                        od0.i iVar = (od0.i) yVar.e;
                        boolean zBooleanValue2 = ((Boolean) yVar.f).booleanValue();
                        return new k(lVar, zBooleanValue, list, (RewardOutlet) iVar.f224257a, this.f205686b.f205660q.a(lVar, iVar, hVar), hVar, zBooleanValue2);
                    default:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        ggc.l lVar2 = (ggc.l) rVar.f314201a;
                        od0.i iVar2 = (od0.i) rVar.f314202b;
                        od0.i iVar3 = (od0.i) rVar.f314203c;
                        if (lVar2.f143644h.d == ggc.q.ONLINE) {
                            od0.i.Companion.getClass();
                            return zi0.c.j(od0.i.f224256b);
                        }
                        if (iVar2.d()) {
                            return zi0.c.j(iVar2);
                        }
                        g0 g0Var = this.f205686b;
                        bgc.e eVar = g0Var.f205659p;
                        fgc.a args = new fgc.a(g0Var.o.f84922a, (co3.a) iVar3.f224257a);
                        ugc.g gVar2 = (ugc.g) eVar;
                        gVar2.getClass();
                        Intrinsics.checkNotNullParameter(args, "args");
                        phc.j jVar = (phc.j) gVar2.f280008b;
                        Intrinsics.checkNotNullParameter(args, "args");
                        return jVar.k.f(args, true);
                }
            }
        }), new mfl.b(17));
        Continuation continuation = null;
        efm.r map4 = te0.w.o0(p0.f264003c, new y0(this, continuation, 14)).x().map(new a31.o(28, d0.f205655a));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        final int i2 = 0;
        yji.l.a1(this, rd0.e.b(nim.a.w(ue0.e.q(mif.a.h(rVarJ2, map, rVarI2, rVarI22, rVarI23, map4), zhm.y0.b(new Pair("PerkDetailsScreenModel", "observeDomainState"))), new Function1(this) { // from class: mic.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f205686b;

            {
                this.f205686b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        vf0.y yVar = (vf0.y) obj2;
                        Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                        ggc.l lVar = (ggc.l) yVar.f288491a;
                        boolean zBooleanValue = ((Boolean) yVar.f288492b).booleanValue();
                        List list = (List) yVar.f288493c;
                        kic.h hVar = (kic.h) yVar.d;
                        od0.i iVar = (od0.i) yVar.e;
                        boolean zBooleanValue2 = ((Boolean) yVar.f).booleanValue();
                        return new k(lVar, zBooleanValue, list, (RewardOutlet) iVar.f224257a, this.f205686b.f205660q.a(lVar, iVar, hVar), hVar, zBooleanValue2);
                    default:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        ggc.l lVar2 = (ggc.l) rVar.f314201a;
                        od0.i iVar2 = (od0.i) rVar.f314202b;
                        od0.i iVar3 = (od0.i) rVar.f314203c;
                        if (lVar2.f143644h.d == ggc.q.ONLINE) {
                            od0.i.Companion.getClass();
                            return zi0.c.j(od0.i.f224256b);
                        }
                        if (iVar2.d()) {
                            return zi0.c.j(iVar2);
                        }
                        g0 g0Var = this.f205686b;
                        bgc.e eVar = g0Var.f205659p;
                        fgc.a args = new fgc.a(g0Var.o.f84922a, (co3.a) iVar3.f224257a);
                        ugc.g gVar2 = (ugc.g) eVar;
                        gVar2.getClass();
                        Intrinsics.checkNotNullParameter(args, "args");
                        phc.j jVar = (phc.j) gVar2.f280008b;
                        Intrinsics.checkNotNullParameter(args, "args");
                        return jVar.k.f(args, true);
                }
            }
        })), null, null, new m75.i(this, continuation, 28), 3);
    }

    public final efm.r J2() {
        Object value = this.f205664w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (efm.r) value;
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.v) {
            return;
        }
        n2(new mci.e(this, null, 5), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f205665x;
    }
}
