package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "EmoneyReadinessCreator")
public class EmoneyReadiness extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<EmoneyReadiness> CREATOR = new zzm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @EmoneyReadinessStatus
    @SafeParcelable.Field(getter = "getEmoneyReadinessStatus", id = 1)
    private final int f48276zza;

    @SafeParcelable.Constructor
    public EmoneyReadiness(@SafeParcelable.Param(id = 1) int i) {
        this.f48276zza = i;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof EmoneyReadiness) {
            return Objects.equal(Integer.valueOf(this.f48276zza), Integer.valueOf(((EmoneyReadiness) obj2).f48276zza));
        }
        return false;
    }

    @EmoneyReadinessStatus
    public int getEmoneyReadinessStatus() {
        return this.f48276zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48276zza));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getEmoneyReadinessStatus());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
