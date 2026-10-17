package v77;

import akg.n;
import com.revolut.feature.global_markets.domain.MarketAsset;
import cxe.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tzg.j;
import ua2.r;
import ufm.g;
import v6l.b0;
import wkm.l;
import x8h.k;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements l77.a {

    @NotNull
    public static final b Companion = new b();
    public static final j d = j.ONE_DAY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f286568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f286569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f286570c;

    public e(g performanceInteractor, ybl.b instrumentTickerInteractor, k displayCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(performanceInteractor, "performanceInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        this.f286568a = performanceInteractor;
        this.f286569b = instrumentTickerInteractor;
        this.f286570c = displayCurrencyInteractor;
    }

    public final n a(List marketAssets) {
        Intrinsics.checkNotNullParameter(marketAssets, "marketAssets");
        l lVarB = this.f286570c.b();
        h0 h0Var = h0.f322473a;
        u uVarA = nim.a.A(nim.a.v(xam.a.h(new d(this, marketAssets, null), rd0.e.e(rd0.e.n(lVarB, h0Var), h0Var, new c(0))), new a(marketAssets, 0)), new b0(23));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : marketAssets) {
            if (obj2 instanceof MarketAsset.Index) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((MarketAsset.Index) it8.next()).getF74573c());
        }
        return nim.a.v(u0.m(uVarA, nim.a.v(rd0.e.b(arrayList2.isEmpty() ? zi0.c.j(f0.f322471a) : ((ael.k) this.f286569b).i(arrayList2, n9l.b.SEC_3)), new r(6, arrayList))), new s78.n(marketAssets, 29));
    }
}
