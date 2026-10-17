package pmb;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pij.d1;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tmb.b f237544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcd.b f237545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yik.h f237546c;
    public final vlb.c d;

    public r(tmb.b productSelectionSubtitleMapper, tmb.a productSelectionDisclosureMapper, dcd.b savingsInterestRateFormatter, yik.h pricingPlanStringMapper, vlb.c savingsCalculatorAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(productSelectionSubtitleMapper, "productSelectionSubtitleMapper");
        Intrinsics.checkNotNullParameter(productSelectionDisclosureMapper, "productSelectionDisclosureMapper");
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(savingsCalculatorAvailabilityProvider, "savingsCalculatorAvailabilityProvider");
        this.f237544a = productSelectionSubtitleMapper;
        this.f237545b = savingsInterestRateFormatter;
        this.f237546c = pricingPlanStringMapper;
        this.d = savingsCalculatorAvailabilityProvider;
    }

    public final ArrayList a(List list, ArrayList arrayList, SavingsProductData savingsProductData, boolean z, TextLocalisedClause textLocalisedClause) {
        Object next;
        CompositeClause compositeClause;
        List<SavingsProductData> list2 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (SavingsProductData savingsProductData2 : list2) {
            boolean zF = Intrinsics.f(savingsProductData2.f86683a.f86617a, savingsProductData != null ? savingsProductData.f86683a.f86617a : null);
            SavingsProduct savingsProduct = savingsProductData2.f86683a;
            xi0.b bVar = savingsProduct.f86618b;
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                SavingsProductData savingsProductData3 = (SavingsProductData) next;
                if (!Intrinsics.f(savingsProductData3.f86683a.f86617a, savingsProduct.f86617a) && Intrinsics.f(savingsProductData3.f86683a.f86618b, savingsProduct.f86618b)) {
                    break;
                }
            }
            SavingsProductData savingsProductData4 = (SavingsProductData) next;
            String str = savingsProduct.f86617a;
            CurrencyClause currencyClause = new CurrencyClause(bVar, null, null, 6);
            CurrencyClause currencyClause2 = new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), zF ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60);
            Intrinsics.checkNotNullParameter(savingsProductData2, "<this>");
            boolean zI = ocd.c.i(savingsProductData2);
            dcd.b bVar2 = this.f237545b;
            CompositeClause compositeClauseA = pbd.a.a(bVar2, savingsProductData2, null, 6);
            CompositeClause compositeClauseC = vc.o.o(savingsProductData2) ? pbd.a.c(bVar2, savingsProductData2) : null;
            if (zI) {
                int i = R$drawable.uikit_icn_24_lightning;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
                Float fValueOf = Float.valueOf(10.0f);
                compositeClause = new CompositeClause(v.k(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16), compositeClauseA), null, null, null, 14);
            } else {
                compositeClause = compositeClauseA;
            }
            arrayList2.add(new RowDelegate.Model(str, image40, currencyClause, null, 0, currencyClause2, null, null, 0, new RowDelegate.Model.c.b(compositeClause, compositeClauseC == null ? savingsProductData4 != null ? pbd.a.a(bVar2, savingsProductData4, new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), 4) : null : compositeClauseC, null, false, 124), z, null, zF, null, null, null, null, null, null, savingsProductData2, null, 0, 0, 0, 0, 532665304));
        }
        if (textLocalisedClause != null) {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("SUBHEADER_ITEM_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            int i2 = R$attr.uikit_dp0;
            return yp0.b.g(arrayList2, model, null, i2, i2, 114);
        }
        int i3 = R$attr.uikit_dp0;
        yp0.b.k(arrayList2, i3, i3, 0, 0, 28);
        return arrayList2;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f237529a, new d1(domainState, 17), new plb.g(domainState, 5), new ox2.d(this, domainState, 16));
    }
}
