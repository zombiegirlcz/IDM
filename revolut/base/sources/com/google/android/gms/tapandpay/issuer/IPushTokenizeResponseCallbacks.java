package com.google.android.gms.tapandpay.issuer;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public interface IPushTokenizeResponseCallbacks extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.tapandpay.zzb implements IPushTokenizeResponseCallbacks {

        public static class Proxy extends com.google.android.gms.internal.tapandpay.zza implements IPushTokenizeResponseCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks");
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks
            public void onError(int i) throws RemoteException {
                Parcel parcelZza = zza();
                parcelZza.writeInt(i);
                zzc(4, parcelZza);
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks
            public void onPaymentCredentialsResponse(@NonNull GetPaymentCredentialsResponse getPaymentCredentialsResponse) throws RemoteException {
                Parcel parcelZza = zza();
                com.google.android.gms.internal.tapandpay.zzc.zzc(parcelZza, getPaymentCredentialsResponse);
                zzc(3, parcelZza);
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks
            public void onWalletAvailableResponse(boolean z) throws RemoteException {
                Parcel parcelZza = zza();
                int i = com.google.android.gms.internal.tapandpay.zzc.f46329zza;
                parcelZza.writeInt(z ? 1 : 0);
                zzc(2, parcelZza);
            }
        }

        public Stub() {
            super("com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks");
        }

        @NonNull
        public static IPushTokenizeResponseCallbacks asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks");
            return iInterfaceQueryLocalInterface instanceof IPushTokenizeResponseCallbacks ? (IPushTokenizeResponseCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.tapandpay.zzb
        public boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                boolean zZze = com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zzb(parcel);
                onWalletAvailableResponse(zZze);
                return true;
            }
            if (i == 3) {
                GetPaymentCredentialsResponse getPaymentCredentialsResponse = (GetPaymentCredentialsResponse) com.google.android.gms.internal.tapandpay.zzc.zza(parcel, GetPaymentCredentialsResponse.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zzb(parcel);
                onPaymentCredentialsResponse(getPaymentCredentialsResponse);
                return true;
            }
            if (i != 4) {
                return false;
            }
            int i3 = parcel.readInt();
            com.google.android.gms.internal.tapandpay.zzc.zzb(parcel);
            onError(i3);
            return true;
        }
    }

    void onError(int i) throws RemoteException;

    void onPaymentCredentialsResponse(@NonNull GetPaymentCredentialsResponse getPaymentCredentialsResponse) throws RemoteException;

    void onWalletAvailableResponse(boolean z) throws RemoteException;
}
