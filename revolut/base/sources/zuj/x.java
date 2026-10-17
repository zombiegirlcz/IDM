package zuj;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import java.time.LocalDate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f325514b;

    public /* synthetic */ x(String str, int i) {
        this.f325513a = i;
        this.f325514b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FreelancerInvoiceSettings freelancerInvoiceSettingsA;
        FreelancerInvoiceSettings freelancerInvoiceSettingsA2;
        FreelancerInvoiceSettings freelancerInvoiceSettingsA3;
        switch (this.f325513a) {
            case 0:
                n update = (n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return n.a(update, null, LocalDate.parse(this.f325514b), null, null, 13);
            case 1:
                n update2 = (n) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return n.a(update2, null, null, LocalDate.parse(this.f325514b), null, 11);
            case 2:
                zx6.h update3 = (zx6.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                FreelancerInvoiceSettings freelancerInvoiceSettings = update3.f326047a;
                if (freelancerInvoiceSettings != null) {
                    String str = this.f325514b;
                    freelancerInvoiceSettingsA = FreelancerInvoiceSettings.a(freelancerInvoiceSettings, null, null, null, null, null, null, str.length() == 0 ? null : str, null, null, null, null, null, 16255);
                } else {
                    freelancerInvoiceSettingsA = null;
                }
                return zx6.h.a(update3, freelancerInvoiceSettingsA, zx6.f.PREFIX, null, 4);
            case 3:
                zx6.h update4 = (zx6.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                FreelancerInvoiceSettings freelancerInvoiceSettings2 = update4.f326047a;
                if (freelancerInvoiceSettings2 != null) {
                    String str2 = this.f325514b;
                    if (str2.length() == 0) {
                        str2 = null;
                    }
                    freelancerInvoiceSettingsA2 = FreelancerInvoiceSettings.a(freelancerInvoiceSettings2, null, null, null, null, null, null, null, str2 != null ? kotlin.text.z.m(str2) : null, null, null, null, null, 16127);
                } else {
                    freelancerInvoiceSettingsA2 = null;
                }
                return zx6.h.a(update4, freelancerInvoiceSettingsA2, zx6.f.NUMBER, null, 4);
            case 4:
                zx6.h update5 = (zx6.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                FreelancerInvoiceSettings freelancerInvoiceSettings3 = update5.f326047a;
                if (freelancerInvoiceSettings3 != null) {
                    xi0.b.Companion.getClass();
                    freelancerInvoiceSettingsA3 = FreelancerInvoiceSettings.a(freelancerInvoiceSettings3, null, null, null, null, null, null, null, null, null, null, null, xi0.a.a(this.f325514b), 8191);
                } else {
                    freelancerInvoiceSettingsA3 = null;
                }
                return zx6.h.a(update5, freelancerInvoiceSettingsA3, null, null, 6);
            case 5:
                zz9.q update6 = (zz9.q) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return zz9.q.a(update6, null, null, this.f325514b, null, null, null, 0, false, 2039);
            default:
                zzd.q update7 = (zzd.q) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return zzd.q.a(update7, null, null, null, this.f325514b, null, null, 55);
        }
    }
}
