package sp1;

import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.bills.core.api.model.BillFormFooter;
import com.revolut.feature.apm.bills.core.api.model.BillFormHeader;
import com.revolut.feature.apm.bills.core.api.model.form.AddressField;
import com.revolut.feature.apm.bills.core.api.model.form.BarcodeField;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldControl;
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
import ip1.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import yo1.g;
import yo1.h;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final BillFormV2 a(ip1.d dVar) {
        BillFormHeader billFormHeader;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List inputs = dVar.getInputs();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = inputs.iterator();
        while (it8.hasNext()) {
            BillFormFieldV2 billFormFieldV2B = b((ip1.b) it8.next());
            if (billFormFieldV2B != null) {
                arrayList.add(billFormFieldV2B);
            }
        }
        h header = dVar.getHeader();
        BillFormFooter billFormFooter = null;
        if (header != null) {
            Intrinsics.checkNotNullParameter(header, "<this>");
            String key = header.getKey();
            String html = header.getHtml();
            yo1.f tooltip = header.getTooltip();
            billFormHeader = new BillFormHeader(key, html, tooltip != null ? zo1.a.b(tooltip) : null);
        } else {
            billFormHeader = null;
        }
        g footer = dVar.getFooter();
        if (footer != null) {
            Intrinsics.checkNotNullParameter(footer, "<this>");
            billFormFooter = new BillFormFooter(footer.getKey(), footer.getHtml(), footer.getDefaultValue());
        }
        return new BillFormV2(arrayList, billFormHeader, billFormFooter);
    }

    public static final BillFormFieldV2 b(ip1.b bVar) {
        boolean zBooleanValue;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            String name = aVar.getName();
            String label = aVar.getLabel();
            if (label == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional = aVar.getOptional();
            boolean zBooleanValue2 = optional != null ? optional.booleanValue() : false;
            yo1.b attributes = aVar.getAttributes();
            BillFormField.BillFormFieldAttributes billFormFieldAttributesA = attributes != null ? zo1.a.a(attributes) : null;
            no3.b defaultValue = aVar.getDefaultValue();
            return new AddressField(name, label, zBooleanValue2, billFormFieldAttributesA, defaultValue != null ? oo3.a.a(defaultValue) : null);
        }
        if (bVar instanceof b.c) {
            b.c cVar = (b.c) bVar;
            String name2 = cVar.getName();
            String label2 = cVar.getLabel();
            if (label2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            yo1.b attributes2 = cVar.getAttributes();
            return new CheckboxField(attributes2 != null ? zo1.a.a(attributes2) : null, name2, label2, true);
        }
        if (bVar instanceof b.e) {
            b.e eVar = (b.e) bVar;
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            String name3 = eVar.getName();
            String label3 = eVar.getLabel();
            String str = label3 == null ? "" : label3;
            Boolean optional2 = eVar.getOptional();
            boolean zBooleanValue3 = optional2 != null ? optional2.booleanValue() : false;
            yo1.b attributes3 = eVar.getAttributes();
            return new DateOfBirthField(name3, str, zBooleanValue3, attributes3 != null ? zo1.a.a(attributes3) : null, eVar.getRegex(), eVar.getDefaultValue());
        }
        if (bVar instanceof b.d) {
            b.d dVar = (b.d) bVar;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            String name4 = dVar.getName();
            String label4 = dVar.getLabel();
            String str2 = label4 == null ? "" : label4;
            Boolean optional3 = dVar.getOptional();
            boolean zBooleanValue4 = optional3 != null ? optional3.booleanValue() : false;
            yo1.b attributes4 = dVar.getAttributes();
            return new DateMonthField(name4, str2, zBooleanValue4, attributes4 != null ? zo1.a.a(attributes4) : null, dVar.getRegex());
        }
        if (bVar instanceof b.f) {
            b.f fVar = (b.f) bVar;
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            String name5 = fVar.getName();
            String label5 = fVar.getLabel();
            String str3 = label5 == null ? "" : label5;
            Boolean optional4 = fVar.getOptional();
            boolean zBooleanValue5 = optional4 != null ? optional4.booleanValue() : false;
            yo1.b attributes5 = fVar.getAttributes();
            return new DateYearField(name5, str3, zBooleanValue5, attributes5 != null ? zo1.a.a(attributes5) : null, fVar.getRegex());
        }
        if (bVar instanceof b.h) {
            b.h hVar = (b.h) bVar;
            String name6 = hVar.getName();
            String label6 = hVar.getLabel();
            if (label6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional5 = hVar.getOptional();
            boolean zBooleanValue6 = optional5 != null ? optional5.booleanValue() : false;
            String inputMask = hVar.getInputMask();
            String placeholder = hVar.getPlaceholder();
            String regex = hVar.getRegex();
            String regexExplain = hVar.getRegexExplain();
            yo1.f tooltip = hVar.getTooltip();
            BillFormField.Tooltip tooltipB = tooltip != null ? zo1.a.b(tooltip) : null;
            yo1.b attributes6 = hVar.getAttributes();
            BillFormField.BillFormFieldAttributes billFormFieldAttributesA2 = attributes6 != null ? zo1.a.a(attributes6) : null;
            List choices = hVar.getChoices();
            if (choices == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List list = choices;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(c((ip1.c) it8.next()));
            }
            return new DropdownField(name6, label6, zBooleanValue6, billFormFieldAttributesA2, arrayList2, inputMask, placeholder, regex, regexExplain, tooltipB);
        }
        if (bVar instanceof b.i) {
            b.i iVar = (b.i) bVar;
            String name7 = iVar.getName();
            String label7 = iVar.getLabel();
            if (label7 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional6 = iVar.getOptional();
            boolean zBooleanValue7 = optional6 != null ? optional6.booleanValue() : false;
            String defaultValue2 = iVar.getDefaultValue();
            yo1.b attributes7 = iVar.getAttributes();
            return new FormNameField(name7, label7, zBooleanValue7, attributes7 != null ? zo1.a.a(attributes7) : null, defaultValue2);
        }
        if (bVar instanceof b.k) {
            b.k kVar = (b.k) bVar;
            String name8 = kVar.getName();
            String label8 = kVar.getLabel();
            String str4 = label8 == null ? "" : label8;
            Boolean optional7 = kVar.getOptional();
            boolean zBooleanValue8 = optional7 != null ? optional7.booleanValue() : false;
            yo1.b attributes8 = kVar.getAttributes();
            BillFormField.BillFormFieldAttributes billFormFieldAttributesA3 = attributes8 != null ? zo1.a.a(attributes8) : null;
            xi0.a aVar2 = xi0.b.Companion;
            yo1.b attributes9 = kVar.getAttributes();
            String currency = attributes9 != null ? attributes9.getCurrency() : null;
            if (currency == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar2.getClass();
            return new MoneyField(name8, str4, zBooleanValue8, billFormFieldAttributesA3, xi0.a.a(currency));
        }
        if (bVar instanceof b.q) {
            b.q qVar = (b.q) bVar;
            String name9 = qVar.getName();
            String label9 = qVar.getLabel();
            if (label9 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional8 = qVar.getOptional();
            boolean zBooleanValue9 = optional8 != null ? optional8.booleanValue() : false;
            String placeholder2 = qVar.getPlaceholder();
            BillFormV2 billFormV2A = a(qVar.getSubForm());
            yo1.b attributes10 = qVar.getAttributes();
            return new RepeaterField(name9, label9, zBooleanValue9, attributes10 != null ? zo1.a.a(attributes10) : null, placeholder2, billFormV2A);
        }
        if (bVar instanceof b.p) {
            b.p pVar = (b.p) bVar;
            String name10 = pVar.getName();
            String label10 = pVar.getLabel();
            if (label10 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional9 = pVar.getOptional();
            boolean zBooleanValue10 = optional9 != null ? optional9.booleanValue() : false;
            yo1.b attributes11 = pVar.getAttributes();
            BillFormField.BillFormFieldAttributes billFormFieldAttributesA4 = attributes11 != null ? zo1.a.a(attributes11) : null;
            String placeholder3 = pVar.getPlaceholder();
            List choices2 = pVar.getChoices();
            ArrayList arrayList3 = new ArrayList(w.t(choices2, 10));
            Iterator it9 = choices2.iterator();
            while (it9.hasNext()) {
                arrayList3.add(c((ip1.c) it9.next()));
            }
            return new RepeaterDropdownField(name10, label10, zBooleanValue10, billFormFieldAttributesA4, placeholder3, arrayList3);
        }
        if (bVar instanceof b.s) {
            b.s sVar = (b.s) bVar;
            String name11 = sVar.getName();
            String label11 = sVar.getLabel();
            if (label11 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional10 = sVar.getOptional();
            boolean zBooleanValue11 = optional10 != null ? optional10.booleanValue() : false;
            String defaultValue3 = sVar.getDefaultValue();
            String inputMask2 = sVar.getInputMask();
            String placeholder4 = sVar.getPlaceholder();
            String regex2 = sVar.getRegex();
            String regexExplain2 = sVar.getRegexExplain();
            yo1.f tooltip2 = sVar.getTooltip();
            BillFormField.Tooltip tooltipB2 = tooltip2 != null ? zo1.a.b(tooltip2) : null;
            yo1.b attributes12 = sVar.getAttributes();
            BillFormField.BillFormFieldAttributes billFormFieldAttributesA5 = attributes12 != null ? zo1.a.a(attributes12) : null;
            List childInputs = sVar.getChildInputs();
            if (childInputs != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it10 = childInputs.iterator();
                while (it10.hasNext()) {
                    BillFormFieldV2 billFormFieldV2B = b((ip1.b) it10.next());
                    if (billFormFieldV2B != null) {
                        arrayList4.add(billFormFieldV2B);
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            Map controls = sVar.getControls();
            if (controls != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(controls.size()));
                for (Map.Entry entry : controls.entrySet()) {
                    Object key = entry.getKey();
                    ip1.a aVar3 = (ip1.a) entry.getValue();
                    List anyOf = aVar3.getAnyOf();
                    Set setI1 = anyOf != null ? d0.i1(anyOf) : null;
                    List noneOf = aVar3.getNoneOf();
                    linkedHashMap2.put(key, new BillFormFieldControl(setI1, noneOf != null ? d0.i1(noneOf) : null));
                }
                linkedHashMap = linkedHashMap2;
            } else {
                linkedHashMap = null;
            }
            return new TextField(name11, label11, zBooleanValue11, billFormFieldAttributesA5, defaultValue3, inputMask2, placeholder4, regex2, regexExplain2, tooltipB2, arrayList, linkedHashMap);
        }
        if (bVar instanceof b.j) {
            b.j jVar = (b.j) bVar;
            String name12 = jVar.getName();
            String label12 = jVar.getLabel();
            if (label12 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional11 = jVar.getOptional();
            boolean zBooleanValue12 = optional11 != null ? optional11.booleanValue() : false;
            String defaultValue4 = jVar.getDefaultValue();
            yo1.b attributes13 = jVar.getAttributes();
            return new InfoField(name12, label12, zBooleanValue12, attributes13 != null ? zo1.a.a(attributes13) : null, defaultValue4);
        }
        if (bVar instanceof b.m) {
            b.m mVar = (b.m) bVar;
            String name13 = mVar.getName();
            String label13 = mVar.getLabel();
            if (label13 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional12 = mVar.getOptional();
            boolean zBooleanValue13 = optional12 != null ? optional12.booleanValue() : false;
            String defaultValue5 = mVar.getDefaultValue();
            String inputMask3 = mVar.getInputMask();
            String placeholder5 = mVar.getPlaceholder();
            String regex3 = mVar.getRegex();
            String regexExplain3 = mVar.getRegexExplain();
            yo1.f tooltip3 = mVar.getTooltip();
            BillFormField.Tooltip tooltipB3 = tooltip3 != null ? zo1.a.b(tooltip3) : null;
            yo1.b attributes14 = mVar.getAttributes();
            return new NumberField(name13, label13, zBooleanValue13, attributes14 != null ? zo1.a.a(attributes14) : null, defaultValue5, inputMask3, placeholder5, regex3, regexExplain3, tooltipB3);
        }
        if (bVar instanceof b.r) {
            b.r rVar = (b.r) bVar;
            String name14 = rVar.getName();
            String label14 = rVar.getLabel();
            if (label14 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional13 = rVar.getOptional();
            zBooleanValue = optional13 != null ? optional13.booleanValue() : false;
            yo1.b attributes15 = rVar.getAttributes();
            return new SearchField(attributes15 != null ? zo1.a.a(attributes15) : null, name14, label14, zBooleanValue);
        }
        if (bVar instanceof b.n) {
            b.n nVar = (b.n) bVar;
            String name15 = nVar.getName();
            String label15 = nVar.getLabel();
            if (label15 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional14 = nVar.getOptional();
            zBooleanValue = optional14 != null ? optional14.booleanValue() : false;
            yo1.b attributes16 = nVar.getAttributes();
            return new QrCodeField(attributes16 != null ? zo1.a.a(attributes16) : null, name15, label15, zBooleanValue);
        }
        if (bVar instanceof b.C0934b) {
            b.C0934b c0934b = (b.C0934b) bVar;
            String name16 = c0934b.getName();
            String label16 = c0934b.getLabel();
            if (label16 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional15 = c0934b.getOptional();
            zBooleanValue = optional15 != null ? optional15.booleanValue() : false;
            yo1.b attributes17 = c0934b.getAttributes();
            return new BarcodeField(attributes17 != null ? zo1.a.a(attributes17) : null, name16, label16, zBooleanValue);
        }
        if (bVar instanceof b.o) {
            b.o oVar = (b.o) bVar;
            String name17 = oVar.getName();
            String label17 = oVar.getLabel();
            if (label17 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean optional16 = oVar.getOptional();
            zBooleanValue = optional16 != null ? optional16.booleanValue() : false;
            yo1.b attributes18 = oVar.getAttributes();
            return new QrCodeOrBarcodeField(attributes18 != null ? zo1.a.a(attributes18) : null, name17, label17, zBooleanValue);
        }
        if (!(bVar instanceof b.l)) {
            return null;
        }
        b.l lVar = (b.l) bVar;
        String name18 = lVar.getName();
        String label18 = lVar.getLabel();
        if (label18 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Boolean optional17 = lVar.getOptional();
        boolean zBooleanValue14 = optional17 != null ? optional17.booleanValue() : false;
        yo1.b attributes19 = lVar.getAttributes();
        if (attributes19 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BillFormField.BillFormFieldAttributes billFormFieldAttributesA6 = zo1.a.a(attributes19);
        ip1.d subForm = lVar.getSubForm();
        if (subForm != null) {
            return new NestedItemField(name18, label18, zBooleanValue14, billFormFieldAttributesA6, a(subForm));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    public static final ChoiceV2 c(ip1.c cVar) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String label = cVar.getLabel();
        String str = label == null ? "" : label;
        String value = cVar.getValue();
        String str2 = value == null ? "" : value;
        String description = cVar.getDescription();
        String accessoryText = cVar.getAccessoryText();
        List childInputs = cVar.getChildInputs();
        if (childInputs != null) {
            arrayList = new ArrayList();
            Iterator it8 = childInputs.iterator();
            while (it8.hasNext()) {
                BillFormFieldV2 billFormFieldV2B = b((ip1.b) it8.next());
                if (billFormFieldV2B != null) {
                    arrayList.add(billFormFieldV2B);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r62 = arrayList;
        ip1.d subForm = cVar.getSubForm();
        BillFormV2 billFormV2A = subForm != null ? a(subForm) : null;
        yo1.b attributes = cVar.getAttributes();
        return new ChoiceV2(str2, str, description, r62, billFormV2A, attributes != null ? zo1.a.a(attributes) : null, accessoryText);
    }
}
