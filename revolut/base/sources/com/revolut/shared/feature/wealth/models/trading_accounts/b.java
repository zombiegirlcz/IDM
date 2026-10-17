package com.revolut.shared.feature.wealth.models.trading_accounts;

import cfl.j;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {
    public static final boolean a(TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard) {
        Intrinsics.checkNotNullParameter(tradingAccountAvailableToOnboard, "<this>");
        return Intrinsics.f(tradingAccountAvailableToOnboard.d, TradingAccountType.Taa.f105275a) && b(tradingAccountAvailableToOnboard.f);
    }

    public static final boolean b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((TradingProduct) it8.next()).f105281b, TradingProductCode.IsaGB.f105316a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard) {
        Intrinsics.checkNotNullParameter(tradingAccountAvailableToOnboard, "<this>");
        return Intrinsics.f(tradingAccountAvailableToOnboard.d, TradingAccountType.Taa.f105275a) && d(tradingAccountAvailableToOnboard.f);
    }

    public static final boolean d(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((TradingProduct) it8.next()).f105281b, TradingProductCode.JIsaGB.f105317a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard) {
        Intrinsics.checkNotNullParameter(tradingAccountAvailableToOnboard, "<this>");
        return tradingAccountAvailableToOnboard.e == j.PERSONAL_JOINT;
    }

    public static final boolean f(TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard) {
        Intrinsics.checkNotNullParameter(tradingAccountAvailableToOnboard, "<this>");
        return Intrinsics.f(tradingAccountAvailableToOnboard.d, TradingAccountType.Taa.f105275a) && g(tradingAccountAvailableToOnboard.f);
    }

    public static final boolean g(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((TradingProduct) it8.next()).f105281b, TradingProductCode.PeaFr.f105321a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean h(TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard) {
        Intrinsics.checkNotNullParameter(tradingAccountAvailableToOnboard, "<this>");
        return c(tradingAccountAvailableToOnboard) && tradingAccountAvailableToOnboard.f105269h.f105177c == cfl.a.SELF;
    }
}
