package ox5;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceRecurringPeriod;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f230598b;

    public /* synthetic */ m0(Data data, int i) {
        this.f230597a = i;
        this.f230598b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d3c.p pVar;
        Data data;
        nel.e0 e0VarK;
        switch (this.f230597a) {
            case 0:
                return l.a((l) obj2, null, this.f230598b, null, null, null, null, null, null, 0, null, null, false, null, null, false, 32765);
            case 1:
                return l.a((l) obj2, null, null, null, this.f230598b, null, null, null, null, 0, null, null, false, null, null, false, 32759);
            case 2:
                return l.a((l) obj2, null, null, null, null, this.f230598b, null, null, null, 0, null, null, false, null, null, false, 32751);
            case 3:
                ((ox6.i) obj2).getClass();
                Data invoiceDetailsData = this.f230598b;
                Intrinsics.checkNotNullParameter(invoiceDetailsData, "invoiceDetailsData");
                return new ox6.i(invoiceDetailsData);
            case 4:
                ((oxd.g) obj2).getClass();
                Data methods = this.f230598b;
                Intrinsics.checkNotNullParameter(methods, "methods");
                return new oxd.g(methods);
            case 5:
                oy6.f fVar = (oy6.f) obj2;
                Data invoiceSettingsData = this.f230598b;
                Intrinsics.h(invoiceSettingsData);
                oy6.i gVar = fVar.f230893b;
                oy6.j jVar = null;
                if (gVar == null) {
                    FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) invoiceSettingsData.getContent();
                    if (freelancerInvoiceSettings != null) {
                        Integer num = freelancerInvoiceSettings.f73409l;
                        gVar = num != null ? new oy6.g(num) : oy6.h.f230896a;
                    } else {
                        gVar = null;
                    }
                }
                oy6.j jVar2 = fVar.f230894c;
                if (jVar2 != null) {
                    jVar = jVar2;
                } else {
                    FreelancerInvoiceSettings freelancerInvoiceSettings2 = (FreelancerInvoiceSettings) invoiceSettingsData.getContent();
                    if (freelancerInvoiceSettings2 != null) {
                        FreelancerInvoiceRecurringPeriod freelancerInvoiceRecurringPeriod = freelancerInvoiceSettings2.k;
                        if (freelancerInvoiceRecurringPeriod != null) {
                            jVar = new oy6.j(Integer.valueOf(freelancerInvoiceRecurringPeriod.f73402b), freelancerInvoiceRecurringPeriod.f73401a);
                        } else {
                            jVar2 = new oy6.j(0, sr6.l.YEAR);
                            jVar = jVar2;
                        }
                    }
                }
                Intrinsics.checkNotNullParameter(invoiceSettingsData, "invoiceSettingsData");
                return new oy6.f(invoiceSettingsData, gVar, jVar);
            case 6:
                return p1g.e.a((p1g.e) obj2, this.f230598b, null, 6);
            case 7:
                return p1g.e.a((p1g.e) obj2, null, this.f230598b, 5);
            case 8:
                Data data2 = this.f230598b;
                Intrinsics.h(data2);
                return p2c.i.a((p2c.i) obj2, 0, null, null, data2, null, 47);
            case 9:
                Data data3 = this.f230598b;
                Intrinsics.h(data3);
                return p2c.i.a((p2c.i) obj2, 0, null, null, null, data3, 31);
            case 10:
                p3b.e eVar = (p3b.e) obj2;
                bfl.g tradeSide = eVar.f232710b;
                e2b.a orderType = eVar.f232711c;
                CfdExposureBreakdownTarget exposureTarget = eVar.d;
                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                Intrinsics.checkNotNullParameter(exposureTarget, "exposureTarget");
                return new p3b.e(this.f230598b, tradeSide, orderType, exposureTarget);
            case 11:
                return p4c.k.a((p4c.k) obj2, 0L, null, null, null, null, null, this.f230598b, null, 191);
            case 12:
                return p4c.k.a((p4c.k) obj2, 0L, this.f230598b, null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 13:
                return p4c.k.a((p4c.k) obj2, 0L, null, this.f230598b, null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 14:
                p4c.k kVar = (p4c.k) obj2;
                d3c.x xVar = kVar.e;
                Data data4 = this.f230598b;
                if (xVar == null) {
                    od0.i iVar = (od0.i) data4.getContent();
                    xVar = (iVar == null || (pVar = (d3c.p) iVar.f224257a) == null) ? null : (d3c.x) zhm.d0.d0(pVar.f);
                }
                return p4c.k.a(kVar, 0L, null, null, data4, xVar, null, null, null, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION);
            case 15:
                return p4c.k.a((p4c.k) obj2, 0L, null, null, null, null, null, null, this.f230598b, CertificateBody.profileType);
            case 16:
                p4c.k kVar2 = (p4c.k) obj2;
                Long l2 = (Long) this.f230598b.getContent();
                return p4c.k.a(kVar2, l2 != null ? l2.longValue() : 0L, null, null, null, null, null, null, null, 254);
            case 17:
                p5e.e eVar2 = (p5e.e) obj2;
                Data data5 = this.f230598b;
                Intrinsics.h(data5);
                try {
                    Object content = data5.getContent();
                    data = new Data((content == null || (e0VarK = ifk.b.k((nel.n) content)) == null) ? null : e0VarK.e, data5.getError(), data5.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data5.getLoading());
                }
                return p5e.e.a(eVar2, null, null, data, 0, 47);
            case 18:
                ((p62.g) obj2).getClass();
                Data data6 = this.f230598b;
                Intrinsics.checkNotNullParameter(data6, "data");
                return new p62.g(data6);
            case 19:
                ((u5h.c) obj2).getClass();
                return new u5h.c(this.f230598b);
            case 20:
                ((p7f.i) obj2).getClass();
                return new p7f.i(this.f230598b);
            case 21:
                ((p8f.e) obj2).getClass();
                Data allocationItemsData = this.f230598b;
                Intrinsics.checkNotNullParameter(allocationItemsData, "allocationItemsData");
                return new p8f.e(allocationItemsData);
            case 22:
                return pb2.h.a((pb2.h) obj2, this.f230598b, null, 2);
            case 23:
                ((pch.c) obj2).getClass();
                return new pch.c(this.f230598b);
            case 24:
                Data data7 = this.f230598b;
                Intrinsics.h(data7);
                return pdg.m.a((pdg.m) obj2, null, null, data7, null, null, null, null, null, null, false, 8183);
            case 25:
                Data data8 = this.f230598b;
                Intrinsics.h(data8);
                return pdg.m.a((pdg.m) obj2, null, data8, null, null, null, null, null, null, null, false, 8187);
            case 26:
                ((pf2.b) obj2).getClass();
                Data data9 = this.f230598b;
                Intrinsics.checkNotNullParameter(data9, "data");
                return new pf2.b(data9);
            case 27:
                pf4.e update = (pf4.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return pf4.e.a(update, null, this.f230598b, 5);
            case 28:
                pgb.i iVar2 = (pgb.i) obj2;
                List list = (List) this.f230598b.getContent();
                if (list == null) {
                    list = zhm.f0.f322471a;
                }
                return pgb.i.a(iVar2, null, list, false, 5);
            default:
                ((pi5.c) obj2).getClass();
                return new pi5.c(this.f230598b);
        }
    }
}
