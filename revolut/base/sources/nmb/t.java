package nmb;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import njj.c1;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f217254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlb.c f217255b;

    public t(dcd.b savingsInterestRateFormatter, vlb.c savingsCalculatorAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(savingsCalculatorAvailabilityProvider, "savingsCalculatorAvailabilityProvider");
        this.f217254a = savingsInterestRateFormatter;
        this.f217255b = savingsCalculatorAvailabilityProvider;
    }

    public final CompositeClause a(SavingsProductData savingsProductData, ImageClause imageClause, Custom custom) {
        TextClause textClause;
        dcd.b bVar = this.f217254a;
        TextClause textClause2 = null;
        PercentageClause percentageClauseK = bVar.k(savingsProductData, null);
        Intrinsics.checkNotNullParameter(savingsProductData, "savingsProductData");
        Double dF = ocd.c.f(savingsProductData);
        ncd.k kVarB = savingsProductData.f86683a.f86621h.b();
        PercentageClause percentageClauseI = (dF == null || kVarB == null) ? null : bVar.i(dF.doubleValue(), kVarB, null);
        if (imageClause != null) {
            m70.a.t(t0.f186434a);
            textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = null;
        }
        if (percentageClauseI != null) {
            Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
            textClause2 = new TextClause(" | ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        Clause[] elements = {imageClause, textClause, percentageClauseK, textClause2, percentageClauseI};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), null, custom, null, 10);
    }

    public final ArrayList b(List list, SavingsProductData savingsProductData, TextLocalisedClause textLocalisedClause, kbb.c cVar) {
        Clause currencyClause;
        CompositeClause compositeClauseA;
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                if (textLocalisedClause == null) {
                    yp0.b.k(arrayList, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
                    return arrayList;
                }
                aim.e eVarB = zhm.u.b();
                eVarB.add(new TextLocalisedClause(R$string.savings_select_currency_screen_rate, null, null, 14));
                eVarB.add(new DotDividerClause((Integer) null));
                eVarB.add(new TextClause((String) cVar.f182549b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                String str = (String) cVar.f182550c;
                if (str != null) {
                    Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
                    eVarB.add(new TextClause(" | ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    eVarB.add(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                String str2 = (String) cVar.d;
                if (str2 != null) {
                    m70.a.t(t0.f186434a);
                    eVarB.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    eVarB.add(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                Unit unit = Unit.f186387a;
                return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("SUBHEADER_ITEM_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) new CompositeClause(zhm.u.a(eVarB), null, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514), null, R$attr.uikit_dp0, R$attr.uikit_dp16, 114);
            }
            ncd.a aVar = (ncd.a) it8.next();
            SavingsProductData savingsProductData2 = aVar.f214169a;
            boolean zF = Intrinsics.f(savingsProductData2.f86683a.f86617a, savingsProductData != null ? savingsProductData.f86683a.f86617a : null);
            SavingsProduct savingsProduct = savingsProductData2.f86683a;
            String str3 = savingsProduct.f86617a;
            xi0.b bVar = savingsProduct.f86618b;
            int i = r.f217253a[savingsProduct.f86619c.ordinal()];
            if (i == 1 || i == 2) {
                currencyClause = new CurrencyClause(bVar, null, null, 6);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                xi0.b.Companion.getClass();
                currencyClause = Intrinsics.f(bVar, xi0.b.f306272g) ? new TextLocalisedClause(R$string.savings_select_currency_screen_mmf_euro_funds_title, null, null, 14) : Intrinsics.f(bVar, xi0.b.i) ? new TextLocalisedClause(R$string.savings_select_currency_screen_mmf_usd_funds_title, null, null, 14) : Intrinsics.f(bVar, xi0.b.f306273h) ? new TextLocalisedClause(R$string.savings_select_currency_screen_mmf_gbp_funds_title, null, null, 14) : new CurrencyClause(bVar, null, null, 6);
            }
            Clause clause = currencyClause;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(savingsProductData2.f86683a.f86618b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), zF ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60);
            Float fValueOf = Float.valueOf(10.0f);
            CompositeClause compositeClauseC = vc.o.o(savingsProductData2) ? pbd.a.c(this.f217254a, savingsProductData2) : null;
            Intrinsics.checkNotNullParameter(savingsProductData2, "<this>");
            CompositeClause compositeClauseA2 = a(savingsProductData2, ocd.c.i(savingsProductData2) ? new ImageClause(R$drawable.uikit_icn_24_lightning, (Integer) null, fValueOf, fValueOf, 18) : null, null);
            if (compositeClauseC == null) {
                SavingsProductData savingsProductData3 = aVar.f214170b;
                compositeClauseA = savingsProductData3 != null ? a(savingsProductData3, null, new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION)) : null;
            } else {
                compositeClauseA = compositeClauseC;
            }
            arrayList.add(new RowDelegate.Model(str3, image40, clause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(compositeClauseA2, compositeClauseA, null, false, 124), false, null, zF, null, null, null, null, null, null, savingsProductData2, null, 0, 0, 0, 0, 532667384));
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f217235a, new nfj.l(domainState, 26), new nk4.o(domainState, 3), new c1(this, domainState, 3));
    }
}
