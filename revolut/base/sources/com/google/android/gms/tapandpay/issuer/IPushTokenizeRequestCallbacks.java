package com.google.android.gms.tapandpay.issuer;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks;

/* JADX INFO: loaded from: classes16.dex */
public interface IPushTokenizeRequestCallbacks extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.tapandpay.zzb implements IPushTokenizeRequestCallbacks {

        public static class Proxy extends com.google.android.gms.internal.tapandpay.zza implements IPushTokenizeRequestCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
            public void generatePaymentCredentials(@NonNull GetPaymentCredentialsRequest getPaymentCredentialsRequest, @NonNull IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws RemoteException {
                Parcel parcelZza = zza();
                com.google.android.gms.internal.tapandpay.zzc.zzc(parcelZza, getPaymentCredentialsRequest);
                com.google.android.gms.internal.tapandpay.zzc.zzd(parcelZza, iPushTokenizeResponseCallbacks);
                zzc(3, parcelZza);
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
            public void isWalletAvailable(@NonNull String str, @NonNull IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws RemoteException {
                Parcel parcelZza = zza();
                parcelZza.writeString(str);
                com.google.android.gms.internal.tapandpay.zzc.zzd(parcelZza, iPushTokenizeResponseCallbacks);
                zzc(2, parcelZza);
            }
        }

        public Stub() {
            super("com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
        }

        @NonNull
        public static IPushTokenizeRequestCallbacks asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
            return iInterfaceQueryLocalInterface instanceof IPushTokenizeRequestCallbacks ? (IPushTokenizeRequestCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.tapandpay.zzb
        public boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                String string = parcel.readString();
                IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacksAsInterface = IPushTokenizeResponseCallbacks.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.tapandpay.zzc.zzb(parcel);
                isWalletAvailable(string, iPushTokenizeResponseCallbacksAsInterface);
                return true;
            }
            if (i != 3) {
                return false;
            }
            GetPaymentCredentialsRequest getPaymentCredentialsRequest = (GetPaymentCredentialsRequest) com.google.android.gms.internal.tapandpay.zzc.zza(parcel, GetPaymentCredentialsRequest.CREATOR);
            IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacksAsInterface2 = IPushTokenizeResponseCallbacks.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.tapandpay.zzc.zzb(parcel);
            generatePaymentCredentials(getPaymentCredentialsRequest, iPushTokenizeResponseCallbacksAsInterface2);
            return true;
        }
    }

    void generatePaymentCredentials(@NonNull GetPaymentCredentialsRequest getPaymentCredentialsRequest, @NonNull IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws RemoteException;

    void isWalletAvailable(@NonNull String str, @NonNull IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws RemoteException;
}
