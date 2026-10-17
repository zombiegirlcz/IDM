package jg9;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.core.api.model.BillForm;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.bills.core.api.model.form.AddressField;
import com.revolut.feature.apm.bills.core.api.model.form.BarcodeField;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import com.revolut.feature.apm.bills.core.api.model.form.CheckboxField;
import com.revolut.feature.apm.bills.core.api.model.form.ChoiceV2;
import com.revolut.feature.apm.bills.core.api.model.form.DateMonthField;
import com.revolut.feature.apm.bills.core.api.model.form.DateOfBirthField;
import com.revolut.feature.apm.bills.core.api.model.form.DateYearField;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import com.revolut.feature.apm.bills.core.api.model.form.FormNameField;
import com.revolut.feature.apm.bills.core.api.model.form.InfoField;
import com.revolut.feature.apm.bills.core.api.model.form.MoneyField;
import com.revolut.feature.apm.bills.core.api.model.form.NestedItemField;
import com.revolut.feature.apm.bills.core.api.model.form.NumberField;
import com.revolut.feature.apm.bills.core.api.model.form.QrCodeField;
import com.revolut.feature.apm.bills.core.api.model.form.QrCodeOrBarcodeField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterDropdownField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterField;
import com.revolut.feature.apm.bills.core.api.model.form.SearchField;
import com.revolut.feature.apm.bills.core.api.model.form.TextField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u {
    public static final String a(BillFormFieldV2 billFormFieldV2) {
        Intrinsics.checkNotNullParameter(billFormFieldV2, "<this>");
        if (billFormFieldV2 instanceof DateOfBirthField) {
            return ((DateOfBirthField) billFormFieldV2).f;
        }
        if (billFormFieldV2 instanceof FormNameField) {
            return ((FormNameField) billFormFieldV2).e;
        }
        if (billFormFieldV2 instanceof TextField) {
            return ((TextField) billFormFieldV2).e;
        }
        if (billFormFieldV2 instanceof InfoField) {
            return ((InfoField) billFormFieldV2).e;
        }
        if (billFormFieldV2 instanceof NumberField) {
            return ((NumberField) billFormFieldV2).e;
        }
        if (billFormFieldV2 instanceof NestedItemField) {
            return ((NestedItemField) billFormFieldV2).d.f61284b;
        }
        if (billFormFieldV2 instanceof AddressField) {
            Address address = ((AddressField) billFormFieldV2).e;
            if (address != null) {
                return o51.a.b(address, null);
            }
        } else if (!(billFormFieldV2 instanceof RepeaterDropdownField) && !(billFormFieldV2 instanceof RepeaterField) && !(billFormFieldV2 instanceof DropdownField) && !(billFormFieldV2 instanceof DateMonthField) && !(billFormFieldV2 instanceof DateYearField) && !(billFormFieldV2 instanceof MoneyField) && !(billFormFieldV2 instanceof BarcodeField) && !(billFormFieldV2 instanceof QrCodeField) && !(billFormFieldV2 instanceof QrCodeOrBarcodeField) && !(billFormFieldV2 instanceof SearchField) && !(billFormFieldV2 instanceof CheckboxField)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public static final ChoiceV2 b(BillFormField.Choice choice) {
        String str = choice.f61286a;
        String str2 = choice.f61287b;
        String str3 = choice.f61288c;
        String str4 = choice.e;
        List list = choice.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(g((BillFormField) it8.next()));
        }
        return new ChoiceV2(str, str2, str3, arrayList, null, null, str4);
    }

    public static final BillForm c(BillFormV2 billFormV2) {
        ArrayList arrayList = billFormV2.f61360a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(d((BillFormFieldV2) it8.next()));
        }
        return new BillForm(arrayList2, billFormV2.f61361b, billFormV2.f61362c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0305  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v26, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.apm.bills.core.api.model.BillFormField d(com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2 r20) {
        /*
            Method dump skipped, instruction units count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg9.u.d(com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2):com.revolut.feature.apm.bills.core.api.model.BillFormField");
    }

    public static final BillFormField.Choice e(ChoiceV2 choiceV2) {
        String str = choiceV2.f61366a;
        String str2 = choiceV2.f61367b;
        String str3 = choiceV2.f61369g;
        String str4 = choiceV2.f61368c;
        List list = choiceV2.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(d((BillFormFieldV2) it8.next()));
        }
        return new BillFormField.Choice(str, str2, str4, str3, arrayList);
    }

    public static final xo1.c f(BillFormFieldV2 billFormFieldV2) {
        Intrinsics.checkNotNullParameter(billFormFieldV2, "<this>");
        if (billFormFieldV2 instanceof FormNameField) {
            return xo1.c.FORM_NAME;
        }
        if (billFormFieldV2 instanceof NestedItemField) {
            return xo1.c.NESTED_ITEM;
        }
        if (billFormFieldV2 instanceof TextField) {
            return xo1.c.TEXT;
        }
        if (billFormFieldV2 instanceof DropdownField) {
            return xo1.c.DROPDOWN;
        }
        if (billFormFieldV2 instanceof AddressField) {
            return xo1.c.ADDRESS;
        }
        if (billFormFieldV2 instanceof DateMonthField) {
            return xo1.c.DATE_MONTH;
        }
        if (billFormFieldV2 instanceof DateYearField) {
            return xo1.c.DATE_YEAR;
        }
        if (billFormFieldV2 instanceof DateOfBirthField) {
            return xo1.c.DATE_OF_BIRTH;
        }
        if (billFormFieldV2 instanceof MoneyField) {
            return xo1.c.MONEY;
        }
        if (billFormFieldV2 instanceof RepeaterDropdownField) {
            return xo1.c.REPEATER_DROPDOWN;
        }
        if (billFormFieldV2 instanceof RepeaterField) {
            return xo1.c.REPEATER;
        }
        if (billFormFieldV2 instanceof CheckboxField) {
            return xo1.c.CHECKBOX;
        }
        if (billFormFieldV2 instanceof InfoField) {
            return xo1.c.INFO;
        }
        if (billFormFieldV2 instanceof NumberField) {
            return xo1.c.NUMBER;
        }
        if (billFormFieldV2 instanceof BarcodeField) {
            return xo1.c.BARCODE;
        }
        if (billFormFieldV2 instanceof QrCodeField) {
            return xo1.c.QRCODE;
        }
        if (billFormFieldV2 instanceof QrCodeOrBarcodeField) {
            return xo1.c.QRCODE_OR_BARCODE;
        }
        if (billFormFieldV2 instanceof SearchField) {
            return xo1.c.SEARCH;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    public static final BillFormFieldV2 g(BillFormField billFormField) {
        Intrinsics.checkNotNullParameter(billFormField, "<this>");
        xo1.c cVar = billFormField.f61276c;
        List list = billFormField.f61279j;
        String str = billFormField.f61278h;
        BillForm billForm = billFormField.f61281m;
        boolean z = billFormField.d;
        String str2 = billFormField.f61275b;
        String str3 = billFormField.f61274a;
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = billFormField.f61282n;
        ?? arrayList = 0;
        ?? arrayList2 = 0;
        switch (t.f173958a[cVar.ordinal()]) {
            case 1:
                return new FormNameField(billFormField.f61274a, billFormField.f61275b, billFormField.d, billFormField.f61282n, billFormField.i);
            case 2:
                String str4 = billFormField.f61274a;
                String str5 = billFormField.f61275b;
                boolean z3 = billFormField.d;
                String str6 = billFormField.i;
                String str7 = billFormField.e;
                String str8 = billFormField.f61278h;
                String str9 = billFormField.f;
                BillFormField.Tooltip tooltip = billFormField.f61277g;
                BillFormField.BillFormFieldAttributes billFormFieldAttributes2 = billFormField.f61282n;
                List list2 = billFormField.f61280l;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(g((BillFormField) it8.next()));
                }
                return new TextField(str4, str5, z3, billFormFieldAttributes2, str6, str7, str8, str9, null, tooltip, arrayList3, null);
            case 3:
                String str10 = billFormField.f61274a;
                String str11 = billFormField.f61275b;
                boolean z4 = billFormField.d;
                String str12 = billFormField.e;
                String str13 = billFormField.f61278h;
                String str14 = billFormField.f;
                BillFormField.Tooltip tooltip2 = billFormField.f61277g;
                BillFormField.BillFormFieldAttributes billFormFieldAttributes3 = billFormField.f61282n;
                if (list != null) {
                    List list3 = list;
                    arrayList = new ArrayList(w.t(list3, 10));
                    Iterator it9 = list3.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(b((BillFormField.Choice) it9.next()));
                    }
                }
                if (arrayList == 0) {
                    arrayList = f0.f322471a;
                }
                return new DropdownField(str10, str11, z4, billFormFieldAttributes3, arrayList, str12, str13, str14, null, tooltip2);
            case 4:
                return new AddressField(billFormField.f61274a, billFormField.f61275b, billFormField.d, billFormField.f61282n, null);
            case 5:
                return new DateMonthField(billFormField.f61274a, billFormField.f61275b, billFormField.d, billFormField.f61282n, billFormField.f);
            case 6:
                return new DateYearField(billFormField.f61274a, billFormField.f61275b, billFormField.d, billFormField.f61282n, billFormField.f);
            case 7:
                return new DateOfBirthField(billFormField.f61274a, billFormField.f61275b, billFormField.d, billFormField.f61282n, billFormField.f, billFormField.i);
            case 8:
                String str15 = billFormField.f61274a;
                String str16 = billFormField.f61275b;
                boolean z6 = billFormField.d;
                BillFormField.BillFormFieldAttributes billFormFieldAttributes4 = billFormField.f61282n;
                xi0.b bVar = billFormFieldAttributes4 != null ? billFormFieldAttributes4.f61285c : null;
                if (bVar != null) {
                    return new MoneyField(str15, str16, z6, billFormFieldAttributes4, bVar);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 9:
                String str17 = billFormField.f61274a;
                String str18 = billFormField.f61275b;
                String str19 = str;
                boolean z11 = billFormField.d;
                BillFormField.BillFormFieldAttributes billFormFieldAttributes5 = billFormField.f61282n;
                if (str19 == null) {
                    str19 = "";
                }
                if (list != null) {
                    List list4 = list;
                    arrayList2 = new ArrayList(w.t(list4, 10));
                    Iterator it10 = list4.iterator();
                    while (it10.hasNext()) {
                        arrayList2.add(b((BillFormField.Choice) it10.next()));
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = f0.f322471a;
                }
                return new RepeaterDropdownField(str17, str18, z11, billFormFieldAttributes5, str19, arrayList2);
            case 10:
                return new RepeaterField(billFormField.f61274a, billFormField.f61275b, billFormField.d, billFormField.f61282n, str == null ? "" : str, billForm != null ? h(billForm) : null);
            case 11:
                return new CheckboxField(billFormFieldAttributes, str3, str2, true);
            case 12:
                String str20 = billFormField.f61274a;
                String str21 = billFormField.f61275b;
                boolean z12 = billFormField.d;
                if (billFormFieldAttributes == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (billForm != null) {
                    return new NestedItemField(str20, str21, z12, billFormFieldAttributes, h(billForm));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 13:
                return new InfoField(billFormField.f61274a, billFormField.f61275b, billFormField.d, billFormField.f61282n, billFormField.i);
            case 14:
                return new BarcodeField(billFormFieldAttributes, str3, str2, z);
            case 15:
                return new QrCodeField(billFormFieldAttributes, str3, str2, z);
            case 16:
                return new QrCodeOrBarcodeField(billFormFieldAttributes, str3, str2, z);
            case 17:
                return new NumberField(billFormField.f61274a, billFormField.f61275b, billFormField.d, billFormField.f61282n, billFormField.i, billFormField.e, billFormField.f61278h, billFormField.f, null, billFormField.f61277g);
            case 18:
                return new SearchField(billFormFieldAttributes, str3, str2, z);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final BillFormV2 h(BillForm billForm) {
        ArrayList arrayList = billForm.f61270a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(g((BillFormField) it8.next()));
        }
        return new BillFormV2(arrayList2, billForm.f61271b, billForm.f61272c);
    }
}
