package hg9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import com.revolut.feature.apm.bills.core.api.model.form.ChoiceV2;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import com.revolut.feature.apm.bills.core.api.model.form.NestedItemField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterDropdownField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterField;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f152114a;

    public b(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f152114a = uiKitResources;
    }

    public final List a(List list, List list2, List list3) {
        Object next;
        Object next2;
        Object next3;
        BillInputV2 billInputV2;
        List list4;
        Object next4;
        Object obj2;
        Object next5;
        Object next6;
        Object next7;
        if (list.isEmpty() || list2.isEmpty()) {
            return f0.f322471a;
        }
        String str = (String) d0.b0(list);
        List listV = d0.V(list, 1);
        Iterator it8 = list2.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((BillFormFieldV2) next).getF61415a(), str)) {
                break;
            }
        }
        BillFormFieldV2 billFormFieldV2 = (BillFormFieldV2) next;
        if (billFormFieldV2 == null) {
            return a(listV, list2, list3);
        }
        if (billFormFieldV2 instanceof NestedItemField) {
            Iterator it9 = list3.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next7 = null;
                    break;
                }
                next7 = it9.next();
                if (Intrinsics.f(((BillInputV2) next7).getF61319a(), str)) {
                    break;
                }
            }
            BillInputV2 billInputV22 = (BillInputV2) next7;
            NestedItemField nestedItemField = (NestedItemField) billFormFieldV2;
            List listC = u.c(nestedItemField.f61395b);
            ArrayList arrayList = nestedItemField.e.f61360a;
            List f61321c = billInputV22 != null ? billInputV22.getF61321c() : null;
            if (f61321c == null) {
                f61321c = f0.f322471a;
            }
            return d0.E0(a(listV, arrayList, f61321c), listC);
        }
        if (billFormFieldV2 instanceof RepeaterField) {
            String str2 = (String) d0.d0(listV);
            if (str2 == null) {
                return u.c(((RepeaterField) billFormFieldV2).f61413b);
            }
            Iterator it10 = list3.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it10.next();
                if (Intrinsics.f(((BillInputV2) next5).getF61319a(), str)) {
                    break;
                }
            }
            BillInputV2.BillInputRepeater billInputRepeater = next5 instanceof BillInputV2.BillInputRepeater ? (BillInputV2.BillInputRepeater) next5 : null;
            List list5 = billInputRepeater != null ? billInputRepeater.f61312c : null;
            if (list5 == null) {
                list5 = f0.f322471a;
            }
            Iterator it11 = list5.iterator();
            int i = 0;
            while (true) {
                if (!it11.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.f(((BillInputV2) it11.next()).getF61319a(), str2)) {
                    break;
                }
                i++;
            }
            String string = this.f152114a.b(new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_repeater_item_title, u.c(Integer.valueOf(i + 1)), null, 12)).toString();
            Iterator it12 = list5.iterator();
            while (true) {
                if (!it12.hasNext()) {
                    next6 = null;
                    break;
                }
                next6 = it12.next();
                if (Intrinsics.f(((BillInputV2) next6).getF61319a(), str2)) {
                    break;
                }
            }
            BillInputV2 billInputV23 = (BillInputV2) next6;
            List f61321c2 = billInputV23 != null ? billInputV23.getF61321c() : null;
            if (f61321c2 == null) {
                f61321c2 = f0.f322471a;
            }
            RepeaterField repeaterField = (RepeaterField) billFormFieldV2;
            List listK = v.k(repeaterField.f61413b, string);
            List listV2 = d0.V(listV, 1);
            BillFormV2 billFormV2 = repeaterField.f;
            List list6 = billFormV2 != null ? billFormV2.f61360a : null;
            if (list6 == null) {
                list6 = f0.f322471a;
            }
            return d0.E0(a(listV2, list6, f61321c2), listK);
        }
        if (billFormFieldV2 instanceof DropdownField) {
            DropdownField dropdownField = (DropdownField) billFormFieldV2;
            String str3 = dropdownField.f61380b;
            Iterator it13 = dropdownField.e.iterator();
            while (true) {
                if (!it13.hasNext()) {
                    break;
                }
                Object next8 = it13.next();
                if (Intrinsics.f(((ChoiceV2) next8).f61366a, d0.d0(listV))) {
                    obj2 = next8;
                    break;
                }
            }
            ChoiceV2 choiceV2 = (ChoiceV2) obj2;
            return choiceV2 == null ? u.c(str3) : d0.E0(a(d0.V(listV, 1), choiceV2.d, f0.f322471a), v.k(str3, choiceV2.f61367b));
        }
        if (!(billFormFieldV2 instanceof RepeaterDropdownField)) {
            return u.c(billFormFieldV2.getF61416b());
        }
        String str4 = (String) d0.d0(listV);
        if (str4 == null) {
            return u.c(((RepeaterDropdownField) billFormFieldV2).f61410b);
        }
        RepeaterDropdownField repeaterDropdownField = (RepeaterDropdownField) billFormFieldV2;
        String str5 = repeaterDropdownField.f61410b;
        Iterator it14 = repeaterDropdownField.f.iterator();
        while (true) {
            if (!it14.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it14.next();
            if (Intrinsics.f(((ChoiceV2) next2).f61366a, str4)) {
                break;
            }
        }
        ChoiceV2 choiceV22 = (ChoiceV2) next2;
        if (choiceV22 == null) {
            return u.c(str5);
        }
        Iterator it15 = list3.iterator();
        while (true) {
            if (!it15.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it15.next();
            if (Intrinsics.f(((BillInputV2) next3).getF61319a(), str)) {
                break;
            }
        }
        BillInputV2 billInputV24 = (BillInputV2) next3;
        BillInputV2.BillInputRepeaterDropdown billInputRepeaterDropdown = billInputV24 instanceof BillInputV2.BillInputRepeaterDropdown ? (BillInputV2.BillInputRepeaterDropdown) billInputV24 : null;
        if (billInputRepeaterDropdown == null || (list4 = billInputRepeaterDropdown.f61315c) == null) {
            billInputV2 = null;
        } else {
            Iterator it16 = list4.iterator();
            while (true) {
                if (!it16.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it16.next();
                if (Intrinsics.f(((BillInputV2) next4).getF61319a(), str4)) {
                    break;
                }
            }
            billInputV2 = (BillInputV2) next4;
        }
        List listK2 = v.k(str5, choiceV22.f61367b);
        List listV3 = d0.V(listV, 1);
        BillFormV2 billFormV22 = choiceV22.e;
        List list7 = billFormV22 != null ? billFormV22.f61360a : null;
        if (list7 == null) {
            list7 = f0.f322471a;
        }
        List f61321c3 = billInputV2 != null ? billInputV2.getF61321c() : null;
        if (f61321c3 == null) {
            f61321c3 = f0.f322471a;
        }
        return d0.E0(a(listV3, list7, f61321c3), listK2);
    }
}
