package mek;

import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import java.time.LocalDate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f204713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f204714c;

    public /* synthetic */ l(int i, LocalDate localDate, LocalDate localDate2) {
        this.f204712a = i;
        this.f204713b = localDate;
        this.f204714c = localDate2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LocalDate localDate;
        LocalDate localDate2;
        switch (this.f204712a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                LocalDate localDate3 = this.f204713b;
                if (localDate3 != null) {
                    LocalDate localDate4 = this.f204714c;
                    Intrinsics.h(localDate4);
                    localDate = (LocalDate) kotlin.ranges.f.c(localDate3, localDate4);
                } else {
                    localDate = null;
                }
                return g.a(update, null, null, null, null, localDate, false, null, 239);
            case 1:
                LocalDate month = (LocalDate) obj2;
                Intrinsics.checkNotNullParameter(month, "month");
                LocalDate localDateWithDayOfMonth = month.withDayOfMonth(1);
                LocalDate localDate5 = this.f204713b;
                if (localDateWithDayOfMonth.isBefore(localDate5)) {
                    localDateWithDayOfMonth = localDate5;
                }
                LocalDate localDateO = oc.c.O(oc.c.O(month));
                LocalDate localDate6 = this.f204714c;
                if (localDateO.isAfter(localDate6)) {
                    localDateO = localDate6;
                }
                return new TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period(localDateWithDayOfMonth, localDateO);
            default:
                yo7.h updateState = (yo7.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                LocalDate localDate7 = this.f204713b;
                if (localDate7 != null) {
                    LocalDate localDate8 = this.f204714c;
                    Intrinsics.h(localDate8);
                    localDate2 = (LocalDate) kotlin.ranges.f.c(localDate7, localDate8);
                } else {
                    localDate2 = null;
                }
                return yo7.h.a(updateState, null, null, localDate2, null, null, null, null, null, null, null, null, null, null, 16375);
        }
    }

    public /* synthetic */ l(o47.b bVar, LocalDate localDate, LocalDate localDate2) {
        this.f204712a = 1;
        this.f204713b = localDate;
        this.f204714c = localDate2;
    }
}
