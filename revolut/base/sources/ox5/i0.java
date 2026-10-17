package ox5;

import com.revolut.feature.cryptocommodity_invest.api.CryptoCommodityInvestApi$Toggles;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import le.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b f230579w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f230579w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0(this.f230579w, continuation, 0);
            case 1:
                return new i0(this.f230579w, continuation, 1);
            default:
                return new i0(this.f230579w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar = this.f230579w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarC = ((gi5.d) bVar.E).c(null);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarC, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar.H2(bVar.N, new bke.o((sh5.c) obj2, 12));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar2 = this.f230579w;
                    efm.r rVarDistinctUntilChanged = bVar2.f71573y.c(tzg.a.MAIN_PAGE, xzg.o.CRYPTO).distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                    vkm.d dVarB = rd0.e.b(pd.b.r(rVarDistinctUntilChanged, new c0(bVar2, 4)));
                    blj.t tVar = new blj.t(bVar2, 18);
                    this.v = 1;
                    if (dVarB.collect(tVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar3 = this.f230579w;
                cli.y yVar = bVar3.N;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ow5.b bVar4 = bVar3.F;
                    this.v = 1;
                    obj2 = bVar4.a(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                bVar3.H2(yVar, new ocb.u(zBooleanValue, 8));
                if (!zBooleanValue) {
                    Continuation continuation = null;
                    yji.l.b1(bVar3, boh.f.e(nim.a.v(rd0.e.b(((xv5.h) bVar3.f71566p).b()), new ou6.o(22)), new c0(bVar3, 2)), null, new l0(bVar3, continuation, 6), 3);
                    bVar3.L2();
                    b9k.f fVar = bVar3.v;
                    w0h.d assetType = w0h.d.CRYPTO;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(assetType, "assetType");
                    tsk.t tVar2 = (tsk.t) fVar.f13817b;
                    xzg.j0 assetType2 = b9k.f.D(assetType);
                    Intrinsics.checkNotNullParameter(assetType2, "assetType");
                    e8h.i0 i0Var = (e8h.i0) tVar2.f274170b;
                    Intrinsics.checkNotNullParameter(assetType2, "assetType");
                    o8h.g gVar = i0Var.f123695b;
                    String key = u1.g(assetType2, e8h.j0.f123700a);
                    Intrinsics.checkNotNullParameter(key, "key");
                    efm.r map = rd0.e.c(gVar.f223031a.C0("TopMoversKEY_FILTER".concat(key), o8h.g.f223030c), kotlin.coroutines.g.f186406a).map(new o5i.a(13, new o69.b(27)));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    efm.r rVarSwitchMap = te0.w.f0(map).distinctUntilChanged().switchMap(new x9h.d(0, new x9h.c(fVar, assetType, 0)));
                    Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                    yji.l.b1(bVar3, nim.a.v(rd0.e.b(rVarSwitchMap), new ou6.o(27)), null, new l0(bVar3, continuation, 7), 3);
                    jte.d dVar = (jte.d) bVar3.B;
                    boolean zC = dVar.c(CryptoCommodityInvestApi$Toggles.TradeTrendingSection.f71496c);
                    w4l.h hVar = w4l.h.f294642c;
                    if (zC) {
                        yji.l.b1(bVar3, boh.f.e(bVar3.A.g(cw5.e.ONE_DAY, cw5.d.CRYPTO, hVar), new c0(bVar3, 0)), null, new l0(bVar3, continuation, 8), 3);
                    } else {
                        bVar3.H2(yVar, new ou6.o(21));
                    }
                    if (!dVar.c(StakingApi$FeatureToggles.StakeBlocked.f88057c)) {
                        yji.l.b1(bVar3, boh.f.e(vkm.q.r(new d0(0), bVar3.f71572x.e(hVar)), new c0(bVar3, 3)), null, new l0(bVar3, continuation, 2), 3);
                    }
                    bVar3.n2(new i0(bVar3, continuation, 1), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
