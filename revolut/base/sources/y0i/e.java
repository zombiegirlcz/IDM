package y0i;

import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import d8b.h;
import efm.d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.z;
import q06.k;
import sri.m;
import te0.w;
import ufm.i;
import wp5.y;
import yhm.j;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements jf0.d, k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f310217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f310218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f310219c;
    public final Lazy d;

    public e(m navigator, ai5.b cryptoNavigationInterceptor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f310217a = cryptoNavigationInterceptor;
        this.f310218b = navigator;
        this.f310219c = featureToggleInteractor;
        this.d = j.b(new xsf.c(25));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "exchange") && Intrinsics.f(cVar.e(2), "crypto");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f310217a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f310217a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f310217a.d(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof y0i.d
            if (r0 == 0) goto L13
            r0 = r6
            y0i.d r0 = (y0i.d) r0
            int r1 = r0.f310216x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310216x = r1
            goto L1a
        L13:
            y0i.d r0 = new y0i.d
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f310216x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            q06.c r5 = r0.u
            yhm.o.b(r6)
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            kotlin.Pair r5 = r4.g(r5)
            java.lang.Object r6 = r5.f186385a
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            java.lang.Object r5 = r5.f186386b
            q06.c r5 = (q06.c) r5
            r0.u = r5
            r0.f310216x = r3
            ai5.b r2 = r4.f310217a
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            q06.h r0 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1.<init>(r6)
            r0.<init>(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y0i.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        xy7.j jVar = new xy7.j(17, new wo5.a(this, deeplink, z, 2));
        d0VarB.getClass();
        i iVar = new i(d0VarB, jVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final Pair g(jf0.c cVar) {
        Object next;
        FeatureConfig buy;
        FeatureCommand featureCommand;
        com.revolut.shared.feature.move_money.api.navigation.a aVar;
        String strE = cVar.e(3);
        HashMap map = cVar.d;
        Lazy lazyY0 = w.y0(new h(strE, 12));
        Lazy lazyY02 = w.y0(new cji.c(this, lazyY0));
        if (strE.length() == 0 || !((Boolean) lazyY02.getValue()).booleanValue()) {
            return new Pair((FeatureCommand) this.d.getValue(), null);
        }
        a aVar2 = b.Companion;
        String str = cVar.e(4);
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(str, "str");
        Iterator<E> it8 = b.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((b) next).b(), str, true)) {
                break;
            }
        }
        b bVar = (b) next;
        if (bVar == null) {
            bVar = b.Buy;
        }
        String str2 = (String) map.get("orderType");
        wd6.h hVar = (str2 == null || !str2.equalsIgnoreCase("TPSL")) ? wd6.h.MARKET : wd6.h.TAKE_PROFIT_STOP_LOSS;
        String str3 = (String) map.get("amount");
        Long lN = str3 != null ? z.n(str3) : null;
        wd6.c cVar2 = cp5.d.z((xi0.b) lazyY0.getValue()) ? wd6.c.CRYPTO_ONLY : wd6.c.ALL;
        if (((jte.d) this.f310219c).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c)) {
            StartUpPocket.CurrencyAccount currencyAccount = new StartUpPocket.CurrencyAccount((xi0.b) lazyY0.getValue());
            int i = c.f310214a[bVar.ordinal()];
            if (i == 1) {
                aVar = com.revolut.shared.feature.move_money.api.navigation.a.TARGET;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = com.revolut.shared.feature.move_money.api.navigation.a.SOURCE;
            }
            featureCommand = u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(currencyAccount, aVar, 4), (Set) null, 6), null));
        } else {
            int i2 = c.f310214a[bVar.ordinal()];
            if (i2 == 1) {
                buy = new ExchangeFeatureConfig.Buy(null, (xi0.b) lazyY0.getValue(), null, cVar2, null, null, false, null, 4085);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buy = new ExchangeFeatureConfig.Sell((xi0.b) lazyY0.getValue(), null, lN, hVar, cVar2, null, null, 4066);
            }
            featureCommand = new FeatureCommand(buy);
        }
        return new Pair(featureCommand, new q06.b(ibb.c.f160140a, null));
    }
}
