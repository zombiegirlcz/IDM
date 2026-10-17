package ny5;

import aw0.o9;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.pe;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import ip0.gu;
import ip0.nf0;
import ip0.of0;
import ip0.pb0;
import ip0.za0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements gw5.b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List c(int i, String str) {
        IntRange intRangeO = kotlin.ranges.f.o(0, i);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            nf0 nf0Var = new nf0(ce9.m.A("RateSmallCardLoading_" + it8.nextInt(), str), of0.ACCENT);
            yp0.b.l(nf0Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(nf0Var);
        }
        return zhm.u.c(i(str, arrayList));
    }

    public static n9l.a d(List list, xi0.b bVar) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((n9l.a) next).f213661a, bVar)) {
                break;
            }
        }
        return (n9l.a) next;
    }

    public static Clause f(n9l.a aVar, xi0.b bVar) {
        if (aVar == null) {
            return null;
        }
        xi0.b bVar2 = aVar.f213662b;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(aVar.f213663c);
        if (cp5.d.z(bVar)) {
            Intrinsics.h(bigDecimalValueOf);
            return u5l.a.b(u80.q.a(bigDecimalValueOf, bVar2), o9.NON_SENSITIVE, null, null, 14);
        }
        Intrinsics.h(bigDecimalValueOf);
        return new RateClause(bigDecimalValueOf, bVar2, new RateClause.Format.Default(null, true), null);
    }

    public static vel.a g(List list, xi0.b bVar) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((vel.a) next).f288344a, bVar)) {
                break;
            }
        }
        return (vel.a) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.revolut.core.ui_kit.models.CurrencyClause$Format, com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.revolut.core.ui_kit.models.CurrencyClause] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static ArrayList h(e eVar, List list, List list2, List list3, List list4, Function1 function1, Function1 function12, boolean z, String str, int i) {
        xi0.b bVar;
        xi0.b bVar2;
        ?? r92;
        Function1 function13;
        CurrencyClause currencyClause;
        ?? currencyClause2;
        Object aVar;
        BigDecimal bigDecimal;
        ?? r110 = 0;
        Function1 function14 = (i & 16) != 0 ? null : function1;
        Function1 function15 = (i & 32) != 0 ? null : function12;
        boolean z3 = (i & 64) != 0 ? true : z;
        eVar.getClass();
        List list5 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list5, 10));
        Iterator it8 = list5.iterator();
        while (it8.hasNext()) {
            xi0.b bVar3 = (xi0.b) it8.next();
            n9l.a aVarD = d(list2, bVar3);
            vel.a aVarG = g(list3, bVar3);
            if (aVarD == null || (bVar = aVarD.f213661a) == null) {
                bVar = bVar3;
            }
            String str2 = bVar.f306286a;
            xi0.b.Companion.getClass();
            boolean zContains = list4.contains(xi0.a.a(str2));
            String strA = ce9.m.A(str2, str);
            boolean z4 = z3;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str2, (ImageTransformations) r110, (TextLocalisedClause) r110, 14), d8l.d.b(zContains), null, false, null, false, 60);
            if (aVarD == null || (bVar2 = aVarD.f213661a) == null) {
                bVar2 = bVar3;
            }
            Iterator it9 = it8;
            CurrencyClause currencyClause3 = new CurrencyClause(bVar2, r110, r110, 6);
            ?? r152 = function15 != null ? (BigDecimal) function15.invoke(bVar3) : r110;
            if (r152 != 0) {
                function13 = function15;
                currencyClause = currencyClause3;
                r92 = 0;
                currencyClause2 = new TextLocalisedClause(R$string.crypto_trade_trending_volumeChange, zhm.u.c(new CompositeClause(zhm.v.k(new TextClause(r152.signum() >= 0 ? "+" : "", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new PercentageClause((BigDecimal) r152, (PercentageClause.Format) null, (Style) null, 6)), null, null, null, 14)), null, 12);
            } else {
                r92 = r110;
                function13 = function15;
                currencyClause = currencyClause3;
                currencyClause2 = r110;
            }
            if (currencyClause2 == 0) {
                currencyClause2 = new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, r92, 4);
            }
            Clause clause = (Clause) currencyClause2;
            RowDelegate.Model.c.b bVar4 = new RowDelegate.Model.c.b(f(aVarD, bVar3), (aVarG == null || (bigDecimal = aVarG.f288346c) == null) ? r92 : xqi.a.b(bigDecimal, false, 7), null, false, 124);
            if (function14 == null || (aVar = function14.invoke(str2)) == null) {
                aVar = new zv5.a(str2);
            }
            arrayList.add(new RowDelegate.Model(strA, image40, currencyClause, null, 0, clause, null, null, 0, bVar4, false, null, zContains, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532667352));
            it8 = it9;
            z3 = z4;
            function15 = function13;
            r110 = r92;
        }
        if (!z3) {
            return arrayList;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public static hg i(String str, ArrayList arrayList) {
        String strA = ce9.m.A("RatesScroller", str);
        SmallCardDelegate.INSTANCE.getClass();
        return new hg(strA, arrayList, 2, new y4(SmallCardDelegate.f53351j), null, new gg.c(0), false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28624);
    }

    public final ArrayList e(int i, gw5.a ratesStyle, String listIdPrefix) {
        List listC;
        Intrinsics.checkNotNullParameter(ratesStyle, "ratesStyle");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        List listC2 = zhm.u.c(new gu(ce9.m.A("RatesListSubheaderLoading", listIdPrefix), 0, 0, 30));
        int i2 = f.f220670a[ratesStyle.ordinal()];
        if (i2 == 1) {
            listC = c(i, listIdPrefix);
        } else if (i2 == 2) {
            IntRange intRangeO = kotlin.ranges.f.o(0, i);
            ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
            vim.f it8 = intRangeO.iterator();
            while (it8.f289625c) {
                arrayList.add(new pb0(ce9.m.A("RateSmallCardLoading_" + it8.nextInt(), listIdPrefix)));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            listC = arrayList;
        } else if (i2 == 3) {
            String strA = ce9.m.A("RatesRewardsLoading", listIdPrefix);
            IntRange intRangeO2 = kotlin.ranges.f.o(0, i);
            ArrayList arrayList2 = new ArrayList(zhm.w.t(intRangeO2, 10));
            vim.f it9 = intRangeO2.iterator();
            while (it9.f289625c) {
                arrayList2.add(new pe(ce9.m.A("RatesRewardsLoading" + it9.nextInt(), listIdPrefix)));
            }
            za0 za0Var = new za0(strA, arrayList2);
            yp0.b.l(za0Var, 0, 0, 0, 0, null, false, 63);
            listC = zhm.u.c(za0Var);
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            listC = c(i, listIdPrefix);
        }
        return d0.E0(listC, listC2);
    }
}
