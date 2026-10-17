package com.revolut.shared.feature.payments.money_request.domain.impl.data.network;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import z8l.a;
import z8l.c;
import z8l.h;
import z8l.i;
import z8l.j;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001a2\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u001a2\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u001f\u0010\u001e¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/payments/money_request/domain/impl/data/network/MoneyRequestService;", "", "", "from", "Lefm/d0;", "", "Lz8l/i;", "getRequests", "(J)Lefm/d0;", "", "id", "getMoneyRequestById", "(Ljava/lang/String;)Lefm/d0;", "Lz8l/c;", "request", "requestMoney", "(Lz8l/c;)Lefm/d0;", "Lz8l/a;", "moneyRequestAcceptDto", "Lwj0/b;", "idempotencyTag", "Lz8l/h;", "payRequestById", "(Ljava/lang/String;Lz8l/a;Lwj0/b;)Lefm/d0;", "Lz8l/j;", "body", "Lefm/b;", "rejectWithReason", "(Ljava/lang/String;Lz8l/j;)Lefm/b;", "remindRequest", "(Ljava/lang/String;)Lefm/b;", "cancelRequest", "feature_shared_payments_money_request_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MoneyRequestService {
    @DELETE("money-request/{id}")
    @NotNull
    b cancelRequest(@Path("id") @NotNull String id10);

    @Headers({"X-Unified-Money-Request-Response: true"})
    @GET("money-request/{id}")
    @NotNull
    d0<i> getMoneyRequestById(@Path("id") @NotNull String id10);

    @Headers({"X-Unified-Money-Request-Response: true"})
    @GET("money-request")
    @NotNull
    d0<List<i>> getRequests(@Query("from") long from);

    @POST("money-request/{id}/accept")
    @NotNull
    d0<List<h>> payRequestById(@Path("id") @NotNull String id10, @Body @NotNull a moneyRequestAcceptDto, @Tag @NotNull wj0.b idempotencyTag);

    @POST("money-request/{id}/reject")
    @NotNull
    b rejectWithReason(@Path("id") @NotNull String id10, @Body @NotNull j body);

    @POST("money-request/{id}/remind")
    @NotNull
    b remindRequest(@Path("id") @NotNull String id10);

    @Headers({"X-Unified-Money-Request-Response: true"})
    @POST("money-request")
    @NotNull
    d0<i> requestMoney(@Body @NotNull c request);
}
