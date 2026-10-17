package pc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements h, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f234760a;

    public f(IBinder iBinder) {
        this.f234760a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f234760a;
    }

    @Override // pc.h
    public final void f(String str, Bundle bundle, oc.h hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i = e.f234759a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(hVar);
        try {
            this.f234760a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
