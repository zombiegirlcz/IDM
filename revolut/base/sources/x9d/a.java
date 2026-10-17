package x9d;

import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateCreatePayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u9d.b;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate a(r9d.b r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r2 = r13.getId()
            boolean r3 = r13.getIsDefault()
            java.lang.String r4 = r13.getTemplateName()
            java.lang.String r1 = r13.getInvoiceTitle()
            if (r1 != 0) goto L19
            java.lang.String r1 = ""
        L19:
            r5 = r1
            boolean r6 = r13.getLogoEnabled()
            boolean r7 = r13.getVatNumberEnabled()
            boolean r8 = r13.getBankTransferDetailsEnabled()
            java.util.List r1 = r13.getCustomFields()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = zhm.w.t(r1, r10)
            r9.<init>(r10)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L5b
            java.lang.Object r10 = r1.next()
            r9d.b$b r10 = (r9d.b.C1393b) r10
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate$CustomField r11 = new com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate$CustomField
            java.lang.String r12 = r10.getName()
            java.lang.String r10 = r10.getValue()
            r11.<init>(r12, r10)
            r9.add(r11)
            goto L3b
        L5b:
            java.lang.String r0 = r13.getLocale()
            if (r0 == 0) goto L6f
            u9d.a r1 = u9d.b.Companion
            r1.getClass()
            u9d.b r0 = u9d.a.a(r0)
            if (r0 != 0) goto L6d
            goto L6f
        L6d:
            r10 = r0
            goto L72
        L6f:
            u9d.b r0 = u9d.b.ENGLISH_UK
            goto L6d
        L72:
            java.lang.String r11 = r13.getHeader()
            java.lang.String r12 = r13.getFooter()
            com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate r1 = new com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x9d.a.a(r9d.b):com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate");
    }

    public static final r9d.a b(InvoiceTemplateCreatePayload invoiceTemplateCreatePayload) {
        Intrinsics.checkNotNullParameter(invoiceTemplateCreatePayload, "<this>");
        String str = invoiceTemplateCreatePayload.f86405a;
        String str2 = invoiceTemplateCreatePayload.f86406b;
        boolean z = invoiceTemplateCreatePayload.f86407c;
        boolean z3 = invoiceTemplateCreatePayload.d;
        boolean z4 = invoiceTemplateCreatePayload.e;
        List list = invoiceTemplateCreatePayload.f;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(s9d.a.a((InvoiceTemplate.CustomField) it8.next()));
        }
        b bVar = invoiceTemplateCreatePayload.f86408g;
        return new r9d.a(str, str2, z, z3, z4, arrayList, bVar != null ? bVar.getCode() : null, invoiceTemplateCreatePayload.f86409h, invoiceTemplateCreatePayload.i);
    }

    public static final r9d.b c(InvoiceTemplate invoiceTemplate) {
        Intrinsics.checkNotNullParameter(invoiceTemplate, "<this>");
        String str = invoiceTemplate.f86397a;
        boolean z = invoiceTemplate.f86398b;
        String str2 = invoiceTemplate.f86399c;
        String str3 = invoiceTemplate.d;
        boolean z3 = invoiceTemplate.e;
        boolean z4 = invoiceTemplate.f;
        boolean z6 = invoiceTemplate.f86400g;
        ArrayList arrayList = invoiceTemplate.f86401h;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(s9d.a.a((InvoiceTemplate.CustomField) it8.next()));
        }
        return new r9d.b(str, z, str2, str3, z3, z4, z6, arrayList2, invoiceTemplate.i.getCode(), invoiceTemplate.f86402j, invoiceTemplate.k);
    }
}
