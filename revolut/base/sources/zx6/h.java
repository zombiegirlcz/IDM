package zx6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoiceSettings f326047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f326048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f326049c;

    public h() {
        this(0);
    }

    public static h a(h hVar, FreelancerInvoiceSettings freelancerInvoiceSettings, f focusedField, Data invoiceSettingsInfo, int i) {
        if ((i & 1) != 0) {
            freelancerInvoiceSettings = hVar.f326047a;
        }
        if ((i & 2) != 0) {
            focusedField = hVar.f326048b;
        }
        if ((i & 4) != 0) {
            invoiceSettingsInfo = hVar.f326049c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(invoiceSettingsInfo, "invoiceSettingsInfo");
        return new h(freelancerInvoiceSettings, focusedField, invoiceSettingsInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f326047a, hVar.f326047a) && this.f326048b == hVar.f326048b && Intrinsics.f(this.f326049c, hVar.f326049c);
    }

    public final int hashCode() {
        FreelancerInvoiceSettings freelancerInvoiceSettings = this.f326047a;
        return this.f326049c.hashCode() + ((this.f326048b.hashCode() + ((freelancerInvoiceSettings == null ? 0 : freelancerInvoiceSettings.hashCode()) * 31)) * 31);
    }

    public h(FreelancerInvoiceSettings freelancerInvoiceSettings, f focusedField, Data invoiceSettingsInfo) {
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(invoiceSettingsInfo, "invoiceSettingsInfo");
        this.f326047a = freelancerInvoiceSettings;
        this.f326048b = focusedField;
        this.f326049c = invoiceSettingsInfo;
    }

    public /* synthetic */ h(int i) {
        this(null, f.PREFIX, new Data(null, null, true, 3, null));
    }
}
