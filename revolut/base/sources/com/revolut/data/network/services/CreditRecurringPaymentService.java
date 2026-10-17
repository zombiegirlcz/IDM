package com.revolut.data.network.services;

import com.revolut.data.network.models.credit.CreditRecurringPaymentsDto;
import com.revolut.data.network.models.credit.PayLaterUpcomingPaymentsDto;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \f2\u00020\u0001:\u0001\rJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0005J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/CreditRecurringPaymentService;", "", "Lefm/d0;", "Lcom/revolut/data/network/models/credit/CreditRecurringPaymentsDto;", "getCreditRecurringPayments", "()Lefm/d0;", "getLoanRecurringPayments", "", "limit", "Lcom/revolut/data/network/models/credit/PayLaterUpcomingPaymentsDto;", "getPayLaterRecurringPayments", "(I)Lefm/d0;", "Companion", "a", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditRecurringPaymentService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f60249a;

    /* JADX INFO: renamed from: com.revolut.data.network.services.CreditRecurringPaymentService$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f60249a = new Companion();

        private Companion() {
        }
    }

    @Headers({"X-Api-Version: v2"})
    @GET("/credit/recurring-payments")
    @NotNull
    d0<CreditRecurringPaymentsDto> getCreditRecurringPayments();

    @Headers({"X-Api-Version: v2"})
    @GET("/loan-management/recurring-payments")
    @NotNull
    d0<CreditRecurringPaymentsDto> getLoanRecurringPayments();

    @Headers({"X-Api-Version: v2"})
    @GET("/paylater/v2/upcoming-payments")
    @NotNull
    d0<PayLaterUpcomingPaymentsDto> getPayLaterRecurringPayments(@Query("limit") int limit);
}
