package rnb;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pcd.l0;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements djb.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f255588a;

    public x(ybl.k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f255588a = tradingAccountsInteractor;
    }

    public final efm.r a(List moneyBoxes, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(moneyBoxes, "moneyBoxes");
        List list = moneyBoxes;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (((pcd.s) it8.next()).e == l0.MONEY_MARKET_FUND_SAVINGS) {
                    return nim.a.w(rd0.e.c(ybl.k.k(this.f255588a, loadingStrategy, null, null, 6), kotlin.coroutines.g.f186406a), new rm2.s(28));
                }
            }
        }
        od0.i.Companion.getClass();
        return zi0.c.j(od0.i.f224256b);
    }
}
