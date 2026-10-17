package s9d;

import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import kotlin.jvm.internal.Intrinsics;
import r9d.b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final b.C1393b a(InvoiceTemplate.CustomField customField) {
        Intrinsics.checkNotNullParameter(customField, "<this>");
        return new b.C1393b(customField.f86403a, customField.f86404b);
    }
}
