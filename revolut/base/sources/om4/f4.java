package om4;

import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class f4 {

    @NotNull
    public static final d4 Companion = new d4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.q f226578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g9e.a f226579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.b f226580c;
    public final h9e.h d;

    public f4(al4.q creditCardProductInteractor, g9e.a subscriptionListPresentationModel, whf.b transactionContentProvider, h9e.h upcomingPaymentsInteractor) {
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(subscriptionListPresentationModel, "subscriptionListPresentationModel");
        Intrinsics.checkNotNullParameter(transactionContentProvider, "transactionContentProvider");
        Intrinsics.checkNotNullParameter(upcomingPaymentsInteractor, "upcomingPaymentsInteractor");
        this.f226578a = creditCardProductInteractor;
        this.f226579b = subscriptionListPresentationModel;
        this.f226580c = transactionContentProvider;
        this.d = upcomingPaymentsInteractor;
    }

    public static RecurringPaymentFilter.And a(String str, String str2, vl4.g gVar) {
        RecurringPaymentFilter.ByNextDateFromNow byNextDateFromNow = new RecurringPaymentFilter.ByNextDateFromNow(7);
        RecurringPaymentFilter.BySourcePocketId bySourcePocketId = new RecurringPaymentFilter.BySourcePocketId(str2);
        RecurringPaymentFilter.ByNextDateGreaterOrEqualThan byNextDateGreaterOrEqualThan = new RecurringPaymentFilter.ByNextDateGreaterOrEqualThan(gVar.f290249b);
        LocalDate localDate = gVar.f290250c;
        return new RecurringPaymentFilter.And(byNextDateFromNow, new RecurringPaymentFilter.Or(new RecurringPaymentFilter.And(bySourcePocketId, byNextDateGreaterOrEqualThan, new RecurringPaymentFilter.ByNextDateLessOrEqualThan(localDate)), new RecurringPaymentFilter.And(new RecurringPaymentFilter.ByReceiverId(zhm.y0.b(str)), new RecurringPaymentFilter.ByNextDateGreaterOrEqualThan(localDate), new RecurringPaymentFilter.ByNextDateLessOrEqualThan(gVar.d))));
    }
}
