package sp1;

import com.revolut.feature.apm.bills.core.api.model.BillFieldV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qp1.g;
import qp1.h;
import qp1.i;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class f {
    public static final BillFieldV2 a(qp1.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List fields = bVar.getFields();
        ArrayList arrayList = new ArrayList(w.t(fields, 10));
        Iterator it8 = fields.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((qp1.b) it8.next()));
        }
        qp1.c type = bVar.getType();
        switch (type == null ? -1 : e.f264876a[type.ordinal()]) {
            case 1:
                i value = bVar.getValue();
                qp1.d dVar = value instanceof qp1.d ? (qp1.d) value : null;
                if (dVar == null) {
                    throw new IllegalStateException("ADDRESS without address value");
                }
                String label = bVar.getLabel();
                if (label != null) {
                    return new BillFieldV2.BillFieldAddress(label, oo3.a.a(dVar.f248232a));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 2:
                i value2 = bVar.getValue();
                qp1.e eVar = value2 instanceof qp1.e ? (qp1.e) value2 : null;
                if (eVar == null) {
                    throw new IllegalStateException("DATE_MONTH without value");
                }
                String label2 = bVar.getLabel();
                if (label2 != null) {
                    return new BillFieldV2.BillFieldDateMonth(label2, eVar.f248233a);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 3:
                i value3 = bVar.getValue();
                qp1.f fVar = value3 instanceof qp1.f ? (qp1.f) value3 : null;
                if (fVar == null) {
                    throw new IllegalStateException("DATE_OF_BIRTH without value");
                }
                String label3 = bVar.getLabel();
                if (label3 != null) {
                    return new BillFieldV2.BillFieldDateOfBirth(label3, fVar.f248234a);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 4:
                i value4 = bVar.getValue();
                g gVar = value4 instanceof g ? (g) value4 : null;
                if (gVar == null) {
                    throw new IllegalStateException("MONEY without money value");
                }
                String label4 = bVar.getLabel();
                if (label4 != null) {
                    return new BillFieldV2.BillFieldMoney(mo3.a.o(gVar.f248235a), label4);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 5:
                String label5 = bVar.getLabel();
                if (label5 != null) {
                    return new BillFieldV2.BillFieldSubform(label5, arrayList);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                return new BillFieldV2.BillFieldSection(bVar.getLabel(), arrayList);
            default:
                i value5 = bVar.getValue();
                h hVar = value5 instanceof h ? (h) value5 : null;
                String str = hVar != null ? hVar.f248236a : null;
                String label6 = bVar.getLabel();
                if (label6 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (str == null) {
                    str = "";
                }
                yo1.f tooltip = bVar.getTooltip();
                return new BillFieldV2.BillFieldText(label6, str, tooltip != null ? zo1.a.b(tooltip) : null);
        }
    }
}
