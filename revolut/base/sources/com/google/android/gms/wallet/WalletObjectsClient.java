package com.google.android.gms.wallet;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.Wallet;

/* JADX INFO: loaded from: classes16.dex */
public class WalletObjectsClient extends GoogleApi<Wallet.WalletOptions> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f48950zza = 0;

    public WalletObjectsClient(@NonNull Activity activity, Wallet.WalletOptions walletOptions) {
        super(activity, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @NonNull
    public Task<AutoResolvableVoidResult> createWalletObjects(@NonNull final CreateWalletObjectsRequest createWalletObjectsRequest) {
        return doWrite(TaskApiCall.builder().setMethodKey(23708).run(new RemoteCall() { // from class: com.google.android.gms.wallet.zzat
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj2, Object obj3) {
                ((com.google.android.gms.internal.wallet.zzy) obj2).zzq(createWalletObjectsRequest, (TaskCompletionSource) obj3);
            }
        }).build());
    }
}
