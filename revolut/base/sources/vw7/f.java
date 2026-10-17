package vw7;

import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_home.impl.data.model.FooterButton;
import com.revolut.feature.insurance_home.impl.data.model.ProductSummary;
import com.revolut.feature.insurance_home.impl.ui.screen.product_summary.InsuranceProductSummaryScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceProductSummaryScreenContract$InputData f292653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f292654b;

    public f(InsuranceProductSummaryScreenContract$InputData inputData, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f292653a = inputData;
        this.f292654b = uiKitResources;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ProductSummary productSummary = this.f292653a.f76223a;
        List list = productSummary.f76200c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            ProductSummary.Coverage coverage = (ProductSummary.Coverage) it8.next();
            String strQ = j6.a.q("ID_COVERAGE_ITEM", coverage.f76202b);
            TextClause textClause = new TextClause(coverage.f76202b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(coverage.f76203c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = coverage.f76201a;
            Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
            int iIntValue = R$drawable.uikit_icn_24_statement;
            int iA = this.f292654b.a(str);
            Integer numValueOf2 = iA != 0 ? Integer.valueOf(iA) : null;
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            }
            arrayList.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image24(new ResourceImage(iIntValue, (Integer) null, (Integer) null, numValueOf, (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        FooterButton footerButton = productSummary.d.f76171a;
        return new d(arrayList, footerButton != null ? new TextClause(footerButton.f76174a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new lw0.a(new TextClause(productSummary.f76198a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(productSummary.f76199b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28));
    }
}
