package x43;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodNavigationDestination;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import h93.f0;
import jf0.c;
import jf0.d;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import q06.k;
import sri.m;
import te0.w;
import ufm.i;
import v2e.x;
import wp5.y;
import wsg.j;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f302786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f302787b;

    public b(m navigator, f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f302786a = navigator;
        this.f302787b = revolutCardsInteractor;
    }

    public static BridgeDestination b(f0 f0Var, String str) {
        return new BridgeDestination(new CompositeCommand(new FeatureCommand(new CardManagementFeatureConfig.Settings(str)), new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SelectPaymentMethodNavigationDestination(new SelectPaymentMethodInputData(new SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings(f0Var, AccountId.Personal.f51414a))), false, (Integer) null, 0, 61))));
    }

    public static boolean c(c cVar) {
        return Intrinsics.f(cVar.e(3), "configure") && Intrinsics.f(cVar.e(4), "spendfrom");
    }

    public static BridgeDestination g(c cVar) {
        if (!Intrinsics.f(cVar.e(2), "details")) {
            if (!Intrinsics.f(cVar.e(3), "pockets")) {
                return null;
            }
            return new BridgeDestination(new FeatureCommand(new CardsScreenFeatureConfig(null, null, null, null, new CardScreenAction.Select(cVar.e(2), 6, false, false), 15)));
        }
        String strE = cVar.e(3);
        String strE2 = cVar.e(4);
        if (strE.length() > 0) {
            return new BridgeDestination(new FeatureCommand(new CardsScreenFeatureConfig(i63.a.DETAILS, strE2, null, null, new CardScreenAction.Select(strE, 6, false, false), 12)));
        }
        return new BridgeDestination(new FeatureCommand(new CardsScreenFeatureConfig(null, null, null, null, CardScreenAction.Idle.f65329a, 15)));
    }

    public static i h(d0 d0Var, boolean z) {
        i iVar = new i(d0Var, new x0i.i(new x(z, 17), 15), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        if (y.D(cVar, "deeplink", 1, "cards")) {
            return Intrinsics.f(cVar.e(2), "details") || Intrinsics.f(cVar.e(3), "pockets") || c(cVar) || Intrinsics.f(cVar.e(3), "configure");
        }
        return false;
    }

    public final i d(i iVar) {
        i iVar2 = new i(iVar, new x0i.i(new x0b.c(this, 16), 16), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof x43.a
            if (r0 == 0) goto L13
            r0 = r7
            x43.a r0 = (x43.a) r0
            int r1 = r0.f302785x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302785x = r1
            goto L1a
        L13:
            x43.a r0 = new x43.a
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302785x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = g(r6)
            if (r7 == 0) goto L4a
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = g(r6)
            kotlin.jvm.internal.Intrinsics.h(r6)
            r7.<init>(r6, r4)
            return r7
        L4a:
            boolean r7 = c(r6)
            if (r7 == 0) goto L77
            r7 = 2
            java.lang.String r6 = r6.e(r7)
            l93.f r7 = r5.f302787b
            ha3.x r7 = (ha3.x) r7
            ufm.b r7 = r7.n(r6)
            r0.u = r6
            r0.f302785x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            h93.f0 r7 = (h93.f0) r7
            q06.h r0 = new q06.h
            kotlin.jvm.internal.Intrinsics.h(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = b(r7, r6)
            r0.<init>(r6, r4)
            return r0
        L77:
            r7 = 3
            java.lang.String r6 = r6.e(r7)
            java.lang.String r7 = "configure"
            kotlin.jvm.internal.Intrinsics.f(r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x43.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (g(deeplink) != null) {
            BridgeDestination bridgeDestinationG = g(deeplink);
            Intrinsics.h(bridgeDestinationG);
            return d(h(w.j(bridgeDestinationG.f98270a), z));
        }
        if (c(deeplink)) {
            String strE = deeplink.e(2);
            i iVar = new i(((ha3.x) this.f302787b).n(strE), new x0i.i(new j(15, strE, this), 14), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return d(h(iVar, z));
        }
        if (Intrinsics.f(deeplink.e(3), "configure")) {
            ufm.b bVarM = d0.m(new FeatureCommand(new CardManagementFeatureConfig.Settings(deeplink.e(2))));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return d(h(bVarM, z && deeplink.l()));
        }
        ufm.b bVarM2 = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
