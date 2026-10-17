package com.google.android.gms.internal.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

/* JADX INFO: loaded from: classes16.dex */
public final class zzy extends GmsClient {

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Context f46393zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final int f46394zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final String f46395zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final int f46396zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final boolean f46397zzi;

    public zzy(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i, int i2, boolean z) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f46393zze = context;
        this.f46394zzf = i;
        Account account = clientSettings.getAccount();
        this.f46395zzg = account != null ? account.name : null;
        this.f46396zzh = i2;
        this.f46397zzi = z;
    }

    private final Bundle zzu() {
        String packageName = this.f46393zze.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.f46394zzf);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.f46397zzi);
        bundle.putString("androidPackageName", packageName);
        String str = this.f46395zzg;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.f46396zzh);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return iInterfaceQueryLocalInterface instanceof zzo ? (zzo) iInterfaceQueryLocalInterface : new zzo(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.wallet.zzk.f49044zzi;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        zzs zzsVar = new zzs((Activity) this.f46393zze, i);
        try {
            ((zzo) getService()).zzd(createWalletObjectsRequest, zzu(), zzsVar);
        } catch (RemoteException e) {
            zzsVar.zzh(8, Bundle.EMPTY);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzq(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource taskCompletionSource) {
        Bundle bundleZzu = zzu();
        bundleZzu.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzv zzvVar = new zzv(taskCompletionSource);
        try {
            ((zzo) getService()).zzd(createWalletObjectsRequest, bundleZzu, zzvVar);
        } catch (RemoteException e) {
            zzvVar.zzh(8, Bundle.EMPTY);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzr(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, TaskCompletionSource taskCompletionSource) {
        try {
            ((zzo) getService()).zze(paymentCardRecognitionIntentRequest, zzu(), new zzw(taskCompletionSource));
        } catch (RemoteException e) {
            Status status = Status.RESULT_SUCCESS_CACHE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzs(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzu zzuVar = new zzu(taskCompletionSource);
        try {
            ((zzo) getService()).zzf(isReadyToPayRequest, zzu(), zzuVar);
        } catch (RemoteException e) {
            zzuVar.zzc(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt(PaymentDataRequest paymentDataRequest, TaskCompletionSource taskCompletionSource) {
        Bundle bundleZzu = zzu();
        bundleZzu.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzx zzxVar = new zzx(taskCompletionSource);
        try {
            ((zzo) getService()).zzg(paymentDataRequest, bundleZzu, zzxVar);
        } catch (RemoteException e) {
            zzxVar.zzf(Status.RESULT_INTERNAL_ERROR, null, Bundle.EMPTY);
        }
    }
}
