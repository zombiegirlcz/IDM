package ox5;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b f230594w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f230594w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l0 l0Var = new l0(this.f230594w, continuation, 0);
                l0Var.v = obj2;
                return l0Var;
            case 1:
                l0 l0Var2 = new l0(this.f230594w, continuation, 1);
                l0Var2.v = obj2;
                return l0Var2;
            case 2:
                l0 l0Var3 = new l0(this.f230594w, continuation, 2);
                l0Var3.v = obj2;
                return l0Var3;
            case 3:
                l0 l0Var4 = new l0(this.f230594w, continuation, 3);
                l0Var4.v = obj2;
                return l0Var4;
            case 4:
                l0 l0Var5 = new l0(this.f230594w, continuation, 4);
                l0Var5.v = obj2;
                return l0Var5;
            case 5:
                l0 l0Var6 = new l0(this.f230594w, continuation, 5);
                l0Var6.v = obj2;
                return l0Var6;
            case 6:
                l0 l0Var7 = new l0(this.f230594w, continuation, 6);
                l0Var7.v = obj2;
                return l0Var7;
            case 7:
                l0 l0Var8 = new l0(this.f230594w, continuation, 7);
                l0Var8.v = obj2;
                return l0Var8;
            case 8:
                l0 l0Var9 = new l0(this.f230594w, continuation, 8);
                l0Var9.v = obj2;
                return l0Var9;
            default:
                l0 l0Var10 = new l0(this.f230594w, continuation, 9);
                l0Var10.v = obj2;
                return l0Var10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l0) create((iw5.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l0) create((iw5.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((l0) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((l0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((l0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((l0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l0) create((ny5.v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Integer numM;
        int i = this.u;
        int i2 = 6;
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar = this.f230594w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.N, new m9d.w0((Data) pair.f186385a, (Data) pair.f186386b, 6));
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.N, new oph.k(data, 28));
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.N, new oph.k(data2, 29));
                return Unit.f186387a;
            case 3:
                cli.y yVar = bVar.N;
                iw5.g gVar = (iw5.g) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(gVar, iw5.b.f168962a)) {
                    bVar.B2();
                } else if (gVar instanceof iw5.e) {
                    bVar.H2(yVar, new ou6.o(23));
                } else if (gVar instanceof iw5.f) {
                    bVar.W0(((iw5.f) gVar).f168965a);
                } else if (Intrinsics.f(gVar, iw5.c.f168963a)) {
                    bVar.H2(yVar, new ou6.o(26));
                } else {
                    if (!(gVar instanceof iw5.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ty0.a clickData = ((iw5.d) gVar).f168964a;
                    Intrinsics.checkNotNullParameter(clickData, "clickData");
                    CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) bVar.E).d(clickData);
                    if (cryptoFcaRisksDestinationD != null) {
                        bVar.C1(zh9.u0.c(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) cryptoFcaRisksDestinationD, false, (Integer) null, 0, 61)));
                    }
                }
                return Unit.f186387a;
            case 4:
                iw5.i state = (iw5.i) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lx5.b bVar2 = (lx5.b) bVar.G;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                bVar2.f200527a.setValue(state);
                return Unit.f186387a;
            case 5:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(popupMenuItem.getF55172b(), "CRYPTO_TRADE_WATCHLIST_SHOW_UP_TO")) {
                    bVar.I = !bVar.I;
                    String str = bVar.H;
                    if (str != null) {
                        bVar.M2(str);
                    }
                } else if (kotlin.text.a0.H(popupMenuItem.getF55172b(), "CRYPTO_TRADE_WATCHLIST_LIMIT_", false) && (numM = kotlin.text.z.m(kotlin.text.d0.e0(popupMenuItem.getF55172b(), "CRYPTO_TRADE_WATCHLIST_LIMIT_"))) != null) {
                    int iIntValue = numM.intValue();
                    bVar.n2(new cam.q(iIntValue, 9, bVar, null), new whi.b(6));
                    bVar.H2(bVar.N, new l2c.l(iIntValue, i2));
                    bVar.H = null;
                    bVar.I = false;
                }
                return Unit.f186387a;
            case 6:
                Data data3 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.N, new m0(data3, 0));
                return Unit.f186387a;
            case 7:
                Data data4 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.N, new m0(data4, 1));
                return Unit.f186387a;
            case 8:
                Data data5 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.N, new m0(data5, 2));
                return Unit.f186387a;
            default:
                ny5.v vVar = (ny5.v) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.N, new n0(vVar, 0));
                return Unit.f186387a;
        }
    }
}
