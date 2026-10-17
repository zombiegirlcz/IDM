package com.revolut.feature.acquiring.card_reader.data.impl.data.network;

import efm.b;
import efm.d0;
import ga1.c;
import ga1.d;
import ga1.f;
import ga1.g;
import ga1.h;
import ga1.j;
import ga1.k;
import ga1.l;
import ga1.m;
import ga1.n;
import ga1.o;
import ga1.p;
import ga1.s;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0012\u001a\u00020\fH'¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u0015\u0010\u0011J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\fH'¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\fH'¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00162\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u001cH'¢\u0006\u0004\b \u0010\u001fJ)\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b%\u0010$J)\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020&H'¢\u0006\u0004\b(\u0010)J)\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020&H'¢\u0006\u0004\b*\u0010)J)\u0010+\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020&H'¢\u0006\u0004\b+\u0010)J#\u0010-\u001a\u00020\u00162\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020,H'¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020/H'¢\u0006\u0004\b0\u00101¨\u00062À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/data/impl/data/network/CardReaderService;", "", "Lga1/k;", "body", "Lefm/d0;", "Lga1/l;", "pairTerminal", "(Lga1/k;)Lefm/d0;", "Lga1/b;", "Lga1/c;", "createOrder", "(Lga1/b;)Lefm/d0;", "", "orderId", "Lga1/o;", "Lga1/p;", "authorizePayment", "(Ljava/lang/String;Lga1/o;)Lefm/d0;", "paymentId", "getPaymentAuthorization", "(Ljava/lang/String;)Lefm/d0;", "authenticatePayment", "Lefm/b;", "captureTransaction", "(Ljava/lang/String;)Lefm/b;", "cancelTransaction", "cancelOrder", "terminalId", "Lga1/f;", "Lga1/d;", "getSvppFirmwareUpdate", "(Ljava/lang/String;Lga1/f;)Lefm/d0;", "getBluetoothFirmwareUpdate", "Lga1/g;", "Lga1/h;", "getDekUpdate", "(Ljava/lang/String;Lga1/g;)Lefm/d0;", "getPekUpdate", "Lga1/m;", "Lga1/n;", "getContactParamsUpdate", "(Ljava/lang/String;Lga1/m;)Lefm/d0;", "getContactlessParamsUpdate", "getTerminalParams", "Lga1/s;", "confirmUpdates", "(Ljava/lang/String;Lga1/s;)Lefm/b;", "Lga1/j;", "sendLogs", "(Lga1/j;)Lefm/b;", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardReaderService {
    @POST("api/payments/{paymentId}/authenticate")
    @NotNull
    d0<p> authenticatePayment(@Path("paymentId") @NotNull String paymentId, @Body @NotNull o body);

    @POST("api/orders/{orderId}/payments")
    @NotNull
    d0<p> authorizePayment(@Path("orderId") @NotNull String orderId, @Body @NotNull o body);

    @POST("api/orders/{orderId}/cancel")
    @NotNull
    b cancelOrder(@Path("orderId") @NotNull String orderId);

    @POST("api/payments/{paymentId}/cancel")
    @NotNull
    b cancelTransaction(@Path("paymentId") @NotNull String paymentId);

    @POST("api/payments/{paymentId}/capture")
    @NotNull
    b captureTransaction(@Path("paymentId") @NotNull String paymentId);

    @POST("api/terminals/{terminalId}/updates/confirm")
    @NotNull
    b confirmUpdates(@Path("terminalId") @NotNull String terminalId, @Body @NotNull s body);

    @POST("api/orders")
    @NotNull
    d0<c> createOrder(@Body @NotNull ga1.b body);

    @POST("api/terminals/{terminalId}/updates/bluetooth-firmware")
    @NotNull
    d0<d> getBluetoothFirmwareUpdate(@Path("terminalId") @NotNull String terminalId, @Body @NotNull f body);

    @POST("api/terminals/{terminalId}/updates/contact-params")
    @NotNull
    d0<n> getContactParamsUpdate(@Path("terminalId") @NotNull String terminalId, @Body @NotNull m body);

    @POST("api/terminals/{terminalId}/updates/contactless-params")
    @NotNull
    d0<n> getContactlessParamsUpdate(@Path("terminalId") @NotNull String terminalId, @Body @NotNull m body);

    @POST("api/terminals/{terminalId}/updates/dek")
    @NotNull
    d0<h> getDekUpdate(@Path("terminalId") @NotNull String terminalId, @Body @NotNull g body);

    @GET("api/payments/{paymentId}")
    @NotNull
    d0<p> getPaymentAuthorization(@Path("paymentId") @NotNull String paymentId);

    @POST("api/terminals/{terminalId}/updates/pek")
    @NotNull
    d0<h> getPekUpdate(@Path("terminalId") @NotNull String terminalId, @Body @NotNull g body);

    @POST("api/terminals/{terminalId}/updates/svpp-firmware")
    @NotNull
    d0<d> getSvppFirmwareUpdate(@Path("terminalId") @NotNull String terminalId, @Body @NotNull f body);

    @POST("api/terminals/{terminalId}/updates/terminal-params")
    @NotNull
    d0<n> getTerminalParams(@Path("terminalId") @NotNull String terminalId, @Body @NotNull m body);

    @POST("api/terminals")
    @NotNull
    d0<l> pairTerminal(@Body @NotNull k body);

    @POST("api/terminal-logs")
    @NotNull
    b sendLogs(@Body @NotNull j body);
}
