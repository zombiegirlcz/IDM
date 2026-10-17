package com.google.android.gms.internal.nearby;

import a0.d;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f45118zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final ClassLoader f45119zzb = zzc.class.getClassLoader();

    private zzc() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static ArrayList zzb(Parcel parcel) {
        return parcel.readArrayList(f45119zzb);
    }

    public static void zzc(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(d.n("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }

    public static void zzd(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static boolean zze(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
