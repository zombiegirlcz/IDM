package c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends Binder implements b {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = b.f20072c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i) {
            case 2:
                onNavigationEvent(parcel.readInt(), (Bundle) czi.c.e(parcel, Bundle.CREATOR));
                return true;
            case 3:
                extraCallback(parcel.readString(), (Bundle) czi.c.e(parcel, Bundle.CREATOR));
                return true;
            case 4:
                onMessageChannelReady((Bundle) czi.c.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                onPostMessage(parcel.readString(), (Bundle) czi.c.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                onRelationshipValidationResult(parcel.readInt(), (Uri) czi.c.e(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) czi.c.e(parcel, Bundle.CREATOR));
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (Bundle) czi.c.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (bundleExtraCallbackWithResult != null) {
                    parcel2.writeInt(1);
                    bundleExtraCallbackWithResult.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 8:
                onActivityResized(parcel.readInt(), parcel.readInt(), (Bundle) czi.c.e(parcel, Bundle.CREATOR));
                return true;
            case 9:
                onWarmupCompleted((Bundle) czi.c.e(parcel, Bundle.CREATOR));
                return true;
            case 10:
                onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) czi.c.e(parcel, Bundle.CREATOR));
                return true;
            case 11:
                onMinimized((Bundle) czi.c.e(parcel, Bundle.CREATOR));
                return true;
            case 12:
                onUnminimized((Bundle) czi.c.e(parcel, Bundle.CREATOR));
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
