package zo1;

import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yo1.b;
import yo1.c;
import yo1.e;
import yo1.f;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final BillFormField.BillFormFieldAttributes a(b bVar) {
        xi0.b bVarA;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String subLabelKey = bVar.getSubLabelKey();
        String subLabelDefaultValue = bVar.getSubLabelDefaultValue();
        String currency = bVar.getCurrency();
        if (currency != null) {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(currency);
        } else {
            bVarA = null;
        }
        return new BillFormField.BillFormFieldAttributes(subLabelKey, subLabelDefaultValue, bVarA, bVar.getLimit(), bVar.getSearchPlaceholder());
    }

    public static final BillFormField.Tooltip b(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String label = fVar.getLabel();
        String text = fVar.getText();
        if (text == null) {
            text = "";
        }
        return new BillFormField.Tooltip(label, fVar.getTitle(), fVar.getDescription(), text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v18, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.apm.bills.core.api.model.BillFormField c(yo1.c r24) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zo1.a.c(yo1.c):com.revolut.feature.apm.bills.core.api.model.BillFormField");
    }

    public static final ArrayList d(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        List inputs = eVar.getInputs();
        ArrayList arrayList = new ArrayList(w.t(inputs, 10));
        Iterator it8 = inputs.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((c) it8.next()));
        }
        return arrayList;
    }
}
