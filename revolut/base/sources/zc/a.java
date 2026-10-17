package zc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f320964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f320965b;

    public a(IBinder iBinder, String str) {
        this.f320964a = iBinder;
        this.f320965b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f320964a;
    }

    public final void k(int i, Parcel parcel) {
        try {
            this.f320964a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
