package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ExposureInformationCreator")
@Deprecated
public final class ExposureInformation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ExposureInformation> CREATOR = new zzf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDateMillisSinceEpoch", id = 1)
    final long f47935zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDurationMinutes", id = 2)
    final int f47936zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttenuationValue", id = 3)
    final int f47937zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @RiskLevel
    @SafeParcelable.Field(getter = "getTransmissionRiskLevel", id = 4)
    final int f47938zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTotalRiskScore", id = 5)
    final int f47939zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttenuationDurationsInMinutes", id = 6)
    final int[] f47940zzf;

    public static final class ExposureInformationBuilder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private long f47941zza = 0;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f47942zzb = 0;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f47943zzc = 0;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        @RiskLevel
        private int f47944zzd = 0;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private int f47945zze = 0;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private int[] f47946zzf = {0, 0};

        @NonNull
        public ExposureInformation build() {
            return new ExposureInformation(this.f47941zza, this.f47942zzb, this.f47943zzc, this.f47944zzd, this.f47945zze, this.f47946zzf);
        }

        @NonNull
        public ExposureInformationBuilder setAttenuationDurations(@NonNull int[] iArr) {
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                Preconditions.checkArgument(i2 >= 0, "attenuationDuration (%s) must be >= 0", Integer.valueOf(i2));
            }
            this.f47946zzf = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        @NonNull
        public ExposureInformationBuilder setAttenuationValue(int i) {
            boolean z = false;
            if (i >= 0 && i <= 255) {
                z = true;
            }
            Preconditions.checkArgument(z, "attenuationValue (%s) must be >= 0 and <= 255", Integer.valueOf(i));
            this.f47943zzc = i;
            return this;
        }

        @NonNull
        public ExposureInformationBuilder setDateMillisSinceEpoch(long j2) {
            Preconditions.checkArgument(j2 >= 0, "dateMillisSinceEpoch (%s) must be >= 0", Long.valueOf(j2));
            this.f47941zza = j2;
            return this;
        }

        @NonNull
        public ExposureInformationBuilder setDurationMinutes(int i) {
            Integer numValueOf = Integer.valueOf(i);
            Preconditions.checkArgument(i % 5 == 0, "durationMinutes (%s) must be an increment of 5", numValueOf);
            Preconditions.checkArgument(i <= 30, "durationMinutes (%s) must be <= 30", numValueOf);
            this.f47942zzb = i;
            return this;
        }

        @NonNull
        public ExposureInformationBuilder setTotalRiskScore(int i) {
            boolean z = false;
            if (i >= 0 && i <= 4096) {
                z = true;
            }
            Preconditions.checkArgument(z, "totalRiskScore (%s) must be >= 0 and <= 4096", Integer.valueOf(i));
            this.f47945zze = i;
            return this;
        }

        @NonNull
        public ExposureInformationBuilder setTransmissionRiskLevel(@RiskLevel int i) {
            boolean z = false;
            if (i >= 0 && i <= 8) {
                z = true;
            }
            Preconditions.checkArgument(z, "transmissionRiskLevel (%s) must be >= 0 and <= 8", Integer.valueOf(i));
            this.f47944zzd = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ExposureInformation(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) int i5, @SafeParcelable.Param(id = 6) int[] iArr) {
        this.f47935zza = j2;
        this.f47936zzb = i;
        this.f47937zzc = i2;
        this.f47938zzd = i3;
        this.f47939zze = i5;
        this.f47940zzf = iArr;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof ExposureInformation) {
            ExposureInformation exposureInformation = (ExposureInformation) obj2;
            if (Objects.equal(Long.valueOf(this.f47935zza), Long.valueOf(exposureInformation.getDateMillisSinceEpoch())) && Objects.equal(Integer.valueOf(this.f47936zzb), Integer.valueOf(exposureInformation.getDurationMinutes())) && Objects.equal(Integer.valueOf(this.f47937zzc), Integer.valueOf(exposureInformation.getAttenuationValue())) && Objects.equal(Integer.valueOf(this.f47938zzd), Integer.valueOf(exposureInformation.getTransmissionRiskLevel())) && Objects.equal(Integer.valueOf(this.f47939zze), Integer.valueOf(exposureInformation.getTotalRiskScore())) && Arrays.equals(this.f47940zzf, exposureInformation.getAttenuationDurationsInMinutes())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public int[] getAttenuationDurationsInMinutes() {
        int[] iArr = this.f47940zzf;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getAttenuationValue() {
        return this.f47937zzc;
    }

    public long getDateMillisSinceEpoch() {
        return this.f47935zza;
    }

    public int getDurationMinutes() {
        return this.f47936zzb;
    }

    public int getTotalRiskScore() {
        return this.f47939zze;
    }

    @RiskLevel
    public int getTransmissionRiskLevel() {
        return this.f47938zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f47935zza), Integer.valueOf(this.f47936zzb), Integer.valueOf(this.f47937zzc), Integer.valueOf(this.f47938zzd), Integer.valueOf(this.f47939zze), this.f47940zzf);
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "ExposureInformation<date: %s, dateMillisSinceEpoch: %d, durationMinutes: %d, attenuationValue: %d, transmissionRiskLevel: %d, totalRiskScore: %d, attenuationDurations: %s>", new Date(this.f47935zza), Long.valueOf(this.f47935zza), Integer.valueOf(this.f47936zzb), Integer.valueOf(this.f47937zzc), Integer.valueOf(this.f47938zzd), Integer.valueOf(this.f47939zze), Arrays.toString(this.f47940zzf));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getDateMillisSinceEpoch());
        SafeParcelWriter.writeInt(parcel, 2, getDurationMinutes());
        SafeParcelWriter.writeInt(parcel, 3, getAttenuationValue());
        SafeParcelWriter.writeInt(parcel, 4, getTransmissionRiskLevel());
        SafeParcelWriter.writeInt(parcel, 5, getTotalRiskScore());
        SafeParcelWriter.writeIntArray(parcel, 6, getAttenuationDurationsInMinutes(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
