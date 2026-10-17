package of9;

import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.core.api.model.BillFieldV2;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f224758a;

    public b(w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f224758a = amountFormatter;
    }

    public final aim.e a(List fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        aim.e eVarB = u.b();
        List<BillFieldV2> list = fields;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (BillFieldV2 billFieldV2 : list) {
            boolean zAddAll = true;
            if (billFieldV2 instanceof BillFieldV2.BillFieldText) {
                BillFieldV2.BillFieldText billFieldText = (BillFieldV2.BillFieldText) billFieldV2;
                String strP = p.a.p("ID_FIELD_", billFieldText.f61267a, billFieldText.f61268b);
                TextClause textClause = new TextClause(billFieldText.f61267a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                BillFormField.Tooltip tooltip = billFieldText.f61269c;
                CellDetailsDelegate.Model model = new CellDetailsDelegate.Model(strP, new t0(textClause, tooltip != null ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, 0, tooltip != null, 20), new TextClause(billFieldText.f61268b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, billFieldText, null, null, 0, null, false, false, null, null, 32696);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model);
            } else if (billFieldV2 instanceof BillFieldV2.BillFieldAddress) {
                BillFieldV2.BillFieldAddress billFieldAddress = (BillFieldV2.BillFieldAddress) billFieldV2;
                String strQ = j6.a.q("ID_FIELD_", billFieldAddress.f61255a);
                TextClause textClause2 = new TextClause(billFieldAddress.f61255a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Address address = billFieldAddress.f61256b;
                String strB = address != null ? o51.a.b(address, null) : null;
                if (strB == null) {
                    strB = "";
                }
                CellDetailsNoteDelegate.Model model2 = new CellDetailsNoteDelegate.Model(strQ, textClause2, null, new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model2);
            } else if (billFieldV2 instanceof BillFieldV2.BillFieldDateMonth) {
                BillFieldV2.BillFieldDateMonth billFieldDateMonth = (BillFieldV2.BillFieldDateMonth) billFieldV2;
                String strQ2 = j6.a.q("ID_FIELD_", billFieldDateMonth.f61257a);
                t0 t0Var = new t0((Clause) new TextClause(billFieldDateMonth.f61257a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30);
                LocalDate localDateAtDay = billFieldDateMonth.f61258b.atDay(1);
                Intrinsics.checkNotNullExpressionValue(localDateAtDay, "atDay(...)");
                CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model(strQ2, t0Var, new TimeClause(oc.c.N(localDateAtDay), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model3);
            } else if (billFieldV2 instanceof BillFieldV2.BillFieldDateOfBirth) {
                BillFieldV2.BillFieldDateOfBirth billFieldDateOfBirth = (BillFieldV2.BillFieldDateOfBirth) billFieldV2;
                CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model(j6.a.q("ID_FIELD_", billFieldDateOfBirth.f61259a), new t0((Clause) new TextClause(billFieldDateOfBirth.f61259a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.b(c7.Companion, billFieldDateOfBirth.f61260b, LocalDateClause$DateFormat.DateLong.f57804a), null, null, null, null, 0, null, false, false, null, null, 32760);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model4);
            } else if (billFieldV2 instanceof BillFieldV2.BillFieldMoney) {
                BillFieldV2.BillFieldMoney billFieldMoney = (BillFieldV2.BillFieldMoney) billFieldV2;
                CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model(j6.a.q("ID_FIELD_", billFieldMoney.f61261a), new t0((Clause) new TextClause(billFieldMoney.f61261a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), new TextClause(this.f224758a.e(billFieldMoney.f61262b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
                yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model5);
            } else if (billFieldV2 instanceof BillFieldV2.BillFieldSection) {
                BillFieldV2.BillFieldSection billFieldSection = (BillFieldV2.BillFieldSection) billFieldV2;
                List listA = a(billFieldSection.f61264b);
                String str = billFieldSection.f61263a;
                if (str != null) {
                    listA = yp0.b.g(listA, new ListSubheaderDelegate.Model("ID_HEADER_".concat(str), (Image) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                } else {
                    yp0.b.k(listA, 0, 0, 0, 0, 31);
                }
                zAddAll = eVarB.addAll(listA);
            } else {
                if (!(billFieldV2 instanceof BillFieldV2.BillFieldSubform)) {
                    throw new NoWhenBranchMatchedException();
                }
                BillFieldV2.BillFieldSubform billFieldSubform = (BillFieldV2.BillFieldSubform) billFieldV2;
                eVarB.add(new RowDelegate.Model(j6.a.q("ID_FIELD_", billFieldSubform.f61265a), null, new TextClause(billFieldSubform.f61265a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, billFieldSubform, null, 0, 0, 0, 0, 532675546));
            }
            arrayList.add(Boolean.valueOf(zAddAll));
        }
        return u.a(eVarB);
    }
}
