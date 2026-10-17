package bmb;

import aw0.o9;
import blh.y;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.jf;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.shared.savings.models.product.ProductGroupOptions;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f16809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f16810b;

    public w(dcd.b savingsInterestRateFormatter, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f16809a = savingsInterestRateFormatter;
        this.f16810b = featureToggleInteractor;
    }

    public final RowDelegate.Model a(ProductGroupOptions.GroupOption groupOption) {
        Clause textClause;
        int i;
        ArrayList<ProductGroupOptions.GroupOption.Highlight> arrayList = groupOption.f;
        ProductGroupOptions.GroupOption.DisplayRate displayRate = groupOption.d;
        ncd.g gVar = groupOption.f86597a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (ProductGroupOptions.GroupOption.Highlight highlight : arrayList) {
            ncd.b bVar = highlight.f86602a;
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            int i2 = npg.h.f218214a[bVar.ordinal()];
            if (i2 == 1) {
                i = R$drawable.uikit_icn_24_check_verification;
            } else if (i2 == 2) {
                i = R$drawable.uikit_icn_24_globe;
            } else if (i2 == 3) {
                i = R$drawable.uikit_icn_24_refinancing;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_savings_vault;
            }
            arrayList2.add(new jf(new TextClause(highlight.f86603b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, new ImageTransformations(null, null, null, null, null, 16, 16, 31), (Clause) null, 182)));
        }
        String string = gVar.toString();
        TextClause textClause2 = new TextClause(groupOption.f86599c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        CurrencyImage currencyImage = new CurrencyImage(displayRate.f86600a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        String str = groupOption.e;
        if (str != null && str.length() != 0) {
            if (((jte.d) this.f16810b).c(SavingsApi$Toggles.SavingsHYSRevamp.f83082c)) {
                List listK = zhm.v.k(new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorBackground), true, null, false, null, Constants.TAG_FC_SPEED_MODE), (Integer) null, false, (o9) null, (List) null, 124), new TextClause(displayRate.f86601b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorBackground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124));
                m70.a.t(t0.f186434a);
                textClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
            return new RowDelegate.Model(string, null, textClause2, null, 0, null, null, null, 0, new RowDelegate.Model.c.a(new TagViewData(currencyImage, textClause, new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorAccentNeutral)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorAccentNeutral), false, null, null, null, 0, null, 2024), null, false, 6), false, arrayList2, false, null, null, null, null, null, null, new k(gVar), null, 0, 0, 0, 0, 532671482);
        }
        textClause = new TextClause(displayRate.f86601b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorBackground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        return new RowDelegate.Model(string, null, textClause2, null, 0, null, null, null, 0, new RowDelegate.Model.c.a(new TagViewData(currencyImage, textClause, new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorAccentNeutral)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorAccentNeutral), false, null, null, null, 0, null, 2024), null, false, 6), false, arrayList2, false, null, null, null, null, null, null, new k(gVar), null, 0, 0, 0, 0, 532671482);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f16790a, new y(12), new bk6.n(12), new b88.o(this, 11));
    }
}
