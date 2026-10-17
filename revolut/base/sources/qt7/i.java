package qt7;

import aw0.o9;
import aw0.t0;
import aw0.u0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.insurance_credit.impl.data.model.BottomSheet;
import com.revolut.feature.insurance_credit.impl.data.model.coverages.CoverageDetailsLayout;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreenContract$InputData;
import ip0.yt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l9.l;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoverageDetailsScreenContract$InputData f249011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final st7.b f249012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final st7.a f249013c;

    public i(CoverageDetailsScreenContract$InputData inputData, st7.b restrictionsSectionMapper, st7.a exclusionsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(restrictionsSectionMapper, "restrictionsSectionMapper");
        Intrinsics.checkNotNullParameter(exclusionsMapper, "exclusionsMapper");
        this.f249011a = inputData;
        this.f249012b = restrictionsSectionMapper;
        this.f249013c = exclusionsMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClauseS;
        List listA;
        PlainTextDelegate.Model model;
        String str;
        boolean z;
        Clause clauseS;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CoverageDetailsLayout coverageDetailsLayout = this.f249011a.f75826b;
        List list = coverageDetailsLayout.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            textLocalisedClauseS = null;
            if (!it8.hasNext()) {
                break;
            }
            CoverageDetailsLayout.RestrictionsSection section = (CoverageDetailsLayout.RestrictionsSection) it8.next();
            this.f249012b.getClass();
            Intrinsics.checkNotNullParameter(section, "section");
            ArrayList<CoverageDetailsLayout.Restriction> arrayList2 = section.f75802b;
            String str2 = section.f75801a;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            for (CoverageDetailsLayout.Restriction restriction : arrayList2) {
                String strQ = j6.a.q("COVERAGE_RESTRICTION_ITEM_ID_", restriction.f75798a);
                t0 t0Var = new t0((Clause) l.s(R$string.credit_loan_insurance_coverage_restrictions_item_title, restriction.f75798a), (Image) null, 0, false, 30);
                if (restriction.f75800c != null) {
                    int i = R$drawable.uikit_icn_16_info_outline;
                    Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
                    Float fValueOf = Float.valueOf(16.0f);
                    ImageClause imageClause = new ImageClause(i, numValueOf, fValueOf, fValueOf, 16);
                    int i2 = R$string.credit_loan_insurance_coverage_restrictions_item_value;
                    String str3 = restriction.f75799b;
                    z = false;
                    Clause[] elements = {imageClause, l.e(sr7.c.a(str3, new Click(28, (Integer) null, (Object) restriction.f75800c, str3, false)), i2)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    clauseS = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
                } else {
                    z = false;
                    clauseS = l.s(R$string.credit_loan_insurance_coverage_restrictions_item_value, restriction.f75799b);
                }
                Clause clause = clauseS;
                BottomSheet bottomSheet = restriction.f75800c;
                arrayList3.add(new CellDetailsDelegate.Model(strQ, t0Var, clause, null, bottomSheet, null, u0.SMALL, 0, null, bottomSheet != null ? true : z, false, null, null, 30392));
            }
            String strQ2 = j6.a.q("COVERAGE_RESTRICTION_HEADER_ID_", str2);
            if (str2 != null) {
                textLocalisedClauseS = l.s(R$string.credit_loan_insurance_coverage_restrictions_title, str2);
            }
            arrayList.add(zt7.b.a(arrayList3, strQ2, textLocalisedClauseS, R$attr.uikit_dp16));
        }
        ArrayList arrayListU = w.u(arrayList);
        CoverageDetailsLayout.Exclusions exclusions = coverageDetailsLayout.e;
        if (exclusions != null) {
            List list2 = exclusions.f75794b;
            this.f249013c.getClass();
            Intrinsics.checkNotNullParameter(exclusions, "exclusions");
            String str4 = exclusions.f75793a;
            List list3 = list2;
            ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
            int i3 = 0;
            for (Object obj2 : list3) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                String str5 = (String) obj2;
                arrayList4.add(new ListCellDelegate.Model(j6.a.q("COVERAGE_EXCLUSIONS_ITEM_ID_", str5), new j8(new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246), yt.TOP), null, l.s(R$string.credit_loan_insurance_coverage_exclusions_item_title, str5), false, null, null, i3 == 0 ? R$attr.uikit_dp16 : R$attr.uikit_dp2, i3 == v.j(list2) ? R$attr.uikit_dp16 : R$attr.uikit_dp2, 0, 0, 3300));
                i3 = i5;
            }
            listA = zt7.b.a(arrayList4, j6.a.q("COVERAGE_EXCLUSIONS_HEADER_ID_", str4), str4 != null ? l.s(R$string.credit_loan_insurance_coverage_exclusions_title, str4) : null, R$attr.uikit_dp16);
        } else {
            listA = null;
        }
        if (listA == null) {
            listA = f0.f322471a;
        }
        ArrayList arrayListE0 = d0.E0(listA, arrayListU);
        CoverageDetailsLayout.Disclaimer disclaimer = coverageDetailsLayout.f;
        if (disclaimer != null) {
            model = new PlainTextDelegate.Model("DISCLAIMER_ID", (Clause) null, (Clause) l.e(new HtmlClause(0, 30, (Integer) null, (Object) null, disclaimer.f75792a), R$string.credit_loan_insurance_coverage_disclaimer_text), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        ArrayList arrayListE02 = d0.E0(v.l(model), arrayListE0);
        TextLocalisedClause textLocalisedClauseS2 = l.s(R$string.credit_loan_insurance_coverage_title, coverageDetailsLayout.f75789b);
        String str6 = coverageDetailsLayout.f75790c;
        TextLocalisedClause textLocalisedClauseS3 = str6 != null ? l.s(R$string.credit_loan_insurance_coverage_subtitle, str6) : null;
        CoverageDetailsLayout.FooterButton footerButton = coverageDetailsLayout.f75791g;
        if (footerButton != null && (str = footerButton.f75795a) != null) {
            textLocalisedClauseS = l.s(R$string.credit_loan_insurance_coverage_button_title, str);
        }
        return new g(textLocalisedClauseS2, textLocalisedClauseS3, textLocalisedClauseS, arrayListE02);
    }
}
