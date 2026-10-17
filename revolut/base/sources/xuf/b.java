package xuf;

import avf.c;
import avf.d;
import com.revolut.feature.transport.models.fields.TransportCheckoutAddressField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDateOfBirthField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDatePickerField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDateTimePickerField;
import com.revolut.feature.transport.models.fields.TransportCheckoutDropdownField;
import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import com.revolut.feature.transport.models.fields.TransportCheckoutTextField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public static final TransportCheckoutField a(d dVar) {
        ?? arrayList;
        Object next;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        avf.b bVar = c.Companion;
        String value = dVar.getType();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator it8 = c.a().iterator();
        while (true) {
            arrayList = 0;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((c) next).b(), value)) {
                break;
            }
        }
        c cVar = (c) next;
        switch (cVar == null ? -1 : a.f309060a[cVar.ordinal()]) {
            case 1:
                return new TransportCheckoutTextField(dVar.getId(), dVar.getCode(), dVar.getLabel(), dVar.getErrorMessage(), dVar.getDescription(), dVar.getRegex(), dVar.getIsRequired());
            case 2:
                String id10 = dVar.getId();
                String code = dVar.getCode();
                String label = dVar.getLabel();
                boolean isRequired = dVar.getIsRequired();
                String errorMessage = dVar.getErrorMessage();
                String description = dVar.getDescription();
                List values = dVar.getValues();
                if (values != null) {
                    List<avf.a> list = values;
                    arrayList = new ArrayList(w.t(list, 10));
                    for (avf.a aVar : list) {
                        arrayList.add(new TransportCheckoutDropdownField.Option(aVar.getValue(), aVar.getLabel()));
                    }
                }
                if (arrayList == 0) {
                    arrayList = f0.f322471a;
                }
                return new TransportCheckoutDropdownField(id10, code, arrayList, label, errorMessage, description, isRequired);
            case 3:
                return new TransportCheckoutDatePickerField(dVar.getId(), dVar.getCode(), dVar.getLabel(), dVar.getErrorMessage(), dVar.getDescription(), dVar.getIsRequired());
            case 4:
                return new TransportCheckoutDateTimePickerField(dVar.getId(), dVar.getCode(), dVar.getLabel(), dVar.getErrorMessage(), dVar.getDescription(), dVar.getIsRequired());
            case 5:
                return new TransportCheckoutAddressField(dVar.getId(), dVar.getCode(), dVar.getLabel(), dVar.getErrorMessage(), dVar.getDescription(), dVar.getIsRequired());
            case 6:
                return new TransportCheckoutDateOfBirthField(dVar.getId(), dVar.getCode(), dVar.getLabel(), dVar.getErrorMessage(), dVar.getDescription(), dVar.getIsRequired());
            default:
                return null;
        }
    }
}
