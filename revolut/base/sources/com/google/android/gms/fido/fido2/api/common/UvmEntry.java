package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UvmEntryCreator")
public class UvmEntry extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new zzbe();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUserVerificationMethod", id = 1)
    private final int f38611zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getKeyProtectionType", id = 2)
    private final short f38612zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMatcherProtectionType", id = 3)
    private final short f38613zzc;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f38614zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private short f38615zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private short f38616zzc;

        @NonNull
        public UvmEntry build() {
            return new UvmEntry(this.f38614zza, this.f38615zzb, this.f38616zzc);
        }

        @NonNull
        public Builder setKeyProtectionType(short s2) {
            this.f38615zzb = s2;
            return this;
        }

        @NonNull
        public Builder setMatcherProtectionType(short s2) {
            this.f38616zzc = s2;
            return this;
        }

        @NonNull
        public Builder setUserVerificationMethod(int i) {
            this.f38614zza = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public UvmEntry(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) short s2, @SafeParcelable.Param(id = 3) short s3) {
        this.f38611zza = i;
        this.f38612zzb = s2;
        this.f38613zzc = s3;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj2;
        return this.f38611zza == uvmEntry.f38611zza && this.f38612zzb == uvmEntry.f38612zzb && this.f38613zzc == uvmEntry.f38613zzc;
    }

    public short getKeyProtectionType() {
        return this.f38612zzb;
    }

    public short getMatcherProtectionType() {
        return this.f38613zzc;
    }

    public int getUserVerificationMethod() {
        return this.f38611zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f38611zza), Short.valueOf(this.f38612zzb), Short.valueOf(this.f38613zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getUserVerificationMethod());
        SafeParcelWriter.writeShort(parcel, 2, getKeyProtectionType());
        SafeParcelWriter.writeShort(parcel, 3, getMatcherProtectionType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
