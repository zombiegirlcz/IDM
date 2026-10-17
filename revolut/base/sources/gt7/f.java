package gt7;

import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.insurance_credit.impl.data.model.BottomSheet;
import com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet.BottomSheetScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l9.l;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetScreenContract$InputData f146568a;

    public f(BottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f146568a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List list;
        BottomSheet.Button button;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BottomSheet bottomSheet = this.f146568a.f75819a;
        List list2 = bottomSheet.d;
        aw0.e eVar = null;
        eVar = null;
        if (list2 != null) {
            List list3 = list2;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            int i = 0;
            for (Object obj2 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                BottomSheet.Item item = (BottomSheet.Item) obj2;
                if (!(item instanceof BottomSheet.Item.Cell)) {
                    throw new NoWhenBranchMatchedException();
                }
                BottomSheet.Item.Cell cell = (BottomSheet.Item.Cell) item;
                arrayList.add(new CellDetailsDelegate.Model(a0.d.n("BOTTOM_SHEET_CELL_", i), new t0((Clause) new TextClause(cell.f75742a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), new TextClause(cell.f75743b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 30712));
                i = i2;
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            list = arrayList;
        } else {
            String str = bottomSheet.f75735b;
            List listL = v.l(str != null ? new PlainTextDelegate.Model("BOTTOM_SHEET_TEXT", (Clause) null, (Clause) l.e(new HtmlClause(0, 30, (Integer) null, (Object) null, str), R$string.credit_loan_insurance_coverage_restriction_bottom_sheet_text), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518) : null);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            list = listL;
        }
        TextLocalisedClause textLocalisedClauseS = l.s(R$string.credit_loan_insurance_coverage_restriction_bottom_sheet_title, bottomSheet.f75734a);
        String str2 = bottomSheet.f75736c;
        lw0.a aVar = new lw0.a(textLocalisedClauseS, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
        BottomSheet.Footer footer = bottomSheet.e;
        if (footer != null && (button = footer.f75741b) != null) {
            String str3 = footer.f75740a;
            eVar = new aw0.e(false, str3 != null ? l.s(R$string.credit_loan_insurance_coverage_restriction_bottom_sheet_footer_text, str3) : null, null, new n6(l.s(R$string.credit_loan_insurance_coverage_restriction_bottom_sheet_primary_button, button.f75738a), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, button, 508), null, null, 53);
        }
        return new cii.b(eVar, list, aVar);
    }
}
