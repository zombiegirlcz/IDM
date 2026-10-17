package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import fim.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.q;
import skm.r;
import yhm.d;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\t\u001a\u001a\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\r\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0087@¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0017\u001a\u00020\u0018*\u00020\u0002H\u0087@¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\u0019\u001a\u00020\u001a*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001d\u001a\u001a\u0010\u001e\u001a\u00020\u001f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020 H\u0086@¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"acknowledgePurchase", "Lcom/android/billingclient/api/BillingResult;", "Lcom/android/billingclient/api/BillingClient;", "params", "Lcom/android/billingclient/api/AcknowledgePurchaseParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/AcknowledgePurchaseParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumePurchase", "Lcom/android/billingclient/api/ConsumeResult;", "Lcom/android/billingclient/api/ConsumeParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/ConsumeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchasesAsync", "Lcom/android/billingclient/api/PurchasesResult;", "Lcom/android/billingclient/api/QueryPurchasesParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/QueryPurchasesParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryProductDetails", "Lcom/android/billingclient/api/ProductDetailsResult;", "Lcom/android/billingclient/api/QueryProductDetailsParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/QueryProductDetailsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAlternativeBillingOnlyAvailable", "(Lcom/android/billingclient/api/BillingClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAlternativeBillingOnlyReportingDetails", "Lcom/android/billingclient/api/CreateAlternativeBillingOnlyReportingDetailsResult;", "isExternalOfferAvailable", "createExternalOfferReportingDetails", "Lcom/android/billingclient/api/CreateExternalOfferReportingDetailsResult;", "isBillingProgramAvailable", "Lcom/android/billingclient/api/IsBillingProgramAvailableResult;", "billingProgram", "", "(Lcom/android/billingclient/api/BillingClient;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBillingProgramReportingDetails", "Lcom/android/billingclient/api/CreateBillingProgramReportingDetailsResult;", "Lcom/android/billingclient/api/BillingProgramReportingDetailsParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/BillingProgramReportingDetailsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BillingClientKotlinKt {
    @RecentlyNullable
    public static final Object acknowledgePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @RecentlyNonNull Continuation<? super BillingResult> continuation) {
        final r rVarB = e0.b();
        billingClient.acknowledgePurchase(acknowledgePurchaseParams, new AcknowledgePurchaseResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda5
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(@RecentlyNonNull BillingResult billingResult) {
                BillingClientKotlinKt.acknowledgePurchase$lambda$0(rVarB, billingResult);
            }
        });
        Object objY = rVarB.y(continuation);
        a aVar = a.COROUTINE_SUSPENDED;
        return objY;
    }

    public static final void acknowledgePurchase$lambda$0(q qVar, BillingResult billingResult) {
        Intrinsics.h(billingResult);
        ((r) qVar).U(billingResult);
    }

    @RecentlyNullable
    public static final Object consumePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull ConsumeParams consumeParams, @RecentlyNonNull Continuation<? super ConsumeResult> continuation) {
        final r rVarB = e0.b();
        billingClient.consumeAsync(consumeParams, new ConsumeResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda2
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull String str) {
                BillingClientKotlinKt.consumePurchase$lambda$1(rVarB, billingResult, str);
            }
        });
        Object objY = rVarB.y(continuation);
        a aVar = a.COROUTINE_SUSPENDED;
        return objY;
    }

    public static final void consumePurchase$lambda$1(q qVar, BillingResult billingResult, String str) {
        Intrinsics.h(billingResult);
        ((r) qVar).U(new ConsumeResult(billingResult, str));
    }

    @RecentlyNullable
    public static final Object createAlternativeBillingOnlyReportingDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull Continuation<? super CreateAlternativeBillingOnlyReportingDetailsResult> continuation) {
        final r rVarB = e0.b();
        billingClient.createAlternativeBillingOnlyReportingDetailsAsync(new AlternativeBillingOnlyReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda8
            @Override // com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener
            public final void onAlternativeBillingOnlyTokenResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
                BillingClientKotlinKt.createAlternativeBillingOnlyReportingDetails$lambda$5(rVarB, billingResult, alternativeBillingOnlyReportingDetails);
            }
        });
        Object objY = rVarB.y(continuation);
        a aVar = a.COROUTINE_SUSPENDED;
        return objY;
    }

    public static final void createAlternativeBillingOnlyReportingDetails$lambda$5(q qVar, BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        Intrinsics.h(billingResult);
        ((r) qVar).U(new CreateAlternativeBillingOnlyReportingDetailsResult(billingResult, alternativeBillingOnlyReportingDetails));
    }

    @RecentlyNullable
    public static final Object createBillingProgramReportingDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull BillingProgramReportingDetailsParams billingProgramReportingDetailsParams, @RecentlyNonNull Continuation<? super CreateBillingProgramReportingDetailsResult> continuation) {
        final r rVarB = e0.b();
        billingClient.createBillingProgramReportingDetailsAsync(billingProgramReportingDetailsParams, new BillingProgramReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.BillingProgramReportingDetailsListener
            public final void onCreateBillingProgramReportingDetailsResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull BillingProgramReportingDetails billingProgramReportingDetails) {
                BillingClientKotlinKt.createBillingProgramReportingDetails$lambda$9(rVarB, billingResult, billingProgramReportingDetails);
            }
        });
        Object objY = rVarB.y(continuation);
        a aVar = a.COROUTINE_SUSPENDED;
        return objY;
    }

    public static final void createBillingProgramReportingDetails$lambda$9(q qVar, BillingResult billingResult, BillingProgramReportingDetails billingProgramReportingDetails) {
        Intrinsics.h(billingResult);
        ((r) qVar).U(new CreateBillingProgramReportingDetailsResult(billingResult, billingProgramReportingDetails));
    }

    @RecentlyNullable
    @d
    public static final Object createExternalOfferReportingDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull Continuation<? super CreateExternalOfferReportingDetailsResult> continuation) {
        final r rVarB = e0.b();
        billingClient.createExternalOfferReportingDetailsAsync(new ExternalOfferReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda6
            @Override // com.android.billingclient.api.ExternalOfferReportingDetailsListener
            public final void onExternalOfferReportingDetailsResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull ExternalOfferReportingDetails externalOfferReportingDetails) {
                BillingClientKotlinKt.createExternalOfferReportingDetails$lambda$7(rVarB, billingResult, externalOfferReportingDetails);
            }
        });
        Object objY = rVarB.y(continuation);
        a aVar = a.COROUTINE_SUSPENDED;
        return objY;
    }

    public static final void createExternalOfferReportingDetails$lambda$7(q qVar, BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.h(billingResult);
        ((r) qVar).U(new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails));
    }

    @RecentlyNullable
    public static final Object isAlternativeBillingOnlyAvailable(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull Continuation<? super BillingResult> continuation) {
        final r rVarB = e0.b();
        billingClient.isAlternativeBillingOnlyAvailableAsync(new AlternativeBillingOnlyAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda7
            @Override // com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener
            public final void onAlternativeBillingOnlyAvailabilityResponse(@RecentlyNonNull BillingResult billingResult) {
                BillingClientKotlinKt.isAlternativeBillingOnlyAvailable$lambda$4(rVarB, billingResult);
            }
        });
        Object objY = rVarB.y(continuation);
        a aVar = a.COROUTINE_SUSPENDED;
        return objY;
    }

    public static final void isAlternativeBillingOnlyAvailable$lambda$4(q qVar, BillingResult billingResult) {
        Intrinsics.h(billingResult);
        ((r) qVar).U(billingResult);
    }

    @RecentlyNullable
    public static final Object isBillingProgramAvailable(@RecentlyNonNull BillingClient billingClient, int i, @RecentlyNonNull Continuation<? super IsBillingProgramAvailableResult> continuation) {
        final r rVarB = e0.b();
        billingClient.isBillingProgramAvailableAsync(i, new BillingProgramAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.BillingProgramAvailabilityListener
            public final void onBillingProgramAvailabilityResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull BillingProgramAvailabilityDetails billingProgramAvailabilityDetails) {
                BillingClientKotlinKt.isBillingProgramAvailable$lambda$8(rVarB, billingResult, billingProgramAvailabilityDetails);
            }
        });
        Object objY = rVarB.y(continuation);
        a aVar = a.COROUTINE_SUSPENDED;
        return objY;
    }

    public static final void isBillingProgramAvailable$lambda$8(q qVar, BillingResult billingResult, BillingProgramAvailabilityDetails billingProgramAvailabilityDetails) {
        Intrinsics.h(billingResult);
        Intrinsics.h(billingProgramAvailabilityDetails);
        ((r) qVar).U(new IsBillingProgramAvailableResult(billingResult, billingProgramAvailabilityDetails));
    }

    @RecentlyNullable
    @d
    public static final Object isExternalOfferAvailable(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull Continuation<? super BillingResult> continuation) {
        final r rVarB = e0.b();
        billingClient.isExternalOfferAvailableAsync(new ExternalOfferAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda3
            @Override // com.android.billingclient.api.ExternalOfferAvailabilityListener
            public final void onExternalOfferAvailabilityResponse(@RecentlyNonNull BillingResult billingResult) {
                BillingClientKotlinKt.isExternalOfferAvailable$lambda$6(rVarB, billingResult);
            }
        });
        Object objY = rVarB.y(continuation);
        a aVar = a.COROUTINE_SUSPENDED;
        return objY;
    }

    public static final void isExternalOfferAvailable$lambda$6(q qVar, BillingResult billingResult) {
        Intrinsics.h(billingResult);
        ((r) qVar).U(billingResult);
    }

    @RecentlyNullable
    public static final Object queryProductDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull QueryProductDetailsParams queryProductDetailsParams, @RecentlyNonNull Continuation<? super ProductDetailsResult> continuation) {
        final r rVarB = e0.b();
        billingClient.queryProductDetailsAsync(queryProductDetailsParams, new ProductDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda4
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull QueryProductDetailsResult queryProductDetailsResult) {
                BillingClientKotlinKt.queryProductDetails$lambda$3(rVarB, billingResult, queryProductDetailsResult);
            }
        });
        Object objY = rVarB.y(continuation);
        a aVar = a.COROUTINE_SUSPENDED;
        return objY;
    }

    public static final void queryProductDetails$lambda$3(q qVar, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        Intrinsics.h(billingResult);
        ((r) qVar).U(new ProductDetailsResult(billingResult, queryProductDetailsResult.getProductDetailsList()));
    }

    @RecentlyNullable
    public static final Object queryPurchasesAsync(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull QueryPurchasesParams queryPurchasesParams, @RecentlyNonNull Continuation<? super PurchasesResult> continuation) {
        final r rVarB = e0.b();
        billingClient.queryPurchasesAsync(queryPurchasesParams, new PurchasesResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda9
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list) {
                BillingClientKotlinKt.queryPurchasesAsync$lambda$2(rVarB, billingResult, list);
            }
        });
        Object objY = rVarB.y(continuation);
        a aVar = a.COROUTINE_SUSPENDED;
        return objY;
    }

    public static final void queryPurchasesAsync$lambda$2(q qVar, BillingResult billingResult, List list) {
        Intrinsics.h(billingResult);
        Intrinsics.h(list);
        ((r) qVar).U(new PurchasesResult(billingResult, list));
    }
}
