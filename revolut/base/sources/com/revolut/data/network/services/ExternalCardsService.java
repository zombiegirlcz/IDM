package com.revolut.data.network.services;

import com.revolut.data.network.models.checkout.PaymentMethodResponseDto;
import com.revolut.data.network.models.externalcards.CardConfirmationRequestDto;
import com.revolut.data.network.models.externalcards.ChangeBillingAddressRequestDto;
import com.revolut.data.network.models.externalcards.ExternalCardAddRequestDto;
import com.revolut.data.network.models.externalcards.ExternalCardDto;
import com.revolut.data.network.models.externalcards.FirstCardTopupRequestDto;
import com.revolut.data.network.models.externalcards.IssuerInfoDto;
import com.revolut.data.network.models.externalcards.TopUpAlternativeRequestDto;
import com.revolut.data.network.models.externalcards.TopUpRequestDto;
import com.revolut.data.network.models.externalcards.VerificationMethodsDto;
import com.revolut.data.network.models.ideal.IdealIssuersDto;
import com.revolut.data.network.models.topup.CardTopupFeeDto;
import efm.b;
import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import oue.c;
import oue.d;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Tag;
import xze.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0003\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0003\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00192\b\b\u0003\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010#\u001a\u00020\"2\b\b\u0001\u0010 \u001a\u00020\u001f2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010(\u001a\u00020\u001f2\b\b\u0001\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0\u0006H'¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010(\u001a\u00020\u001fH'¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\"2\b\b\u0001\u0010(\u001a\u00020\u001fH'¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00062\b\b\u0001\u00103\u001a\u00020\u001fH'¢\u0006\u0004\b5\u00100J#\u00107\u001a\u00020\"2\b\b\u0001\u0010(\u001a\u00020\u001f2\b\b\u0001\u0010\u0003\u001a\u000206H'¢\u0006\u0004\b7\u00108J?\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00062\u0014\b\u0001\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f092\b\b\u0001\u0010;\u001a\u00020\u001f2\b\b\u0001\u0010=\u001a\u00020<H'¢\u0006\u0004\b?\u0010@J3\u0010B\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010A\u001a\u00020\u001f2\b\b\u0001\u0010;\u001a\u00020\u001f2\b\b\u0001\u0010=\u001a\u00020<H'¢\u0006\u0004\bB\u0010CJ#\u0010E\u001a\u00020\"2\b\b\u0001\u0010(\u001a\u00020\u001f2\b\b\u0001\u0010\u0003\u001a\u00020DH'¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u0006H'¢\u0006\u0004\bH\u0010.J\u001f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00062\b\b\u0001\u0010(\u001a\u00020\u001fH'¢\u0006\u0004\bJ\u00100¨\u0006KÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/ExternalCardsService;", "", "Lcom/revolut/data/network/models/externalcards/TopUpRequestDto;", "body", "Lwj0/b;", "idempotencyTag", "Lefm/d0;", "Lcom/revolut/data/network/models/checkout/PaymentMethodResponseDto;", "requestTopUp", "(Lcom/revolut/data/network/models/externalcards/TopUpRequestDto;Lwj0/b;)Lefm/d0;", "Lxze/b;", "Lxze/c;", "requestGooglePayTopUp", "(Lxze/b;Lwj0/b;)Lefm/d0;", "Lxze/a;", "requestGooglePayFee", "(Lxze/b;)Lefm/d0;", "Loue/d;", "Loue/b;", "createGooglePayCard", "(Loue/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/data/network/models/externalcards/TopUpAlternativeRequestDto;", "requestDto", "requestAlternativeTopup", "(Lcom/revolut/data/network/models/externalcards/TopUpAlternativeRequestDto;Lwj0/b;)Lefm/d0;", "Lcom/revolut/data/network/models/externalcards/FirstCardTopupRequestDto;", "requestFirstCardTopup", "(Lcom/revolut/data/network/models/externalcards/FirstCardTopupRequestDto;Lwj0/b;)Lefm/d0;", "Loue/c;", "createExternalCard", "(Loue/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "transactionId", "walletId", "Lefm/b;", "checkPaymentStatus", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "Lcom/revolut/data/network/models/externalcards/ExternalCardAddRequestDto;", "requestAddExternalCard", "(Lcom/revolut/data/network/models/externalcards/ExternalCardAddRequestDto;)Lefm/d0;", "cardId", "requestUpdateExternalCard", "(Ljava/lang/String;Lcom/revolut/data/network/models/externalcards/ExternalCardAddRequestDto;)Lefm/d0;", "", "Lcom/revolut/data/network/models/externalcards/ExternalCardDto;", "getExternalCards", "()Lefm/d0;", "getExternalCardById", "(Ljava/lang/String;)Lefm/d0;", "removeCard", "(Ljava/lang/String;)Lefm/b;", "bin", "Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;", "getIssuer", "Lcom/revolut/data/network/models/externalcards/CardConfirmationRequestDto;", "confirmCard", "(Ljava/lang/String;Lcom/revolut/data/network/models/externalcards/CardConfirmationRequestDto;)Lefm/b;", "", "cardIds", "currency", "", "amount", "Lcom/revolut/data/network/models/topup/CardTopupFeeDto;", "getTopUpByCardFee", "(Ljava/util/Map;Ljava/lang/String;J)Lefm/d0;", "firstNineDigits", "getFirstCardTopupFee", "(Ljava/lang/String;Ljava/lang/String;J)Lefm/d0;", "Lcom/revolut/data/network/models/externalcards/ChangeBillingAddressRequestDto;", "changeBillingAddress", "(Ljava/lang/String;Lcom/revolut/data/network/models/externalcards/ChangeBillingAddressRequestDto;)Lefm/b;", "Lcom/revolut/data/network/models/ideal/IdealIssuersDto;", "getIdealIssuer", "Lcom/revolut/data/network/models/externalcards/VerificationMethodsDto;", "getCardVerificationMethods", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExternalCardsService {
    @PATCH("card/{id}")
    @NotNull
    b changeBillingAddress(@Path("id") @NotNull String cardId, @Body @NotNull ChangeBillingAddressRequestDto body);

    @GET("topup/{transactionId}/status")
    @NotNull
    b checkPaymentStatus(@Path("transactionId") @NotNull String transactionId, @Query("walletId") String walletId);

    @POST("card/{id}/confirm")
    @NotNull
    b confirmCard(@Path("id") @NotNull String cardId, @Body @NotNull CardConfirmationRequestDto body);

    @POST("/card")
    Object createExternalCard(@Body @NotNull c cVar, @NotNull Continuation<? super oue.b> continuation);

    @POST("card/google-pay")
    Object createGooglePayCard(@Body @NotNull d dVar, @NotNull Continuation<? super oue.b> continuation);

    @GET("card/{id}/verifications")
    @NotNull
    d0<VerificationMethodsDto> getCardVerificationMethods(@Path("id") @NotNull String cardId);

    @GET("card/{cardId}")
    @NotNull
    d0<ExternalCardDto> getExternalCardById(@Path("cardId") @NotNull String cardId);

    @GET("user/current/cards")
    @NotNull
    d0<List<ExternalCardDto>> getExternalCards();

    @GET("topup/fee")
    @NotNull
    d0<CardTopupFeeDto> getFirstCardTopupFee(@NotNull @Query("externalCardIssuerId") String firstNineDigits, @NotNull @Query("currency") String currency, @Query("amount") long amount);

    @GET("topup/ideal/issuers")
    @NotNull
    d0<IdealIssuersDto> getIdealIssuer();

    @GET("card-issuer/{BIN}/info")
    @NotNull
    d0<IssuerInfoDto> getIssuer(@Path("BIN") @NotNull String bin);

    @GET("topup/fee")
    @NotNull
    d0<CardTopupFeeDto> getTopUpByCardFee(@QueryMap @NotNull Map<String, String> cardIds, @NotNull @Query("currency") String currency, @Query("amount") long amount);

    @DELETE("card/{id}")
    @NotNull
    b removeCard(@Path("id") @NotNull String cardId);

    @POST("card/auth")
    @NotNull
    d0<PaymentMethodResponseDto> requestAddExternalCard(@Body @NotNull ExternalCardAddRequestDto body);

    @POST("topup/alternative")
    @NotNull
    d0<PaymentMethodResponseDto> requestAlternativeTopup(@Body @NotNull TopUpAlternativeRequestDto requestDto, @Tag @NotNull wj0.b idempotencyTag);

    @POST("/topup/first-card-topup")
    @NotNull
    d0<PaymentMethodResponseDto> requestFirstCardTopup(@Body @NotNull FirstCardTopupRequestDto body, @Tag @NotNull wj0.b idempotencyTag);

    @POST("topup/google-pay/fee-info")
    @NotNull
    d0<a> requestGooglePayFee(@Body @NotNull xze.b body);

    @POST("topup/google-pay")
    @NotNull
    d0<xze.c> requestGooglePayTopUp(@Body @NotNull xze.b body, @Tag @NotNull wj0.b idempotencyTag);

    @POST("topup/create")
    @NotNull
    d0<PaymentMethodResponseDto> requestTopUp(@Body @NotNull TopUpRequestDto body, @Tag @NotNull wj0.b idempotencyTag);

    @POST("card/{cardId}/replace")
    @NotNull
    d0<PaymentMethodResponseDto> requestUpdateExternalCard(@Path("cardId") @NotNull String cardId, @Body @NotNull ExternalCardAddRequestDto body);
}
