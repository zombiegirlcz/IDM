package de6;

import aii.q;
import c69.l;
import com.revolut.feature.apm.bills.pagopa.api.navigation.PagoPAFeatureConfig;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileFeatureConfig;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import dki.g;
import eii.i;
import eii.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f113299b;

    public /* synthetic */ b(g gVar, int i) {
        this.f113298a = i;
        this.f113299b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f113298a;
        g gVar = this.f113299b;
        switch (i) {
            case 0:
                q it8 = (q) obj2;
                int i2 = c.f113300a;
                Intrinsics.checkNotNullParameter(it8, "it");
                gVar.I2();
                break;
            case 1:
                q it9 = (q) obj2;
                int i3 = ova.a.f230011a;
                Intrinsics.checkNotNullParameter(it9, "it");
                gVar.I2();
                break;
            case 2:
                k it10 = (k) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (it10 instanceof i) {
                    Object obj3 = ((i) it10).f126655a;
                    if (obj3 == zq1.a.QR) {
                        knm.b.j(gVar.l1(), u0.c(new PaymentProfileFeatureConfig(ew9.a.QR_SCANNER)));
                    } else if (obj3 == zq1.a.MANUAL) {
                        knm.b.j(gVar.l1(), u0.c(PagoPAFeatureConfig.BillManualInput.f61481g));
                    }
                }
                break;
            case 3:
                q it11 = (q) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                gVar.F1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                gVar.I2();
                break;
            case 4:
                l result = (l) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                u59.a.a(gVar, result);
                break;
            case 5:
                l result2 = (l) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                u59.a.a(gVar, result2);
                break;
            case 6:
                q it12 = (q) obj2;
                int i5 = w67.a.f295406a;
                Intrinsics.checkNotNullParameter(it12, "it");
                gVar.F1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                gVar.I2();
                break;
            default:
                q it13 = (q) obj2;
                int i6 = w67.a.f295406a;
                Intrinsics.checkNotNullParameter(it13, "it");
                gVar.F1(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3));
                gVar.I2();
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ b(ohi.a aVar, g gVar, int i) {
        this.f113298a = i;
        this.f113299b = gVar;
    }
}
