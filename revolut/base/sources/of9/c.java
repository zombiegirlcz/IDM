package of9;

import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.form.AddressField;
import com.revolut.feature.apm.bills.core.api.model.form.BarcodeField;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.apm.bills.core.api.model.form.CheckboxField;
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
import java.util.LinkedHashMap;
import java.util.List;
import jg9.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputRepeater] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputRepeaterDropdown] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputNested] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.feature.apm.bills.core.api.model.BillInputV2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.revolut.feature.apm.bills.core.api.model.BillInputV2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.revolut.feature.apm.bills.core.api.model.BillInputV2, com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputText] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.revolut.feature.apm.bills.core.api.model.BillInputV2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.revolut.feature.apm.bills.core.api.model.BillInputV2$BillInputUntypedInputs] */
    public static final ArrayList a(Object obj2, String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ?? E = (BillInputV2) it8.next();
            if (E instanceof BillInputV2.BillInputNested) {
                BillInputV2.BillInputNested billInputNested = (BillInputV2.BillInputNested) E;
                E = BillInputV2.BillInputNested.c(billInputNested, a(obj2, str, billInputNested.f61309c));
            } else if (E instanceof BillInputV2.BillInputRepeaterDropdown) {
                BillInputV2.BillInputRepeaterDropdown billInputRepeaterDropdown = (BillInputV2.BillInputRepeaterDropdown) E;
                E = BillInputV2.BillInputRepeaterDropdown.c(billInputRepeaterDropdown, a(obj2, str, billInputRepeaterDropdown.f61315c));
            } else if (E instanceof BillInputV2.BillInputRepeater) {
                BillInputV2.BillInputRepeater billInputRepeater = (BillInputV2.BillInputRepeater) E;
                E = BillInputV2.BillInputRepeater.c(billInputRepeater, a(obj2, str, billInputRepeater.f61312c));
            } else if (E instanceof BillInputV2.BillInputUntypedInputs) {
                BillInputV2.BillInputUntypedInputs billInputUntypedInputs = (BillInputV2.BillInputUntypedInputs) E;
                E = BillInputV2.BillInputUntypedInputs.c(billInputUntypedInputs, a(obj2, str, billInputUntypedInputs.f61321c));
            } else if (E instanceof BillInputV2.BillInputText) {
                BillInputV2.BillInputText billInputText = (BillInputV2.BillInputText) E;
                List list2 = billInputText.f61318c;
                List list3 = list2;
                E = billInputText;
                if (list3 != null) {
                    E = billInputText;
                    if (!list3.isEmpty()) {
                        Intrinsics.h(list2);
                        E = BillInputV2.BillInputText.c(billInputText, a(obj2, str, list2), null, 11);
                    }
                }
                if (Intrinsics.f(E.f61316a, str)) {
                    E = e(E, obj2);
                }
            } else if (Intrinsics.f(E.getF61319a(), str)) {
                E = e(E, obj2);
            }
            arrayList.add(E);
        }
        return arrayList;
    }

    public static final ArrayList b(List formFields, List existingInputs) {
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        Intrinsics.checkNotNullParameter(existingInputs, "existingInputs");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = formFields.iterator();
        while (it8.hasNext()) {
            BillFormFieldV2 billFormFieldV2 = (BillFormFieldV2) it8.next();
            Parcelable parcelableG = foh.i.g(billFormFieldV2.getF61415a(), existingInputs);
            if (parcelableG == null) {
                String strA = u.a(billFormFieldV2);
                ArrayList arrayListB = null;
                if (billFormFieldV2 instanceof TextField) {
                    TextField textField = (TextField) billFormFieldV2;
                    List list = textField.k;
                    if (list != null) {
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list != null) {
                            arrayListB = b(list, f0.f322471a);
                        }
                    }
                    parcelableG = new BillInputV2.BillInputText(textField.f61418a, u.f(billFormFieldV2), arrayListB, strA);
                } else if ((billFormFieldV2 instanceof CheckboxField) || (billFormFieldV2 instanceof DateOfBirthField) || (billFormFieldV2 instanceof DateMonthField) || (billFormFieldV2 instanceof DateYearField) || (billFormFieldV2 instanceof DropdownField) || (billFormFieldV2 instanceof FormNameField)) {
                    parcelableG = new BillInputV2.BillInputText(billFormFieldV2.getF61415a(), u.f(billFormFieldV2), null, strA);
                } else if (billFormFieldV2 instanceof MoneyField) {
                    parcelableG = new BillInputV2.BillInputMoney(null, ((MoneyField) billFormFieldV2).f61391a, null);
                } else if (billFormFieldV2 instanceof AddressField) {
                    AddressField addressField = (AddressField) billFormFieldV2;
                    parcelableG = new BillInputV2.BillInputAddress(addressField.f61352a, null, addressField.e);
                } else if (billFormFieldV2 instanceof NestedItemField) {
                    parcelableG = new BillInputV2.BillInputNested(((NestedItemField) billFormFieldV2).f61394a, f0.f322471a);
                } else if (billFormFieldV2 instanceof RepeaterDropdownField) {
                    parcelableG = new BillInputV2.BillInputRepeaterDropdown(((RepeaterDropdownField) billFormFieldV2).f61409a, f0.f322471a);
                } else if (billFormFieldV2 instanceof RepeaterField) {
                    parcelableG = new BillInputV2.BillInputRepeater(((RepeaterField) billFormFieldV2).f61412a, f0.f322471a);
                } else {
                    if (!(billFormFieldV2 instanceof BarcodeField) && !(billFormFieldV2 instanceof InfoField) && !(billFormFieldV2 instanceof NumberField) && !(billFormFieldV2 instanceof QrCodeField) && !(billFormFieldV2 instanceof QrCodeOrBarcodeField) && !(billFormFieldV2 instanceof SearchField)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    parcelableG = null;
                }
            } else if (billFormFieldV2 instanceof TextField) {
                List list2 = ((TextField) billFormFieldV2).k;
                List list3 = list2;
                if (list3 != null && !list3.isEmpty() && (parcelableG instanceof BillInputV2.BillInputText)) {
                    BillInputV2.BillInputText billInputText = (BillInputV2.BillInputText) parcelableG;
                    List list4 = billInputText.f61318c;
                    if (list4 == null) {
                        list4 = f0.f322471a;
                    }
                    Intrinsics.h(list2);
                    parcelableG = BillInputV2.BillInputText.c(billInputText, b(list2, list4), null, 11);
                }
            }
            if (parcelableG != null) {
                arrayList.add(parcelableG);
            }
        }
        return arrayList;
    }

    public static final ArrayList c(ArrayList arrayList, List list) {
        List list2 = list;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list2) {
            linkedHashMap.put(((BillFormFieldV2) obj2).getF61415a(), obj2);
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            BillInputV2 billInputV2C = (BillInputV2) it8.next();
            String f61319a = billInputV2C.getF61319a();
            BillFormFieldV2 billFormFieldV2 = f61319a != null ? (BillFormFieldV2) linkedHashMap.get(f61319a) : null;
            if ((billInputV2C instanceof BillInputV2.BillInputText) && (billFormFieldV2 instanceof TextField)) {
                TextField textField = (TextField) billFormFieldV2;
                List list3 = textField.k;
                List list4 = list3;
                if (list4 != null && !list4.isEmpty()) {
                    BillInputV2.BillInputText billInputText = (BillInputV2.BillInputText) billInputV2C;
                    Iterable iterable = billInputText.f61318c;
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    Iterable<BillInputV2> iterable2 = iterable;
                    ArrayList arrayList3 = new ArrayList(w.t(iterable2, 10));
                    for (BillInputV2 billInputV2D : iterable2) {
                        String f61319a2 = billInputV2D.getF61319a();
                        if (f61319a2 != null && !ff9.a.d(textField, f61319a2, billInputText.d)) {
                            billInputV2D = d(billInputV2D);
                        }
                        arrayList3.add(billInputV2D);
                    }
                    Intrinsics.h(list3);
                    ArrayList arrayListC = c(arrayList3, list3);
                    if (arrayListC.isEmpty()) {
                        arrayListC = null;
                    }
                    billInputV2C = BillInputV2.BillInputText.c(billInputText, arrayListC, null, 11);
                }
            }
            arrayList2.add(billInputV2C);
        }
        return arrayList2;
    }

    public static final BillInputV2 d(BillInputV2 billInputV2) {
        ArrayList arrayList;
        if (billInputV2 instanceof BillInputV2.BillInputText) {
            BillInputV2.BillInputText billInputText = (BillInputV2.BillInputText) billInputV2;
            List list = billInputText.f61318c;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(d((BillInputV2) it8.next()));
                }
            } else {
                arrayList = null;
            }
            return BillInputV2.BillInputText.c(billInputText, arrayList, null, 3);
        }
        if (billInputV2 instanceof BillInputV2.BillInputAddress) {
            return BillInputV2.BillInputAddress.c((BillInputV2.BillInputAddress) billInputV2, null);
        }
        if (billInputV2 instanceof BillInputV2.BillInputMoney) {
            return BillInputV2.BillInputMoney.c((BillInputV2.BillInputMoney) billInputV2, null);
        }
        if (!(billInputV2 instanceof BillInputV2.BillInputNested)) {
            if ((billInputV2 instanceof BillInputV2.BillInputRepeaterDropdown) || (billInputV2 instanceof BillInputV2.BillInputRepeater) || (billInputV2 instanceof BillInputV2.BillInputUntypedInputs)) {
                return billInputV2;
            }
            throw new NoWhenBranchMatchedException();
        }
        BillInputV2.BillInputNested billInputNested = (BillInputV2.BillInputNested) billInputV2;
        List list3 = billInputNested.f61309c;
        ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            arrayList2.add(d((BillInputV2) it9.next()));
        }
        return BillInputV2.BillInputNested.c(billInputNested, arrayList2);
    }

    public static final BillInputV2 e(BillInputV2 billInputV2, Object obj2) {
        if (billInputV2 instanceof BillInputV2.BillInputText) {
            String str = obj2 instanceof String ? (String) obj2 : null;
            BillInputV2.BillInputText billInputText = (BillInputV2.BillInputText) billInputV2;
            return str != null ? BillInputV2.BillInputText.c(billInputText, null, str, 7) : billInputText;
        }
        if (billInputV2 instanceof BillInputV2.BillInputMoney) {
            dj0.d dVar = obj2 instanceof dj0.d ? (dj0.d) obj2 : null;
            BillInputV2.BillInputMoney billInputMoney = (BillInputV2.BillInputMoney) billInputV2;
            return dVar != null ? BillInputV2.BillInputMoney.c(billInputMoney, dVar) : billInputMoney;
        }
        if (billInputV2 instanceof BillInputV2.BillInputAddress) {
            Address address = obj2 instanceof Address ? (Address) obj2 : null;
            BillInputV2.BillInputAddress billInputAddress = (BillInputV2.BillInputAddress) billInputV2;
            return address != null ? BillInputV2.BillInputAddress.c(billInputAddress, address) : billInputAddress;
        }
        if ((billInputV2 instanceof BillInputV2.BillInputNested) || (billInputV2 instanceof BillInputV2.BillInputRepeaterDropdown) || (billInputV2 instanceof BillInputV2.BillInputRepeater) || (billInputV2 instanceof BillInputV2.BillInputUntypedInputs)) {
            return billInputV2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
