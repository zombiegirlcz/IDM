package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getName", id = 1)
    private final String f37658zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int f37659zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long f37660zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getIsFullyRolledOut", id = 4)
    private final boolean f37661zzd;

    @SafeParcelable.Constructor
    public Feature(@NonNull @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) boolean z) {
        this.f37658zza = str;
        this.f37659zzb = i;
        this.f37660zzc = j2;
        this.f37661zzd = z;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof Feature) {
            Feature feature = (Feature) obj2;
            if (matches(feature) && getIsFullyRolledOut() == feature.getIsFullyRolledOut()) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean getIsFullyRolledOut() {
        return this.f37661zzd;
    }

    @NonNull
    @KeepForSdk
    public String getName() {
        return this.f37658zza;
    }

    @KeepForSdk
    public long getVersion() {
        long j2 = this.f37660zzc;
        return j2 == -1 ? this.f37659zzb : j2;
    }

    public final int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()), Boolean.valueOf(getIsFullyRolledOut()));
    }

    @KeepForSdk
    public boolean matches(Feature feature) {
        return feature != null && Objects.equal(getName(), feature.getName()) && getVersion() == feature.getVersion();
    }

    @NonNull
    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add("version", Long.valueOf(getVersion()));
        stringHelper.add("is_fully_rolled_out", Boolean.valueOf(getIsFullyRolledOut()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.f37659zzb);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.writeBoolean(parcel, 4, getIsFullyRolledOut());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @KeepForSdk
    public Feature(@NonNull String str, int i, long j2) {
        this(str, i, j2, false);
    }

    @KeepForSdk
    public Feature(@NonNull String str, long j2) {
        this(str, -1, j2, false);
    }

    @KeepForSdk
    public Feature(@NonNull String str, long j2, boolean z) {
        this(str, -1, j2, z);
    }
}
