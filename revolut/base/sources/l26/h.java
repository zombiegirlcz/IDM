package l26;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskAssessment;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskContent;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskLevel;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType;
import hx7.l;
import ip0.y10;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAssetDetailsScreenContract$InputData f191678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pt5.f f191679b;

    public h(DeFiAssetDetailsScreenContract$InputData inputData, pt5.f activityWidgetMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(activityWidgetMapper, "activityWidgetMapper");
        this.f191678a = inputData;
        this.f191679b = activityWidgetMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List list;
        DefiCurrency defiCurrency;
        DeFiAssetRiskAssessment deFiAssetRiskAssessment;
        Object next;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listA = pt5.f.a(this.f191679b, domainState.i);
        aim.e eVarB = u.b();
        eVarB.addAll(domainState.f191662c);
        Data data = domainState.e;
        DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) data.getContent();
        if (deFiAssetDetails == null || (deFiAssetRiskAssessment = deFiAssetDetails.k) == null) {
            list = null;
        } else {
            Intrinsics.checkNotNullParameter(deFiAssetRiskAssessment, "<this>");
            DeFiAssetRiskLevel deFiAssetRiskLevel = deFiAssetRiskAssessment.f71685a;
            if (deFiAssetRiskLevel == DeFiAssetRiskLevel.WARNING || deFiAssetRiskLevel == DeFiAssetRiskLevel.MALICIOUS) {
                Iterator it8 = deFiAssetRiskAssessment.f71686b.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (((DeFiAssetRiskType) next) != DeFiAssetRiskType.UNKNOWN) {
                        break;
                    }
                }
                DeFiAssetRiskType deFiAssetRiskType = (DeFiAssetRiskType) next;
                if (deFiAssetRiskType == null) {
                    deFiAssetRiskType = DeFiAssetRiskType.UNKNOWN;
                }
                b36.c cVarI = l.I(new DeFiAssetRiskContent(deFiAssetRiskType), null, 3);
                List listC = u.c(new sa("defi_asset_risk", (Clause) cVarI.f12009a, (Clause) cVarI.f12010b, (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                list = listC;
            } else {
                list = f0.f322471a;
            }
        }
        if (list == null) {
            list = f0.f322471a;
        }
        eVarB.addAll(list);
        eVarB.addAll(domainState.f);
        eVarB.addAll(listA);
        eVarB.addAll(domainState.f191663g);
        aim.e eVarA = u.a(eVarB);
        DeFiAssetDetails deFiAssetDetails2 = (DeFiAssetDetails) data.getContent();
        String str = (deFiAssetDetails2 == null || (defiCurrency = deFiAssetDetails2.f71665a) == null) ? null : defiCurrency.f71673c;
        if (str == null) {
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        n9l.a aVar = domainState.f191660a;
        return new c(eVarA, textClause, aVar != null ? new RateClause(new BigDecimal(String.valueOf(aVar.f213663c)), aVar.f213662b, new RateClause.Format.Default(this.f191678a.f71679a, true), null) : null, domainState.f191661b, domainState.d, domainState.f191664h);
    }
}
