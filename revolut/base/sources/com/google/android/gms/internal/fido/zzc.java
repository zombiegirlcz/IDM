package com.google.android.gms.internal.fido;

import a0.d;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f39317zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final ClassLoader f39318zzb = zzc.class.getClassLoader();

    private zzc() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static ArrayList zzb(Parcel parcel) {
        return parcel.readArrayList(f39318zzb);
    }

    public static void zzc(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(d.n("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }

    public static void zzd(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
