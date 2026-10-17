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
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ExposureConfigurationCreator")
@Deprecated
public final class ExposureConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ExposureConfiguration> CREATOR = new zze();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMinimumRiskScore", id = 1)
    final int f47915zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttenuationScores", id = 2)
    final int[] f47916zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttenuationWeight", id = 3)
    final int f47917zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDaysSinceLastExposureScores", id = 4)
    final int[] f47918zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDaysSinceLastExposureWeight", id = 5)
    final int f47919zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDurationScores", id = 6)
    final int[] f47920zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDurationWeight", id = 7)
    final int f47921zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransmissionRiskScores", id = 8)
    final int[] f47922zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransmissionRiskWeight", id = 9)
    final int f47923zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDurationAtAttenuationThresholds", id = 10)
    final int[] f47924zzj;

    public static final class ExposureConfigurationBuilder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f47925zza = 4;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int[] f47926zzb = {4, 4, 4, 4, 4, 4, 4, 4};

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f47927zzc = 50;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private int[] f47928zzd = {4, 4, 4, 4, 4, 4, 4, 4};

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private int f47929zze = 50;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private int[] f47930zzf = {4, 4, 4, 4, 4, 4, 4, 4};

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private int f47931zzg = 50;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private int[] f47932zzh = {4, 4, 4, 4, 4, 4, 4, 4};

        /* JADX INFO: renamed from: zzi, reason: collision with root package name */
        private int f47933zzi = 50;

        /* JADX INFO: renamed from: zzj, reason: collision with root package name */
        private int[] f47934zzj = {50, 74};

        @NonNull
        public ExposureConfiguration build() {
            return new ExposureConfiguration(this.f47925zza, this.f47926zzb, this.f47927zzc, this.f47928zzd, this.f47929zze, this.f47930zzf, this.f47931zzg, this.f47932zzh, this.f47933zzi, this.f47934zzj);
        }

        @NonNull
        public ExposureConfigurationBuilder setAttenuationScores(@NonNull int... iArr) {
            int length = iArr.length;
            Preconditions.checkArgument(length == 8, "attenuationScores (%s) must have exactly 8 elements", Arrays.toString(iArr));
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                Preconditions.checkArgument(i2 >= 0 && i2 <= 8, "attenuationScore (%s) must be >= 0 and <= 8", Integer.valueOf(i2));
            }
            this.f47926zzb = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        @NonNull
        public ExposureConfigurationBuilder setAttenuationWeight(int i) {
            boolean z = false;
            if (i >= 0 && i <= 100) {
                z = true;
            }
            Preconditions.checkArgument(z, "attenuationWeight (%s) must be >= 0 and <= 100", Integer.valueOf(i));
            this.f47927zzc = i;
            return this;
        }

        @NonNull
        public ExposureConfigurationBuilder setDaysSinceLastExposureScores(@NonNull int... iArr) {
            int length = iArr.length;
            Preconditions.checkArgument(length == 8, "daysSinceLastExposureScores (%s) must have exactly 8 elements", Arrays.toString(iArr));
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                Preconditions.checkArgument(i2 >= 0 && i2 <= 8, "daysSinceLastExposureScore (%s) must be >= 0 and <= 8", Integer.valueOf(i2));
            }
            this.f47928zzd = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        @NonNull
        public ExposureConfigurationBuilder setDaysSinceLastExposureWeight(int i) {
            boolean z = false;
            if (i >= 0 && i <= 100) {
                z = true;
            }
            Preconditions.checkArgument(z, "daysSinceLastExposureWeight (%s) must be >= 0 and <= 100", Integer.valueOf(i));
            this.f47929zze = i;
            return this;
        }

        @NonNull
        public ExposureConfigurationBuilder setDurationAtAttenuationThresholds(@NonNull int... iArr) {
            int length = iArr.length;
            Preconditions.checkArgument(length == 2, "durationAtAttenuationThresholds (%s) must have exactly 2 elements", Arrays.toString(iArr));
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                Preconditions.checkArgument(i2 >= 0 && i2 <= 255, "durationAtAttenuationThreshold (%s) must be >= 0 and <= 255", Integer.valueOf(i2));
            }
            int i3 = iArr[0];
            Preconditions.checkArgument(i3 <= iArr[1], "durationAtAttenuationThresholds[0] (%s) must be <= than durationAtAttenuationThresholds[1] (%s)", Integer.valueOf(i3), Integer.valueOf(iArr[1]));
            this.f47934zzj = iArr;
            return this;
        }

        @NonNull
        public ExposureConfigurationBuilder setDurationScores(@NonNull int... iArr) {
            int length = iArr.length;
            Preconditions.checkArgument(length == 8, "durationScores (%s) must have exactly 8 elements", Arrays.toString(iArr));
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                Preconditions.checkArgument(i2 >= 0 && i2 <= 8, "durationScore (%s) must be >= 0 and <= 8", Integer.valueOf(i2));
            }
            this.f47930zzf = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        @NonNull
        public ExposureConfigurationBuilder setDurationWeight(int i) {
            boolean z = false;
            if (i >= 0 && i <= 100) {
                z = true;
            }
            Preconditions.checkArgument(z, "durationWeight (%s) must be >= 0 and <= 100", Integer.valueOf(i));
            this.f47931zzg = i;
            return this;
        }

        @NonNull
        public ExposureConfigurationBuilder setMinimumRiskScore(int i) {
            boolean z = false;
            if (i > 0 && i <= 4096) {
                z = true;
            }
            Preconditions.checkArgument(z, "minimumRiskScore (%s) must be >= 1 and <= 4096", Integer.valueOf(i));
            this.f47925zza = i;
            return this;
        }

        @NonNull
        public ExposureConfigurationBuilder setTransmissionRiskScores(@NonNull int... iArr) {
            int length = iArr.length;
            Preconditions.checkArgument(length == 8, "transmissionRiskScores (%s) must have exactly 8 elements", Arrays.toString(iArr));
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                Preconditions.checkArgument(i2 >= 0 && i2 <= 8, "transmissionRiskScore (%s) must be >= 0 and <= 8", Integer.valueOf(i2));
            }
            this.f47932zzh = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        @NonNull
        public ExposureConfigurationBuilder setTransmissionRiskWeight(int i) {
            boolean z = false;
            if (i >= 0 && i <= 100) {
                z = true;
            }
            Preconditions.checkArgument(z, "transmissionRiskWeight (%s) must be >= 0 and <= 100", Integer.valueOf(i));
            this.f47933zzi = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ExposureConfiguration(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int[] iArr, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int[] iArr2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) int[] iArr3, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) int[] iArr4, @SafeParcelable.Param(id = 9) int i6, @SafeParcelable.Param(id = 10) int[] iArr5) {
        this.f47915zza = i;
        this.f47916zzb = iArr;
        this.f47917zzc = i2;
        this.f47918zzd = iArr2;
        this.f47919zze = i3;
        this.f47920zzf = iArr3;
        this.f47921zzg = i5;
        this.f47922zzh = iArr4;
        this.f47923zzi = i6;
        this.f47924zzj = iArr5;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof ExposureConfiguration) {
            ExposureConfiguration exposureConfiguration = (ExposureConfiguration) obj2;
            if (Objects.equal(Integer.valueOf(this.f47915zza), Integer.valueOf(exposureConfiguration.getMinimumRiskScore())) && Arrays.equals(this.f47916zzb, exposureConfiguration.getAttenuationScores()) && Objects.equal(Integer.valueOf(this.f47917zzc), Integer.valueOf(exposureConfiguration.getAttenuationWeight())) && Arrays.equals(this.f47918zzd, exposureConfiguration.getDaysSinceLastExposureScores()) && Objects.equal(Integer.valueOf(this.f47919zze), Integer.valueOf(exposureConfiguration.getDaysSinceLastExposureWeight())) && Arrays.equals(this.f47920zzf, exposureConfiguration.getDurationScores()) && Objects.equal(Integer.valueOf(this.f47921zzg), Integer.valueOf(exposureConfiguration.getDurationWeight())) && Arrays.equals(this.f47922zzh, exposureConfiguration.getTransmissionRiskScores()) && Objects.equal(Integer.valueOf(this.f47923zzi), Integer.valueOf(exposureConfiguration.getTransmissionRiskWeight())) && Arrays.equals(this.f47924zzj, exposureConfiguration.getDurationAtAttenuationThresholds())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public int[] getAttenuationScores() {
        int[] iArr = this.f47916zzb;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getAttenuationWeight() {
        return this.f47917zzc;
    }

    @NonNull
    public int[] getDaysSinceLastExposureScores() {
        int[] iArr = this.f47918zzd;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getDaysSinceLastExposureWeight() {
        return this.f47919zze;
    }

    @NonNull
    public int[] getDurationAtAttenuationThresholds() {
        int[] iArr = this.f47924zzj;
        return Arrays.copyOf(iArr, iArr.length);
    }

    @NonNull
    public int[] getDurationScores() {
        int[] iArr = this.f47920zzf;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getDurationWeight() {
        return this.f47921zzg;
    }

    public int getMinimumRiskScore() {
        return this.f47915zza;
    }

    @NonNull
    public int[] getTransmissionRiskScores() {
        int[] iArr = this.f47922zzh;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getTransmissionRiskWeight() {
        return this.f47923zzi;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47915zza), this.f47916zzb, Integer.valueOf(this.f47917zzc), this.f47918zzd, Integer.valueOf(this.f47919zze), this.f47920zzf, Integer.valueOf(this.f47921zzg), this.f47922zzh, Integer.valueOf(this.f47923zzi), this.f47924zzj);
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        return "ExposureConfiguration<minimumRiskScore: " + this.f47915zza + ", attenuationScores: " + Arrays.toString(this.f47916zzb) + ", attenuationWeight: " + this.f47917zzc + ", daysSinceLastExposureScores: " + Arrays.toString(this.f47918zzd) + ", daysSinceLastExposureWeight: " + this.f47919zze + ", durationScores: " + Arrays.toString(this.f47920zzf) + ", durationWeight: " + this.f47921zzg + ", transmissionRiskScores: " + Arrays.toString(this.f47922zzh) + ", transmissionRiskWeight: " + this.f47923zzi + ", durationAtAttenuationThresholds: " + Arrays.toString(this.f47924zzj) + ">";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getMinimumRiskScore());
        SafeParcelWriter.writeIntArray(parcel, 2, getAttenuationScores(), false);
        SafeParcelWriter.writeInt(parcel, 3, getAttenuationWeight());
        SafeParcelWriter.writeIntArray(parcel, 4, getDaysSinceLastExposureScores(), false);
        SafeParcelWriter.writeInt(parcel, 5, getDaysSinceLastExposureWeight());
        SafeParcelWriter.writeIntArray(parcel, 6, getDurationScores(), false);
        SafeParcelWriter.writeInt(parcel, 7, getDurationWeight());
        SafeParcelWriter.writeIntArray(parcel, 8, getTransmissionRiskScores(), false);
        SafeParcelWriter.writeInt(parcel, 9, getTransmissionRiskWeight());
        SafeParcelWriter.writeIntArray(parcel, 10, getDurationAtAttenuationThresholds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
