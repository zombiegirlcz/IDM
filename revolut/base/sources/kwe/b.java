package kwe;

import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import yte.n;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static StartUpPocket a(String pocketId, n contextType, TopUpTarget topUpTarget) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        int i = a.f190329a[contextType.ordinal()];
        if (i == 1) {
            return new StartUpPocket.FiatCurrencyAccount(pocketId);
        }
        if (i == 2) {
            return new StartUpPocket.ProAccount(pocketId);
        }
        if (i == 3) {
            return new StartUpPocket.JointAccount(pocketId);
        }
        if (i == 4 || i == 5) {
            return topUpTarget instanceof TopUpTarget.Joint ? new StartUpPocket.JointAccount(pocketId) : new StartUpPocket.FiatCurrencyAccount(pocketId);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Move money not supported for context " + contextType);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, illegalStateException, h0Var);
        return new StartUpPocket.FiatCurrencyAccount(pocketId);
    }
}
