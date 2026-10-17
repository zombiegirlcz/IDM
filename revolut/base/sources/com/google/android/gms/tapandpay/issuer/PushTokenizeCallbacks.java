package com.google.android.gms.tapandpay.issuer;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes16.dex */
public final class PushTokenizeCallbacks extends IPushTokenizeRequestCallbacks.Stub {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int[] f48626zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Executor f48627zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final WalletAvailabilityChecker f48628zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final PaymentCredentialsGenerator f48629zzd;

    private PushTokenizeCallbacks(int[] iArr, Executor executor, WalletAvailabilityChecker walletAvailabilityChecker, PaymentCredentialsGenerator paymentCredentialsGenerator) {
        this.f48626zza = iArr;
        this.f48627zzb = executor;
        this.f48628zzc = walletAvailabilityChecker;
        this.f48629zzd = paymentCredentialsGenerator;
    }

    public static PushTokenizeCallbacks tryCreate(Executor executor, WalletAvailabilityChecker walletAvailabilityChecker, PaymentCredentialsGenerator paymentCredentialsGenerator) {
        if (walletAvailabilityChecker == null && paymentCredentialsGenerator == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (walletAvailabilityChecker != null) {
            arrayList.add(1);
        }
        if (paymentCredentialsGenerator != null) {
            arrayList.add(2);
            if (paymentCredentialsGenerator.getGoogleOpaquePaymentCardSupported()) {
                arrayList.add(3);
            }
        }
        Object[] array = arrayList.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj2 = array[i];
            obj2.getClass();
            iArr[i] = ((Number) obj2).intValue();
        }
        if (executor == null) {
            executor = Executors.newSingleThreadExecutor();
        }
        return new PushTokenizeCallbacks(iArr, executor, walletAvailabilityChecker, paymentCredentialsGenerator);
    }

    @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
    public void generatePaymentCredentials(@NonNull final GetPaymentCredentialsRequest getPaymentCredentialsRequest, @NonNull final IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        this.f48627zzb.execute(new Runnable() { // from class: com.google.android.gms.tapandpay.issuer.zzg
            @Override // java.lang.Runnable
            public final void run() {
                this.f48695zza.zza(getPaymentCredentialsRequest, iPushTokenizeResponseCallbacks);
            }
        });
    }

    @NonNull
    public int[] getSupportedCallbackRequestTypes() {
        return this.f48626zza;
    }

    @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
    public void isWalletAvailable(@NonNull final String str, @NonNull final IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        this.f48627zzb.execute(new Runnable() { // from class: com.google.android.gms.tapandpay.issuer.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.f48698zza.zzb(str, iPushTokenizeResponseCallbacks);
            }
        });
    }

    public final /* synthetic */ void zza(GetPaymentCredentialsRequest getPaymentCredentialsRequest, IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        try {
            Preconditions.checkNotNull(this.f48629zzd);
            iPushTokenizeResponseCallbacks.onPaymentCredentialsResponse(this.f48629zzd.generate(getPaymentCredentialsRequest));
        } catch (Exception e) {
            try {
                iPushTokenizeResponseCallbacks.onError(0);
            } catch (RemoteException e2) {
            }
        }
    }

    public final /* synthetic */ void zzb(String str, IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        try {
            Preconditions.checkNotNull(this.f48628zzc);
            iPushTokenizeResponseCallbacks.onWalletAvailableResponse(this.f48628zzc.isAvailable(str));
        } catch (Exception e) {
            try {
                iPushTokenizeResponseCallbacks.onError(0);
            } catch (RemoteException e2) {
            }
        }
    }
}
