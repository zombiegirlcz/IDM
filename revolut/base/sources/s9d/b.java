package s9d;

import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateOverride;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import r9d.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final InvoiceTemplateOverride.Value a(c.b bVar) {
        u9d.c cVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String action = bVar.getAction();
        u9d.c[] cVarArrValues = u9d.c.values();
        int length = cVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i];
            if (a0.z(cVar.name(), action, true)) {
                break;
            }
            i++;
        }
        return new InvoiceTemplateOverride.Value(cVar, bVar.getValue());
    }
}
