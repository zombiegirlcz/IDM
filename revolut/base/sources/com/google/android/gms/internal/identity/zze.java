package com.google.android.gms.internal.identity;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.identity.intents.AddressConstants;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* JADX INFO: loaded from: classes16.dex */
public final class zze extends GmsClient<zzh> {

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Activity f39584zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzd f39585zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final String f39586zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final int f39587zzh;

    public zze(Activity activity, Looper looper, ClientSettings clientSettings, int i, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super((Context) activity, looper, 12, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f39586zzg = clientSettings.getAccountName();
        this.f39584zze = activity;
        this.f39587zzh = i;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
        return iInterfaceQueryLocalInterface instanceof zzh ? (zzh) iInterfaceQueryLocalInterface : new zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        super.disconnect();
        zzd zzdVar = this.f39585zzf;
        if (zzdVar != null) {
            zzdVar.f39583zzb = null;
            this.f39585zzf = null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.identity.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(UserAddressRequest userAddressRequest, int i) {
        checkConnected();
        this.f39585zzf = new zzd(i, this.f39584zze);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(this.f39586zzg)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.f39586zzg, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.f39587zzh);
            ((zzh) getService()).zzc((zzg) Preconditions.checkNotNull(this.f39585zzf), userAddressRequest, bundle);
        } catch (RemoteException e) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES);
            ((zzd) Preconditions.checkNotNull(this.f39585zzf)).zzc(1, bundle2);
        }
    }
}
