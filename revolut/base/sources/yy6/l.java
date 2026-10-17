package yy6;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateCreatePayload;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f317846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f317847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a f317848c;
    public final com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a d;

    public l(boolean z, Data profileSettingsData, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a templateDetails, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a templateDetailsSnapshot) {
        Intrinsics.checkNotNullParameter(profileSettingsData, "profileSettingsData");
        Intrinsics.checkNotNullParameter(templateDetails, "templateDetails");
        Intrinsics.checkNotNullParameter(templateDetailsSnapshot, "templateDetailsSnapshot");
        this.f317846a = z;
        this.f317847b = profileSettingsData;
        this.f317848c = templateDetails;
        this.d = templateDetailsSnapshot;
    }

    public static l a(l lVar, Data profileSettingsData, com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a templateDetails, int i) {
        boolean z = (i & 1) != 0 ? lVar.f317846a : true;
        if ((i & 2) != 0) {
            profileSettingsData = lVar.f317847b;
        }
        if ((i & 4) != 0) {
            templateDetails = lVar.f317848c;
        }
        com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a templateDetailsSnapshot = lVar.d;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(profileSettingsData, "profileSettingsData");
        Intrinsics.checkNotNullParameter(templateDetails, "templateDetails");
        Intrinsics.checkNotNullParameter(templateDetailsSnapshot, "templateDetailsSnapshot");
        return new l(z, profileSettingsData, templateDetails, templateDetailsSnapshot);
    }

    public final InvoiceTemplateCreatePayload c() {
        com.revolut.feature.freelancer.impl.ui.invoice.templates.details.a aVar = this.f317848c;
        String str = aVar.f73950c;
        if (d0.W(str)) {
            return null;
        }
        String str2 = aVar.d;
        if (d0.W(str2)) {
            return null;
        }
        List list = e() ? aVar.f73952h : null;
        if (list == null) {
            return null;
        }
        return new InvoiceTemplateCreatePayload(str, str2, aVar.e, aVar.f, aVar.f73951g, list, aVar.i, aVar.f73953j, aVar.k);
    }

    public final boolean e() {
        List<InvoiceTemplate.CustomField> list = this.f317848c.f73952h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (InvoiceTemplate.CustomField customField : list) {
            String str = customField.f86403a;
            String str2 = customField.f86404b;
            if (d0.W(str) || d0.W(str2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f317846a == lVar.f317846a && Intrinsics.f(this.f317847b, lVar.f317847b) && Intrinsics.f(this.f317848c, lVar.f317848c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f317848c.hashCode() + kii.e.c(this.f317847b, Boolean.hashCode(this.f317846a) * 31, 31)) * 31);
    }
}
