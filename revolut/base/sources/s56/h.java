package s56;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ DeFiSendAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DeFiSendAmountScreen deFiSendAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = deFiSendAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar;
        String strJ2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.defi.remittances.impl.ui.send.amount.b bVar = (com.revolut.feature.defi.remittances.impl.ui.send.amount.b) this.u.d();
        cli.y yVar = bVar.z;
        o oVar = (o) ((j2) yVar.f22677a).getValue();
        DeFiBalance deFiBalance = oVar.f259975h;
        if (deFiBalance == null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "DeFiSendAmountScreenModel", "Trying to switch input mode before loading assetInBalance", null, h0Var);
        } else {
            DeFiAssetDetails deFiAssetDetails = oVar.f259974g;
            if (deFiAssetDetails == null) {
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "DeFiSendAmountScreenModel", "Trying to switch input mode before loading assetOut", null, h0Var2);
            } else {
                DefiCurrency defiCurrency = deFiAssetDetails.f71665a;
                xi0.b bVar2 = oVar.f259976j;
                if (bVar2 == null) {
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "DeFiSendAmountScreenModel", "Trying to switch input mode before loading baseFiatCurrency", null, h0Var3);
                } else {
                    n nVar2 = oVar.f259973c;
                    int[] iArr = n0.f259970a;
                    int i = iArr[nVar2.ordinal()];
                    if (i == 1) {
                        nVar = n.SECONDARY;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar = n.ASSET_OUT;
                    }
                    boolean zF = Intrinsics.f(deFiBalance.f71635a, defiCurrency.f71671a);
                    i56.e eVar = (i56.e) oVar.i.getContent();
                    if (kotlin.text.d0.W(oVar.f259972b)) {
                        strJ2 = "";
                    } else if (eVar != null) {
                        int i2 = iArr[nVar.ordinal()];
                        if (i2 == 1) {
                            strJ2 = bVar.J2(eVar.d.a(), defiCurrency.getCurrency());
                        } else if (i2 == 2 && zF) {
                            strJ2 = bVar.J2(eVar.e.f71694a, bVar2);
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            strJ2 = bVar.J2(eVar.f158768b.a(), deFiBalance.getCurrency());
                        }
                    }
                    bVar.H2(yVar, new s31.a(strJ2, nVar, 7));
                }
            }
        }
        return Unit.f186387a;
    }
}
