package nvf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.InputDualTextView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue;
import com.revolut.feature.transport.models.fields.TransportCheckoutAddressField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDateOfBirthField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDatePickerField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDateTimePickerField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDropdownField;
import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import com.revolut.feature.transport.models.fields.TransportCheckoutTextField;
import ip0.qd0;
import ip0.vd0;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import yp0.r;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model a(TransportCheckoutField transportCheckoutField, TransitCheckoutFieldValue transitCheckoutFieldValue, ywf.e eVar) {
        InputTextDelegate.Model model = new InputTextDelegate.Model(transportCheckoutField.getF92620a(), transitCheckoutFieldValue != null ? transitCheckoutFieldValue.z0() : null, new TextClause(transportCheckoutField.getF92622c(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, d(transportCheckoutField, eVar), null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, eVar != null, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33689736, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static SelectableDelegate.Model b(TransportCheckoutDropdownField field, TransportCheckoutDropdownField.Option option, String str) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(option, "option");
        String str2 = option.f92618a;
        return new SelectableDelegate.Model(j6.a.q("ID_DROPDOWN_", str2), new RowDelegate.Model(j6.a.q("ID_DROPDOWN_INNER_", str2), null, new TextClause(option.f92619b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), Intrinsics.f(str2, str) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, new j(field.f92614a, str2), null, false, 32488);
    }

    public static ArrayList c(Map fieldValues, List fields, List fieldErrors) {
        Object next;
        TextClause textClause;
        TimeClause timeClause;
        qv0.n model;
        TimeClause timeClause2;
        String str;
        qv0.n nVarA;
        String str2;
        Object next2;
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(fieldValues, "fieldValues");
        Intrinsics.checkNotNullParameter(fieldErrors, "fieldErrors");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : fieldErrors) {
            if (obj2 instanceof ywf.e) {
                arrayList.add(obj2);
            }
        }
        List<TransportCheckoutField> list = fields;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (TransportCheckoutField transportCheckoutField : list) {
            TransitCheckoutFieldValue transitCheckoutFieldValue = (TransitCheckoutFieldValue) fieldValues.get(transportCheckoutField.getF92620a());
            Iterator it8 = arrayList.iterator();
            while (true) {
                str2 = null;
                str2 = null;
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((ywf.e) next).f317420a.getF92620a(), transportCheckoutField.getF92620a())) {
                    break;
                }
            }
            ywf.e eVar = (ywf.e) next;
            if (transportCheckoutField instanceof TransportCheckoutTextField) {
                TransportCheckoutTextField transportCheckoutTextField = (TransportCheckoutTextField) transportCheckoutField;
                InputTextDelegate.Model model2 = new InputTextDelegate.Model(transportCheckoutTextField.f92620a, transitCheckoutFieldValue != null ? transitCheckoutFieldValue.z0() : null, new TextClause(transportCheckoutTextField.f92622c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, d(transportCheckoutTextField, eVar), null, null, null, null, null, false, null, null, eVar != null, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, transportCheckoutTextField, null, null, 0, 0, 0, 0, -537002136, 65023);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                model = model2;
            } else if (transportCheckoutField instanceof TransportCheckoutDropdownField) {
                TransportCheckoutDropdownField transportCheckoutDropdownField = (TransportCheckoutDropdownField) transportCheckoutField;
                if (transitCheckoutFieldValue != null) {
                    String selectedValue = transitCheckoutFieldValue.getF92577a();
                    Intrinsics.checkNotNullParameter(selectedValue, "selectedValue");
                    Iterator it9 = transportCheckoutDropdownField.f92617g.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it9.next();
                        if (Intrinsics.f(((TransportCheckoutDropdownField.Option) next2).f92618a, selectedValue)) {
                            break;
                        }
                    }
                    TransportCheckoutDropdownField.Option option = (TransportCheckoutDropdownField.Option) next2;
                    if (option != null) {
                        str2 = option.f92619b;
                    }
                }
                InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model(transportCheckoutDropdownField.f92614a, e(str2), new TextClause(transportCheckoutDropdownField.f92616c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, d(transportCheckoutDropdownField, eVar), null, null, null, null, null, false, null, null, eVar != null, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -131208, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
                yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                model = modelA;
            } else {
                if (transportCheckoutField instanceof TransportCheckoutDatePickerField) {
                    nVarA = a(transportCheckoutField, transitCheckoutFieldValue, eVar);
                } else if (transportCheckoutField instanceof TransportCheckoutAddressField) {
                    TransportCheckoutAddressField transportCheckoutAddressField = (TransportCheckoutAddressField) transportCheckoutField;
                    TransitCheckoutFieldValue.AddressField addressField = transitCheckoutFieldValue instanceof TransitCheckoutFieldValue.AddressField ? (TransitCheckoutFieldValue.AddressField) transitCheckoutFieldValue : null;
                    if ((addressField != null ? addressField.f92569a : null) == null) {
                        InputTextDelegate.Model model3 = new InputTextDelegate.Model(transportCheckoutAddressField.f92602a, null, new TextClause(transportCheckoutAddressField.f92604c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, d(transportCheckoutAddressField, eVar), null, null, null, new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, eVar != null, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33689736, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                        nVarA = model3;
                    } else {
                        CellDetailsNoteDelegate.Model model4 = new CellDetailsNoteDelegate.Model(transportCheckoutAddressField.f92602a, new TextClause(transportCheckoutAddressField.f92604c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, ((TransitCheckoutFieldValue.AddressField) transitCheckoutFieldValue).z0(), null, true, null, null, null, null, null, 0, 131028);
                        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                        nVarA = model4;
                    }
                } else if (transportCheckoutField instanceof TransportCheckoutDateTimePickerField) {
                    TransportCheckoutDateTimePickerField transportCheckoutDateTimePickerField = (TransportCheckoutDateTimePickerField) transportCheckoutField;
                    String str3 = transportCheckoutDateTimePickerField.f92611a;
                    boolean z = transitCheckoutFieldValue instanceof TransitCheckoutFieldValue.DateTimeField;
                    TransitCheckoutFieldValue.DateTimeField dateTimeField = z ? (TransitCheckoutFieldValue.DateTimeField) transitCheckoutFieldValue : null;
                    if (dateTimeField != null) {
                        LocalTime localTime = dateTimeField.f92576b;
                        textClause = (localTime == null || (str = localTime.format(DateTimeFormatter.ofPattern("HH:mm"))) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    } else {
                        textClause = null;
                    }
                    TransitCheckoutFieldValue.DateTimeField dateTimeField2 = z ? (TransitCheckoutFieldValue.DateTimeField) transitCheckoutFieldValue : null;
                    if (dateTimeField2 != null) {
                        LocalDate localDate = dateTimeField2.f92575a;
                        if (localDate != null) {
                            long jN = oc.c.N(localDate);
                            TimeClause.Format.INSTANCE.getClass();
                            timeClause2 = new TimeClause(jN, TimeClause.Format.f57959a, null, null, 12);
                        } else {
                            timeClause2 = null;
                        }
                        timeClause = timeClause2;
                    } else {
                        timeClause = null;
                    }
                    model = new InputDualTextDelegate.Model("DATE_TIME_PICKER_LIST_ID", new InputTextDelegate.Model(j6.a.q("DATE_PREFIX_", str3), timeClause, new TextClause(transportCheckoutDateTimePickerField.f92613c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, eVar != null, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, transportCheckoutDateTimePickerField, null, null, 0, 0, 0, 0, -33689608, 65023), r.a(new InputTextDelegate.Model(j6.a.q("TIME_PREFIX_", str3), textClause, new TextLocalisedClause(R$string.transport_ticket_checkout_time_input_label, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, eVar != null, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, transportCheckoutDateTimePickerField, null, null, 0, 0, 0, 0, -33685512, 65023)), new InputDualTextView.b.a(0), 32);
                    yp0.b.r(model, 0, 0, 0, 0, 15);
                } else {
                    if (!(transportCheckoutField instanceof TransportCheckoutDateOfBirthField)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVarA = a(transportCheckoutField, transitCheckoutFieldValue, eVar);
                }
                model = nVarA;
            }
            arrayList2.add(model);
        }
        return arrayList2;
    }

    public static TextClause d(TransportCheckoutField transportCheckoutField, ywf.c cVar) {
        return cVar == null ? e(transportCheckoutField.getF()) : e(transportCheckoutField.getE());
    }

    public static TextClause e(String str) {
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return null;
    }
}
