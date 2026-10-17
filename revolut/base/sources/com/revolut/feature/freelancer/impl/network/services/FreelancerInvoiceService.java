package com.revolut.feature.freelancer.impl.network.services;

import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import qt6.b;
import qt6.f;
import qt6.h;
import qt6.l;
import qt6.m;
import qt6.n;
import qt6.o;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0003H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0019H'¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u0003H'¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0003H'¢\u0006\u0004\b!\u0010\u0013J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0003H'¢\u0006\u0004\b\"\u0010\u0013J\u001a\u0010#\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0003H§@¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0003H'¢\u0006\u0004\b%\u0010\u0013J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0003H'¢\u0006\u0004\b&\u0010\u0013J\u0019\u0010(\u001a\u00020'2\b\b\u0001\u0010\u0011\u001a\u00020\u0003H'¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00060\u0005H'¢\u0006\u0004\b+\u0010\fJ\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u00052\b\b\u0001\u0010\u000e\u001a\u00020,H'¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0003H'¢\u0006\u0004\b0\u0010\u0013J\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020/0\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0003H'¢\u0006\u0004\b1\u0010\u0013J%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0003H'¢\u0006\u0004\b2\u0010\u0013¨\u00063À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerInvoiceService;", "", "", "", "parameters", "Lefm/d0;", "", "Lqt6/b;", "getInvoices", "(Ljava/util/Map;)Lefm/d0;", "Lqt6/f;", "getInvoiceSettings", "()Lefm/d0;", "Lqt6/h;", "payload", "updateInvoiceSettings", "(Lqt6/h;)Lefm/d0;", "invoiceId", "getInvoice", "(Ljava/lang/String;)Lefm/d0;", "Lqt6/n;", "createInvoice", "(Lqt6/n;)Lefm/d0;", "updateInvoice", "(Ljava/lang/String;Lqt6/n;)Lefm/d0;", "Lqt6/o;", "addItemToInvoice", "(Ljava/lang/String;Lqt6/o;)Lefm/d0;", "itemId", "updateItemInInvoice", "(Ljava/lang/String;Ljava/lang/String;Lqt6/o;)Lefm/d0;", "deleteItemFromInvoice", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "sendInvoice", "resendInvoice", "scheduleInvoice", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markInvoiceAsPaid", "cancelInvoice", "Lefm/b;", "deleteInvoice", "(Ljava/lang/String;)Lefm/b;", "Lqt6/l;", "getTaxRates", "Lqt6/m;", "createTaxRate", "(Lqt6/m;)Lefm/d0;", "Lokhttp3/ResponseBody;", "getInvoicePdf", "getInvoiceEmailHtml", "getRecurringHistory", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerInvoiceService {
    @POST("/acquiring/merchant/invoices/{invoiceId}/invoice-items")
    @NotNull
    d0<b> addItemToInvoice(@Path("invoiceId") @NotNull String invoiceId, @Body @NotNull o payload);

    @POST("/acquiring/merchant/invoices/{invoiceId}/cancel")
    @NotNull
    d0<b> cancelInvoice(@Path("invoiceId") @NotNull String invoiceId);

    @POST("/acquiring/merchant/invoices")
    @NotNull
    d0<b> createInvoice(@Body @NotNull n payload);

    @POST("/acquiring/merchant/invoices/tax-rates")
    @NotNull
    d0<l> createTaxRate(@Body @NotNull m payload);

    @DELETE("/acquiring/merchant/invoices/{invoiceId}")
    @NotNull
    efm.b deleteInvoice(@Path("invoiceId") @NotNull String invoiceId);

    @DELETE("/acquiring/merchant/invoices/{invoiceId}/invoice-items/{itemId}")
    @NotNull
    d0<b> deleteItemFromInvoice(@Path("invoiceId") @NotNull String invoiceId, @Path("itemId") @NotNull String itemId);

    @GET("/acquiring/merchant/invoices/{invoiceId}")
    @NotNull
    d0<b> getInvoice(@Path("invoiceId") @NotNull String invoiceId);

    @GET("/acquiring/merchant/invoices/{invoiceId}/email")
    @NotNull
    d0<ResponseBody> getInvoiceEmailHtml(@Path("invoiceId") @NotNull String invoiceId);

    @GET("/acquiring/merchant/invoices/{invoiceId}/document/pdf")
    @NotNull
    d0<ResponseBody> getInvoicePdf(@Path("invoiceId") @NotNull String invoiceId);

    @GET("/acquiring/merchant/invoice-settings")
    @NotNull
    d0<f> getInvoiceSettings();

    @GET("/acquiring/merchant/invoices")
    @NotNull
    d0<List<b>> getInvoices(@QueryMap @NotNull Map<String, String> parameters);

    @GET("/acquiring/merchant/invoices/recurring/{invoiceId}/history")
    @NotNull
    d0<List<b>> getRecurringHistory(@Path("invoiceId") @NotNull String invoiceId);

    @GET("/acquiring/merchant/invoices/tax-rates")
    @NotNull
    d0<List<l>> getTaxRates();

    @POST("/acquiring/merchant/invoices/{invoiceId}/mark-paid")
    @NotNull
    d0<b> markInvoiceAsPaid(@Path("invoiceId") @NotNull String invoiceId);

    @POST("/acquiring/merchant/invoices/{invoiceId}/resend")
    @NotNull
    d0<b> resendInvoice(@Path("invoiceId") @NotNull String invoiceId);

    @POST("/acquiring/merchant/invoices/recurring/{invoiceId}/activate")
    Object scheduleInvoice(@Path("invoiceId") @NotNull String str, @NotNull Continuation<? super b> continuation);

    @POST("/acquiring/merchant/invoices/{invoiceId}/send")
    @NotNull
    d0<b> sendInvoice(@Path("invoiceId") @NotNull String invoiceId);

    @PUT("/acquiring/merchant/invoices/{invoiceId}")
    @NotNull
    d0<b> updateInvoice(@Path("invoiceId") @NotNull String invoiceId, @Body @NotNull n payload);

    @PUT("/acquiring/merchant/invoice-settings")
    @NotNull
    d0<f> updateInvoiceSettings(@Body @NotNull h payload);

    @PUT("/acquiring/merchant/invoices/{invoiceId}/invoice-items/{itemId}")
    @NotNull
    d0<b> updateItemInInvoice(@Path("invoiceId") @NotNull String invoiceId, @Path("itemId") @NotNull String itemId, @Body @NotNull o payload);
}
