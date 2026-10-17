package com.revolut.data.network.services;

import com.revolut.data.network.models.topup.CancelMultiCurrencyTransferResultDto;
import com.revolut.data.network.models.topup.DirectDebitTopupReviewDto;
import com.revolut.data.network.models.topup.McyAllowedTravelCountries;
import com.revolut.data.network.models.topup.McyBookTransactionRequest;
import com.revolut.data.network.models.topup.McyBookTransferResultDto;
import com.revolut.data.network.models.topup.McyTransferReviewDto;
import com.revolut.data.network.models.topup.TopupSourceDto;
import com.revolut.data.network.models.topup.qr.paynow.PayNowQrRequestDto;
import com.revolut.data.network.models.topup.qr.paynow.PayNowTopUpQrDto;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import sue.j;
import wj0.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\b\b\u0001\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u0004H'¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#H§@¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\b\u0001\u0010'\u001a\u00020&H§@¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\b\u0001\u0010'\u001a\u00020+H§@¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/TopupService;", "", "", "targetAmount", "", "targetCurrency", "", "prepareMcyTransferReview", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceCurrency", "", "declarations", "topUpMethod", "Lcom/revolut/data/network/models/topup/McyTransferReviewDto;", "getMcyTransferReview", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/data/network/models/topup/McyBookTransactionRequest;", "mcyBookTransactionRequest", "Lwj0/b;", "idempotencyTag", "Lefm/d0;", "Lcom/revolut/data/network/models/topup/McyBookTransferResultDto;", "bookTransfer", "(Lcom/revolut/data/network/models/topup/McyBookTransactionRequest;Lwj0/b;)Lefm/d0;", "Lokhttp3/ResponseBody;", "getDraftDeclarationForm", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lefm/d0;", "transactionId", "Lcom/revolut/data/network/models/topup/CancelMultiCurrencyTransferResultDto;", "cancelMultiCurrencyTransfer", "(Ljava/lang/String;)Lefm/d0;", "pocketId", "Lcom/revolut/data/network/models/topup/DirectDebitTopupReviewDto;", "getDirectDebitTopupReview", "(JLjava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/topup/McyAllowedTravelCountries;", "getAllowedTravelCountries", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/data/network/models/topup/qr/paynow/PayNowQrRequestDto;", "body", "Lcom/revolut/data/network/models/topup/qr/paynow/PayNowTopUpQrDto;", "getPayNowQr", "(Lcom/revolut/data/network/models/topup/qr/paynow/PayNowQrRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/data/network/models/topup/TopupSourceDto;", "Lsue/j;", "createTopupSource", "(Lcom/revolut/data/network/models/topup/TopupSourceDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TopupService {
    @POST("/topup/mcy-transfer")
    @NotNull
    d0<McyBookTransferResultDto> bookTransfer(@Body @NotNull McyBookTransactionRequest mcyBookTransactionRequest, @Tag b idempotencyTag);

    @POST("/topup/mcy-transfer/cancel/{transactionId}")
    @NotNull
    d0<CancelMultiCurrencyTransferResultDto> cancelMultiCurrencyTransfer(@Path("transactionId") @NotNull String transactionId);

    @POST("/topup/stored-methods")
    Object createTopupSource(@Body @NotNull TopupSourceDto topupSourceDto, @NotNull Continuation<? super j> continuation);

    @GET("/topup/mcy-transfer/allowed-travel-countries")
    Object getAllowedTravelCountries(@NotNull Continuation<? super McyAllowedTravelCountries> continuation);

    @GET("/topup/direct-debit/review")
    @NotNull
    d0<DirectDebitTopupReviewDto> getDirectDebitTopupReview(@Query("amount") long targetAmount, @NotNull @Query("currency") String targetCurrency, @NotNull @Query("fromPocket") String pocketId);

    @GET("/topup/mcy-transfer/draft-declaration-form")
    @NotNull
    d0<ResponseBody> getDraftDeclarationForm(@Query("topupAmount") long targetAmount, @NotNull @Query("topupCcy") String targetCurrency, @NotNull @Query("sourceCcy") String sourceCurrency, @NotNull @Query("declarations") List<String> declarations);

    @GET("/topup/mcy-transfer/review")
    Object getMcyTransferReview(@Query("topupAmount") long j2, @NotNull @Query("topupCcy") String str, @NotNull @Query("sourceCcy") String str2, @NotNull @Query("declarations") List<String> list, @Query("topupMethod") String str3, @NotNull Continuation<? super McyTransferReviewDto> continuation);

    @POST("/topup/qr-code/PAYNOW/encode")
    Object getPayNowQr(@Body @NotNull PayNowQrRequestDto payNowQrRequestDto, @NotNull Continuation<? super PayNowTopUpQrDto> continuation);

    @GET("/topup/mcy-transfer/review-preparation")
    Object prepareMcyTransferReview(@Query("topupAmount") long j2, @NotNull @Query("topupCcy") String str, @NotNull Continuation<? super Unit> continuation);
}
