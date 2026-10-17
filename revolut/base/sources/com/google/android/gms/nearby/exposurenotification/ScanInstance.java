package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ScanInstanceCreator")
public final class ScanInstance extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ScanInstance> CREATOR = new zzo();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTypicalAttenuationDb", id = 1)
    final int f47974zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMinAttenuationDb", id = 2)
    final int f47975zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSecondsSinceLastScan", id = 3)
    final int f47976zzc;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f47977zza = 0;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f47978zzb = 0;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f47979zzc = 0;

        @NonNull
        public ScanInstance build() {
            return new ScanInstance(this.f47977zza, this.f47978zzb, this.f47979zzc);
        }

        @NonNull
        public Builder setMinAttenuationDb(int i) {
            this.f47978zzb = i;
            return this;
        }

        @NonNull
        public Builder setSecondsSinceLastScan(int i) {
            this.f47979zzc = i;
            return this;
        }

        @NonNull
        public Builder setTypicalAttenuationDb(int i) {
            this.f47977zza = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ScanInstance(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3) {
        this.f47974zza = i;
        this.f47975zzb = i2;
        this.f47976zzc = i3;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && ScanInstance.class == obj2.getClass()) {
            ScanInstance scanInstance = (ScanInstance) obj2;
            if (this.f47974zza == scanInstance.f47974zza && this.f47975zzb == scanInstance.f47975zzb && this.f47976zzc == scanInstance.f47976zzc) {
                return true;
            }
        }
        return false;
    }

    public int getMinAttenuationDb() {
        return this.f47975zzb;
    }

    public int getSecondsSinceLastScan() {
        return this.f47976zzc;
    }

    public int getTypicalAttenuationDb() {
        return this.f47974zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47974zza), Integer.valueOf(this.f47975zzb), Integer.valueOf(this.f47976zzc));
    }

    @NonNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("ScanInstance{typicalAttenuationDb=");
        sb6.append(this.f47974zza);
        sb6.append(", minAttenuationDb=");
        sb6.append(this.f47975zzb);
        sb6.append(", secondsSinceLastScan=");
        return a.v(sb6, "}", this.f47976zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getTypicalAttenuationDb());
        SafeParcelWriter.writeInt(parcel, 2, getMinAttenuationDb());
        SafeParcelWriter.writeInt(parcel, 3, getSecondsSinceLastScan());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
