package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public final class AFb1zSDK {

    public static final class AFa1uSDK {
        private final boolean AFInAppEventParameterName;
        public final String valueOf;

        public AFa1uSDK(String str, boolean z) {
            this.valueOf = str;
            this.AFInAppEventParameterName = z;
        }

        public final boolean AFInAppEventParameterName() {
            return this.AFInAppEventParameterName;
        }
    }

    public static final class AFa1vSDK implements IInterface {
        private final IBinder valueOf;

        public AFa1vSDK(IBinder iBinder) {
            this.valueOf = iBinder;
        }

        public final boolean AFKeystoreWrapper() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.valueOf.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.valueOf;
        }

        public final String values() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.valueOf.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static AFa1uSDK valueOf(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1zSDK aFa1zSDK = new AFa1zSDK((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1zSDK, 1)) {
                context.unbindService(aFa1zSDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1zSDK.valueOf) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1zSDK.valueOf = true;
            IBinder iBinderPoll = aFa1zSDK.AFInAppEventType.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1vSDK aFa1vSDK = new AFa1vSDK(iBinderPoll);
            return new AFa1uSDK(aFa1vSDK.values(), aFa1vSDK.AFKeystoreWrapper());
        } finally {
            context.unbindService(aFa1zSDK);
        }
    }

    public static final class AFa1zSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFInAppEventType;
        boolean valueOf;

        private AFa1zSDK() {
            this.AFInAppEventType = new LinkedBlockingQueue<>(1);
            this.valueOf = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFInAppEventType.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ AFa1zSDK(byte b4) {
            this();
        }
    }
}
