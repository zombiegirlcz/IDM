package ynj;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanCoverageCode;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.t1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static CountryImage a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new CountryImage(countryCode.f297794a, (Integer) null, (ez0.e) (0 == true ? 1 : 0), 14);
    }

    public static Clause b(EsimCoverage coverage, String str) {
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        if (coverage instanceof EsimCoverage.Country) {
            return new CountryClause(((EsimCoverage.Country) coverage).f100204a, null);
        }
        if (coverage instanceof EsimCoverage.Regional) {
            return n(((EsimCoverage.Regional) coverage).f100209b);
        }
        if (coverage instanceof EsimCoverage.Global) {
            return new TextLocalisedClause(R$string.esim_country_picker_global_title, null, null, 14);
        }
        if (!(coverage instanceof EsimCoverage.Undefined)) {
            throw new NoWhenBranchMatchedException();
        }
        if (str == null) {
            ((EsimCoverage.Undefined) coverage).getF100209b();
            str = "UNKNOWN";
        }
        return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static Clause d(t1 subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return b(subscription.d, subscription.f113652c);
    }

    public static Image e(int i, c cVar) {
        int i2 = d.f315481b[cVar.ordinal()];
        if (i2 == 1) {
            return LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorActionBackground, BitmapDescriptorFactory.HUE_RED, null, null, 48);
        }
        if (i2 == 2) {
            return k(i);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Image f(EsimCoverage coverage, c config) {
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        Intrinsics.checkNotNullParameter(config, "config");
        if (coverage instanceof EsimCoverage.Country) {
            return a(((EsimCoverage.Country) coverage).f100204a);
        }
        if (coverage instanceof EsimCoverage.Regional) {
            EsimDataPlanCoverageCode coverageCode = ((EsimCoverage.Regional) coverage).f100209b;
            Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
            Intrinsics.checkNotNullParameter(config, "config");
            return e(m(coverageCode), config);
        }
        if ((coverage instanceof EsimCoverage.Global) || (coverage instanceof EsimCoverage.Undefined)) {
            return e(R$drawable.uikit_icn_96_region_global, config);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Image g(e eVar, EsimCoverage esimCoverage) {
        c cVar = c.BORDERED;
        eVar.getClass();
        return f(esimCoverage, cVar);
    }

    public static Image h(e eVar, EsimDataPlan dataPlan) {
        c config = c.BORDERED;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(dataPlan, "dataPlan");
        Intrinsics.checkNotNullParameter(config, "config");
        return f(dataPlan.f100221p, config);
    }

    public static Image i(e eVar, t1 subscription) {
        c config = c.BORDERED;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(config, "config");
        return f(subscription.d, config);
    }

    public static LayeredImage j() {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_chat;
        int i2 = R$attr.uikit_colorAccentNeutral;
        return y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2));
    }

    public static ResourceImage k(int i) {
        return new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public static Clause l(EsimDataPlanCoverageCode regionCoverageCode) {
        Intrinsics.checkNotNullParameter(regionCoverageCode, "regionCoverageCode");
        return n(regionCoverageCode);
    }

    public static int m(EsimDataPlanCoverageCode coverageCode) {
        Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
        EsimDataPlanCoverageCode.INSTANCE.getClass();
        return Intrinsics.f(coverageCode, EsimDataPlanCoverageCode.f) ? R$drawable.uikit_icn_96_region_africa : Intrinsics.f(coverageCode, EsimDataPlanCoverageCode.d) ? R$drawable.uikit_icn_96_region_asia_pacific : Intrinsics.f(coverageCode, EsimDataPlanCoverageCode.f100232c) ? R$drawable.uikit_icn_96_region_europe : Intrinsics.f(coverageCode, EsimDataPlanCoverageCode.e) ? R$drawable.uikit_icn_96_region_north_america : Intrinsics.f(coverageCode, EsimDataPlanCoverageCode.f100233g) ? R$drawable.uikit_icn_96_region_south_america : Intrinsics.f(coverageCode, EsimDataPlanCoverageCode.f100234h) ? R$drawable.uikit_icn_96_region_mena : R$drawable.uikit_icn_96_region_global;
    }

    public static Clause n(EsimDataPlanCoverageCode esimDataPlanCoverageCode) {
        EsimDataPlanCoverageCode.INSTANCE.getClass();
        return Intrinsics.f(esimDataPlanCoverageCode, EsimDataPlanCoverageCode.f) ? new TextLocalisedClause(R$string.esim_region_africa_title, null, null, 14) : Intrinsics.f(esimDataPlanCoverageCode, EsimDataPlanCoverageCode.d) ? new TextLocalisedClause(R$string.esim_region_asia_pacific_title, null, null, 14) : Intrinsics.f(esimDataPlanCoverageCode, EsimDataPlanCoverageCode.f100232c) ? new TextLocalisedClause(R$string.esim_region_europe_title, null, null, 14) : Intrinsics.f(esimDataPlanCoverageCode, EsimDataPlanCoverageCode.e) ? new TextLocalisedClause(R$string.esim_region_north_america_title, null, null, 14) : Intrinsics.f(esimDataPlanCoverageCode, EsimDataPlanCoverageCode.f100233g) ? new TextLocalisedClause(R$string.esim_region_latin_america_title, null, null, 14) : Intrinsics.f(esimDataPlanCoverageCode, EsimDataPlanCoverageCode.f100234h) ? new TextLocalisedClause(R$string.esim_region_mena_title, null, null, 14) : Intrinsics.f(esimDataPlanCoverageCode, EsimDataPlanCoverageCode.f100231b) ? new TextLocalisedClause(R$string.esim_country_picker_global_title, null, null, 14) : new TextClause(esimDataPlanCoverageCode.f100235a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final Clause c(EsimDataPlan dataPlan) {
        Intrinsics.checkNotNullParameter(dataPlan, "dataPlan");
        return b(dataPlan.f100221p, null);
    }
}
