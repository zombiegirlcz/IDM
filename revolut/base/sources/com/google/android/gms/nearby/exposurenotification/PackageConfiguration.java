package com.google.android.gms.nearby.exposurenotification;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PackageConfigurationCreator")
public final class PackageConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PackageConfiguration> CREATOR = new zzn();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getValues", id = 1)
    final Bundle f47972zza;

    public static final class PackageConfigurationBuilder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private Bundle f47973zza;

        @NonNull
        public PackageConfiguration build() {
            return new PackageConfiguration(this.f47973zza);
        }

        @NonNull
        public PackageConfigurationBuilder setValues(@NonNull Bundle bundle) {
            this.f47973zza = new Bundle(bundle);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PackageConfiguration(@SafeParcelable.Param(id = 1) Bundle bundle) {
        this.f47972zza = bundle;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof PackageConfiguration) {
            return Objects.equal(this.f47972zza, ((PackageConfiguration) obj2).getValues());
        }
        return false;
    }

    @NonNull
    public Bundle getValues() {
        return this.f47972zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.f47972zza);
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        return "PackageConfiguration<values: " + this.f47972zza + ">";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, getValues(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
