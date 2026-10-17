package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
@KeepName
public final class BinderWrapper implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new zzh();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IBinder f38028zza;

    @KeepForSdk
    public BinderWrapper(@NonNull IBinder iBinder) {
        this.f38028zza = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f38028zza);
    }

    public /* synthetic */ BinderWrapper(Parcel parcel, byte[] bArr) {
        this.f38028zza = parcel.readStrongBinder();
    }
}
