package com.revolut.data.network.services;

import com.revolut.data.network.models.recurringpayment.ActivateCardMandateRequest;
import com.revolut.data.network.models.recurringpayment.ActivateManualCardMandateRequest;
import com.revolut.data.network.models.recurringpayment.ActivateSubscriptionRequest;
import com.revolut.data.network.models.recurringpayment.AffectedSubscriptionsDto;
import com.revolut.data.network.models.recurringpayment.BlockUnblockSubscriptionRequest;
import com.revolut.data.network.models.recurringpayment.CardMandateUpdateLabelRequest;
import com.revolut.data.network.models.recurringpayment.RecurringPaymentListDto;
import com.revolut.data.network.models.recurringpayment.UpdateCardMandateFrequencyRequest;
import com.revolut.data.network.models.recurringpayment.UpdateManualCardMandateFrequencyRequest;
import com.revolut.data.network.models.recurringpayment.UpdateSubscriptionFrequencyRequest;
import com.revolut.data.network.models.recurringpayment.WalletAutomationRequestDto;
import efm.b;
import efm.d0;
import kotlin.Metadata;
import o9l.r;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u00020\u000e2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0018\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0017H'¢\u0006\u0004\b\u001a\u0010\u0019J5\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u001c2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u001f2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b \u0010!J5\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\"2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b#\u0010$J7\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b%\u0010&J9\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00052\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b*\u0010&J)\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u00020+2\b\b\u0001\u0010-\u001a\u00020,H'¢\u0006\u0004\b.\u0010/J)\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u0002002\b\b\u0001\u0010-\u001a\u00020,H'¢\u0006\u0004\b1\u00102J)\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020+H'¢\u0006\u0004\b3\u00104J)\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u000200H'¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b9\u00108J+\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u00020:2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b=\u0010\u0014J5\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020>2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b?\u0010@¨\u0006AÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/RecurringPaymentService;", "", "", "walletId", "enabledExperiments", "Lefm/d0;", "Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentListDto;", "getRecurringPayments", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/recurringpayment/ActivateCardMandateRequest;", "request", "Lo9l/r;", "postCardMandateActivation", "(Lcom/revolut/data/network/models/recurringpayment/ActivateCardMandateRequest;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/recurringpayment/ActivateManualCardMandateRequest;", "postManualCardMandateActivation", "(Lcom/revolut/data/network/models/recurringpayment/ActivateManualCardMandateRequest;Ljava/lang/String;)Lefm/d0;", "id", "Lefm/b;", "deleteCardMandate", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "deleteManualCardMandate", "subscriptionId", "Lcom/revolut/data/network/models/recurringpayment/BlockUnblockSubscriptionRequest;", "blockSubscription", "(Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/BlockUnblockSubscriptionRequest;)Lefm/b;", "unblockSubscription", "cardMandateId", "Lcom/revolut/data/network/models/recurringpayment/UpdateManualCardMandateFrequencyRequest;", "updateManualCardMandateFrequency", "(Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/UpdateManualCardMandateFrequencyRequest;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/recurringpayment/UpdateCardMandateFrequencyRequest;", "updateCardMandateFrequency", "(Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/UpdateCardMandateFrequencyRequest;Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/data/network/models/recurringpayment/CardMandateUpdateLabelRequest;", "updateCardMandateLabel", "(Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/CardMandateUpdateLabelRequest;Ljava/lang/String;)Lefm/d0;", "deleteCardMandateLabel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "transactionId", "merchantId", "Lcom/revolut/data/network/models/recurringpayment/AffectedSubscriptionsDto;", "getSubscriptionsAffectedByBlockOfTransactionOrMerchantOrSubscription", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$DropsBelowDto;", "Lwj0/b;", "idempotencyTag", "postWalletAutomationDropsBelow", "(Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$DropsBelowDto;Lwj0/b;)Lefm/d0;", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$ExceedsDto;", "postWalletAutomationExceeds", "(Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$ExceedsDto;Lwj0/b;)Lefm/d0;", "putWalletAutomationDropsBelow", "(Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$DropsBelowDto;)Lefm/d0;", "putWalletAutomationExceeds", "(Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$ExceedsDto;)Lefm/d0;", "activateWalletAutomation", "(Ljava/lang/String;)Lefm/d0;", "deactivateWalletAutomation", "Lcom/revolut/data/network/models/recurringpayment/ActivateSubscriptionRequest;", "activateSubscription", "(Lcom/revolut/data/network/models/recurringpayment/ActivateSubscriptionRequest;Ljava/lang/String;)Lefm/d0;", "deleteSubscription", "Lcom/revolut/data/network/models/recurringpayment/UpdateSubscriptionFrequencyRequest;", "updateSubscriptionFrequency", "(Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/UpdateSubscriptionFrequencyRequest;Ljava/lang/String;)Lefm/d0;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecurringPaymentService {
    static /* synthetic */ d0 a(RecurringPaymentService recurringPaymentService, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return recurringPaymentService.getSubscriptionsAffectedByBlockOfTransactionOrMerchantOrSubscription(str, str2, str3);
    }

    @Headers({"X-Api-Version: v2"})
    @POST("/recurring-payments/subscriptions")
    @NotNull
    d0<r> activateSubscription(@Body @NotNull ActivateSubscriptionRequest request, @Header("X-Enabled-Experiments") String enabledExperiments);

    @Headers({"X-Api-Version: v2"})
    @POST("/wallet-automations/{id}/activation")
    @NotNull
    d0<r> activateWalletAutomation(@Path("id") @NotNull String id10);

    @POST("/recurring-payments/subscriptions/{id}/block")
    @NotNull
    b blockSubscription(@Path("id") @NotNull String subscriptionId, @Body @NotNull BlockUnblockSubscriptionRequest request);

    @Headers({"X-Api-Version: v2"})
    @POST("/wallet-automations/{id}/deactivation")
    @NotNull
    d0<r> deactivateWalletAutomation(@Path("id") @NotNull String id10);

    @DELETE("/recurring-payments/card-mandates/{id}")
    @NotNull
    b deleteCardMandate(@Path("id") @NotNull String id10, @Query("walletId") String walletId);

    @DELETE("/recurring-payments/card-mandates/{id}/label")
    @Headers({"X-Api-Version: v2"})
    @NotNull
    d0<r> deleteCardMandateLabel(@Path("id") @NotNull String id10, @Query("walletId") String walletId, @Header("X-Enabled-Experiments") String enabledExperiments);

    @DELETE("/recurring-payments/manual-card-mandates/{id}")
    @NotNull
    b deleteManualCardMandate(@Path("id") @NotNull String id10, @Query("walletId") String walletId);

    @DELETE("/recurring-payments/subscriptions/{id}")
    @NotNull
    b deleteSubscription(@Path("id") @NotNull String subscriptionId, @Query("walletId") String walletId);

    @Headers({"X-Api-Version: v2"})
    @GET("/recurring-payments")
    @NotNull
    d0<RecurringPaymentListDto> getRecurringPayments(@Query("walletId") String walletId, @Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("/recurring-payments/subscriptions/affected-by-block")
    @NotNull
    d0<AffectedSubscriptionsDto> getSubscriptionsAffectedByBlockOfTransactionOrMerchantOrSubscription(@Query("transactionId") String transactionId, @Query("blockedMerchantId") String merchantId, @Query("subscriptionId") String subscriptionId);

    @Headers({"X-Api-Version: v2"})
    @POST("/recurring-payments/card-mandates")
    @NotNull
    d0<r> postCardMandateActivation(@Body @NotNull ActivateCardMandateRequest request, @Header("X-Enabled-Experiments") String enabledExperiments);

    @Headers({"X-Api-Version: v2"})
    @POST("/recurring-payments/manual-card-mandates")
    @NotNull
    d0<r> postManualCardMandateActivation(@Body @NotNull ActivateManualCardMandateRequest request, @Header("X-Enabled-Experiments") String enabledExperiments);

    @Headers({"X-Api-Version: v2"})
    @POST("/wallet-automations/low-balance")
    @NotNull
    d0<r> postWalletAutomationDropsBelow(@Body @NotNull WalletAutomationRequestDto.DropsBelowDto request, @Tag @NotNull wj0.b idempotencyTag);

    @Headers({"X-Api-Version: v2"})
    @POST("/wallet-automations/excess-balance")
    @NotNull
    d0<r> postWalletAutomationExceeds(@Body @NotNull WalletAutomationRequestDto.ExceedsDto request, @Tag @NotNull wj0.b idempotencyTag);

    @Headers({"X-Api-Version: v2"})
    @PUT("/wallet-automations/low-balance/{id}")
    @NotNull
    d0<r> putWalletAutomationDropsBelow(@Path("id") @NotNull String id10, @Body @NotNull WalletAutomationRequestDto.DropsBelowDto request);

    @Headers({"X-Api-Version: v2"})
    @PUT("/wallet-automations/excess-balance/{id}")
    @NotNull
    d0<r> putWalletAutomationExceeds(@Path("id") @NotNull String id10, @Body @NotNull WalletAutomationRequestDto.ExceedsDto request);

    @POST("/recurring-payments/subscriptions/{id}/unblock")
    @NotNull
    b unblockSubscription(@Path("id") @NotNull String subscriptionId, @Body BlockUnblockSubscriptionRequest request);

    @Headers({"X-Api-Version: v2"})
    @PUT("/recurring-payments/card-mandates/{id}/frequency")
    @NotNull
    d0<r> updateCardMandateFrequency(@Path("id") @NotNull String cardMandateId, @Body @NotNull UpdateCardMandateFrequencyRequest request, @Header("X-Enabled-Experiments") String enabledExperiments);

    @Headers({"X-Api-Version: v2"})
    @PUT("/recurring-payments/card-mandates/{id}/label")
    @NotNull
    d0<r> updateCardMandateLabel(@Path("id") @NotNull String id10, @Body @NotNull CardMandateUpdateLabelRequest request, @Header("X-Enabled-Experiments") String enabledExperiments);

    @Headers({"X-Api-Version: v2"})
    @PUT("/recurring-payments/manual-card-mandates/{id}/frequency")
    @NotNull
    d0<r> updateManualCardMandateFrequency(@Path("id") @NotNull String cardMandateId, @Body @NotNull UpdateManualCardMandateFrequencyRequest request, @Header("X-Enabled-Experiments") String enabledExperiments);

    @Headers({"X-Api-Version: v2"})
    @PUT("/recurring-payments/subscriptions/{id}/frequency")
    @NotNull
    d0<r> updateSubscriptionFrequency(@Path("id") @NotNull String subscriptionId, @Body @NotNull UpdateSubscriptionFrequencyRequest request, @Header("X-Enabled-Experiments") String enabledExperiments);
}
