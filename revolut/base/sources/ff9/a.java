package ff9;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.bills.core.api.model.BillFormFooter;
import com.revolut.feature.apm.bills.core.api.model.BillFormHeader;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldControl;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.apm.bills.core.api.model.form.TextField;
import foh.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final List a(String str, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (str == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str2 = (String) ((BillFormField) obj2).k.f61273a.get("INPUT_METHOD");
            boolean z = false;
            if (str2 != null && !str2.equals(str)) {
                z = true;
            }
            if (!z) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final BillFormField.Choice b(BillFormField billFormField, String value) {
        Intrinsics.checkNotNullParameter(billFormField, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        List list = billFormField.f61279j;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((BillFormField.Choice) next).f61286a, value)) {
                obj2 = next;
                break;
            }
        }
        return (BillFormField.Choice) obj2;
    }

    public static final BillFormField c(String fieldId, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            BillFormField billFormField = (BillFormField) it8.next();
            if (Intrinsics.f(billFormField.f61274a, fieldId)) {
                return billFormField;
            }
            BillFormField billFormFieldC = c(fieldId, billFormField.f61280l);
            if (billFormFieldC != null) {
                return billFormFieldC;
            }
        }
        return null;
    }

    public static final boolean d(TextField textField, String childName, String str) {
        BillFormFieldControl billFormFieldControl;
        Intrinsics.checkNotNullParameter(textField, "<this>");
        Intrinsics.checkNotNullParameter(childName, "childName");
        Map map = textField.f61424l;
        if (map == null || (billFormFieldControl = (BillFormFieldControl) map.get(childName)) == null) {
            return true;
        }
        if (str == null) {
            str = "";
        }
        Set set = billFormFieldControl.f61358a;
        if (set != null && !set.contains(str)) {
            return false;
        }
        Set set2 = billFormFieldControl.f61359b;
        return set2 == null || !set2.contains(str);
    }

    public static final ArrayList e(List list, List formFields) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        List list2 = formFields;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list2) {
            linkedHashMap.put(((BillFormFieldV2) obj2).getF61418a(), obj2);
        }
        List<BillInputV2> list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (BillInputV2 billInputV2C : list3) {
            String name = billInputV2C.getF61319a();
            BillFormFieldV2 billFormFieldV2 = name != null ? (BillFormFieldV2) linkedHashMap.get(name) : null;
            if ((billInputV2C instanceof BillInputV2.BillInputText) && (billFormFieldV2 instanceof TextField)) {
                TextField textField = (TextField) billFormFieldV2;
                List list4 = textField.k;
                List list5 = list4;
                if (list5 != null && !list5.isEmpty()) {
                    BillInputV2.BillInputText billInputText = (BillInputV2.BillInputText) billInputV2C;
                    Iterable iterable = billInputText.f61318c;
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : iterable) {
                        BillInputV2 billInputV2 = (BillInputV2) obj3;
                        if (billInputV2.getF61319a() != null) {
                            String name2 = billInputV2.getF61319a();
                            Intrinsics.h(name2);
                            if (d(textField, name2, billInputText.d)) {
                            }
                        }
                        arrayList2.add(obj3);
                    }
                    Intrinsics.h(list4);
                    ArrayList arrayListE = e(arrayList2, list4);
                    if (arrayListE.isEmpty()) {
                        arrayListE = null;
                    }
                    billInputV2C = BillInputV2.BillInputText.c(billInputText, arrayListE, null, 11);
                }
            }
            arrayList.add(billInputV2C);
        }
        return arrayList;
    }

    public static final CompositeClause f(BillFormHeader billFormHeader, List userInputs) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(billFormHeader, "<this>");
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        String str3 = billFormHeader.f61295a;
        BillInputV2 billInputV2G = str3 != null ? i.g(str3, userInputs) : null;
        BillInputV2.BillInputText billInputText = billInputV2G instanceof BillInputV2.BillInputText ? (BillInputV2.BillInputText) billInputV2G : null;
        if (billInputText == null || (str = billInputText.d) == null) {
            str = billFormHeader.f61296b;
        }
        String str4 = str;
        HtmlClause htmlClause = str4 != null ? new HtmlClause(0, 30, (Integer) null, (Object) null, str4) : null;
        BillFormField.Tooltip tooltip = billFormHeader.f61297c;
        TextClause textClause = (tooltip == null || (str2 = tooltip.f61289a) == null) ? null : new TextClause(str2, (Style) new Click(28, (Integer) null, (Object) billFormHeader.f61297c, "HEADER_TOOLTIP_ID_PREFIX".concat(str2), false), (Integer) null, false, (o9) null, (List) null, 124);
        Clause[] elements = {htmlClause, textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (d.L(elements).isEmpty()) {
            return null;
        }
        Clause[] elements2 = {htmlClause, textClause};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL = d.L(elements2);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static final HtmlClause g(BillFormFooter billFormFooter, List userInputs) {
        String str;
        Intrinsics.checkNotNullParameter(billFormFooter, "<this>");
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        String str2 = billFormFooter.f61292a;
        BillInputV2 billInputV2G = str2 != null ? i.g(str2, userInputs) : null;
        BillInputV2.BillInputText billInputText = billInputV2G instanceof BillInputV2.BillInputText ? (BillInputV2.BillInputText) billInputV2G : null;
        if ((billInputText == null || (str = billInputText.d) == null) && (str = billFormFooter.f61293b) == null) {
            str = billFormFooter.f61294c;
        }
        String str3 = str;
        if (str3 != null) {
            return new HtmlClause(0, 30, (Integer) null, (Object) null, str3);
        }
        return null;
    }

    public static final List h(TextField textField, String str) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(textField, "<this>");
        List list = textField.k;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (d(textField, ((BillFormFieldV2) obj2).getF61418a(), str)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }
}
