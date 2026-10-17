package wc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class g implements i, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f296290a;

    public g(IBinder iBinder) {
        this.f296290a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f296290a;
    }

    @Override // wc.i
    public final void b(String str, ArrayList arrayList, Bundle bundle, vc.h hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        parcelObtain.writeString(str);
        parcelObtain.writeTypedList(arrayList);
        int i = q.f296304a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(hVar);
        k(8, parcelObtain);
    }

    @Override // wc.i
    public final void d(String str, ArrayList arrayList, Bundle bundle, vc.h hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        parcelObtain.writeString(str);
        parcelObtain.writeTypedList(arrayList);
        int i = q.f296304a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(hVar);
        k(2, parcelObtain);
    }

    @Override // wc.i
    public final void e(String str, ArrayList arrayList, Bundle bundle, vc.h hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        parcelObtain.writeString(str);
        parcelObtain.writeTypedList(arrayList);
        int i = q.f296304a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(hVar);
        k(7, parcelObtain);
    }

    public final void k(int i, Parcel parcel) {
        try {
            this.f296290a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
