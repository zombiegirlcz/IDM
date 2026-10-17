package rpe;

import aw0.o9;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import com.revolut.feature.tax_residency.impl.v2.ui.exemption.TaxExemptionScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxExemptionScreenContract$InputData f256384a;

    public j(TaxExemptionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f256384a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TaxExemptionScreenContract$InputData taxExemptionScreenContract$InputData = this.f256384a;
        ArrayList<ExemptionReason> arrayList = taxExemptionScreenContract$InputData.f90250c;
        f fVar = taxExemptionScreenContract$InputData.d;
        wi0.b bVar = taxExemptionScreenContract$InputData.f90248a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (ExemptionReason exemptionReason : arrayList) {
            String strQ = j6.a.q("ROW_ID_", exemptionReason.name());
            CountryClause countryClause = new CountryClause(bVar, null);
            TextClause textClause = new TextClause(taxExemptionScreenContract$InputData.f90249b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            switch (i.f256383b[exemptionReason.ordinal()]) {
                case 1:
                    textLocalisedClause3 = new TextLocalisedClause(R$string.tin_flow_reason_student, u.c(countryClause), null, 12);
                    break;
                case 2:
                    textLocalisedClause3 = new TextLocalisedClause(R$string.tin_flow_reason_teacher, u.c(countryClause), null, 12);
                    break;
                case 3:
                    textLocalisedClause3 = new TextLocalisedClause(R$string.tin_flow_reason_temporary_resident, u.c(countryClause), null, 12);
                    break;
                case 4:
                    textLocalisedClause3 = new TextLocalisedClause(R$string.tin_flow_reason_us_student, null, null, 14);
                    break;
                case 5:
                    textLocalisedClause3 = new TextLocalisedClause(R$string.tin_flow_reason_us_teacher, null, null, 14);
                    break;
                case 6:
                    textLocalisedClause3 = new TextLocalisedClause(R$string.tin_flow_reason_diplomat, null, null, 14);
                    break;
                case 7:
                    textLocalisedClause3 = new TextLocalisedClause(R$string.tin_flow_reason_awaiting, u.c(textClause), null, 12);
                    break;
                case 8:
                    textLocalisedClause3 = new TextLocalisedClause(R$string.tin_flow_reason_low_income, u.c(textClause), null, 12);
                    break;
                case 9:
                    textLocalisedClause3 = new TextLocalisedClause(R$string.tin_flow_reason_no_longer_tax_resident, u.c(countryClause), null, 12);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(new RowDelegate.Model(strQ, null, textLocalisedClause3, null, 0, null, null, null, 0, new tf(nz8.d.L(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, RowDelegate.Model.b.c.f53268a, null, null, null, null, null, exemptionReason, null, 0, 0, 0, 0, 532657146));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        int[] iArr = i.f256382a;
        int i = iArr[fVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.tin_flow_reason_title, u.c(new TextClause(taxExemptionScreenContract$InputData.f90249b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.tin_flow_reason_title_missing_residency, u.c(new CountryClause(bVar, null)), null, 12);
        }
        int i2 = iArr[fVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.tin_flow_reason_description, u.c(new TextClause(taxExemptionScreenContract$InputData.f90249b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.tin_flow_reason_description_missing_residency, null, null, 14);
        }
        return new e(textLocalisedClause, textLocalisedClause2, arrayList2);
    }
}
