package ts6;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.standingordertopup.api.navigation.destination.AutoTopUpFlowDestination;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f273998b;

    public /* synthetic */ d(s0 s0Var, int i) {
        this.f273997a = i;
        this.f273998b = s0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand naviCommandE;
        switch (this.f273997a) {
            case 0:
                ParcelableDestination parcelableDestination = (ParcelableDestination) obj2;
                sri.m mVar = this.f273998b.f274030m;
                if (parcelableDestination instanceof BridgeDestination) {
                    naviCommandE = ((BridgeDestination) parcelableDestination).f98270a;
                } else {
                    Intrinsics.h(parcelableDestination);
                    naviCommandE = zh9.u0.e(parcelableDestination);
                }
                mVar.c(naviCommandE);
                return Unit.f186387a;
            case 1:
                ParcelableDestination destination = (ParcelableDestination) obj2;
                Intrinsics.checkNotNullParameter(destination, "destination");
                kotlinx.coroutines.d dVar = skm.p0.f264003c;
                s0 s0Var = this.f273998b;
                return new ufm.i(te0.w.o0(dVar, new i(s0Var, null, 3)), new ts5.o(9, new tkm.d(destination, s0Var, 20)), 1).w();
            case 2:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return s0.l(this.f273998b, null, 3);
            case 3:
                od0.i cardOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(cardOptional, "cardOptional");
                h93.f0 f0Var = (h93.f0) cardOptional.g();
                s0 s0Var2 = this.f273998b;
                return s0.n(s0Var2, null, f0Var != null ? s0Var2.f274031n.c(new CardScreenAction.AddToGooglePay(f0Var.f150110a), AccountId.Personal.f51414a) : null, 3);
            case 4:
                io3.d baseCurrencyPocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(baseCurrencyPocket, "baseCurrencyPocket");
                return s0.n(this.f273998b, baseCurrencyPocket.f163145a, zh9.u0.f(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, z92.f.j(baseCurrencyPocket).f115083b, null, TopUpTarget.Pro.f90574a, null, 26))), 2);
            case 5:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return s0.l(this.f273998b, null, 3);
            case 6:
                io3.d baseCurrencyPocket2 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(baseCurrencyPocket2, "baseCurrencyPocket");
                return s0.n(this.f273998b, baseCurrencyPocket2.f163145a, zh9.u0.f(new AutoTopUpFlowDestination(z92.f.j(baseCurrencyPocket2).f115083b, io3.l.MERCHANT, null)), 2);
            default:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return this.f273998b.k(u0.SHOW_INTRO);
        }
    }
}
