package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.Wallet;

/* JADX INFO: loaded from: classes16.dex */
public class PaymentsClient extends GoogleApi<Wallet.WalletOptions> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f48932zza = 0;

    public PaymentsClient(@NonNull Activity activity, @NonNull Wallet.WalletOptions walletOptions) {
        super(activity, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @NonNull
    public Task<PaymentCardRecognitionIntentResponse> getPaymentCardRecognitionIntent(@NonNull final PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wallet.zzai
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) {
                ((com.google.android.gms.internal.wallet.zzy) obj2).zzr(paymentCardRecognitionIntentRequest, (TaskCompletionSource) obj3);
            }
        }).setFeatures(zzk.f49042zzg).setAutoResolveMissingFeatures(true).setMethodKey(23716).build());
    }

    @NonNull
    public Task<Boolean> isReadyToPay(@NonNull final IsReadyToPayRequest isReadyToPayRequest) {
        return doRead(TaskApiCall.builder().setMethodKey(23705).run(new RemoteCall() { // from class: com.google.android.gms.wallet.zzah
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) throws RemoteException {
                ((com.google.android.gms.internal.wallet.zzy) obj2).zzs(isReadyToPayRequest, (TaskCompletionSource) obj3);
            }
        }).build());
    }

    @NonNull
    public Task<PaymentData> loadPaymentData(@NonNull final PaymentDataRequest paymentDataRequest) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wallet.zzag
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) {
                ((com.google.android.gms.internal.wallet.zzy) obj2).zzt(paymentDataRequest, (TaskCompletionSource) obj3);
            }
        }).setFeatures(zzk.f49038zzc).setAutoResolveMissingFeatures(true).setMethodKey(23707).build());
    }

    public PaymentsClient(@NonNull Context context, @NonNull Wallet.WalletOptions walletOptions) {
        super(context, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
