package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Hex;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "TemporaryExposureKeyCreator")
public final class TemporaryExposureKey extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TemporaryExposureKey> CREATOR = new zzp();
    public static final int DAYS_SINCE_ONSET_OF_SYMPTOMS_UNKNOWN = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getKeyData", id = 1)
    final byte[] f47980zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRollingStartIntervalNumber", id = 2)
    final int f47981zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @RiskLevel
    @SafeParcelable.Field(getter = "getTransmissionRiskLevel", id = 3)
    final int f47982zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRollingPeriod", id = 4)
    final int f47983zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @ReportType
    @SafeParcelable.Field(getter = "getReportType", id = 5)
    final int f47984zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDaysSinceOnsetOfSymptoms", id = 6)
    final int f47985zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getVariantOfConcern", id = 7)
    final int f47986zzg;

    public static final class TemporaryExposureKeyBuilder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private byte[] f47987zza = new byte[0];

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f47988zzb = 0;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        @RiskLevel
        private int f47989zzc = 0;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private int f47990zzd = 1;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        @ReportType
        private int f47991zze = 0;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private int f47992zzf = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private int f47993zzg = 0;

        @NonNull
        public TemporaryExposureKey build() {
            return new TemporaryExposureKey(this.f47987zza, this.f47988zzb, this.f47989zzc, this.f47990zzd, this.f47991zze, this.f47992zzf, this.f47993zzg);
        }

        @NonNull
        public TemporaryExposureKeyBuilder setDaysSinceOnsetOfSymptoms(int i) {
            boolean z = false;
            if (i >= -14 && i <= 14) {
                z = true;
            }
            Preconditions.checkArgument(z, "daysSinceOnsetOfSymptoms (%d) must be >= -14 and <= 14", Integer.valueOf(i));
            this.f47992zzf = i;
            return this;
        }

        @NonNull
        public TemporaryExposureKeyBuilder setKeyData(@NonNull byte[] bArr) {
            this.f47987zza = Arrays.copyOf(bArr, bArr.length);
            return this;
        }

        @NonNull
        public TemporaryExposureKeyBuilder setReportType(@ReportType int i) {
            boolean z = false;
            if (i >= 0 && i <= 5) {
                z = true;
            }
            Preconditions.checkArgument(z, String.format(Locale.getDefault(), "reportType (%d) is invalid", Integer.valueOf(i)));
            this.f47991zze = i;
            return this;
        }

        @NonNull
        public TemporaryExposureKeyBuilder setRollingPeriod(int i) {
            Preconditions.checkArgument(i > 0, "rollingPeriod (%s) must be > 0", Integer.valueOf(i));
            this.f47990zzd = i;
            return this;
        }

        @NonNull
        public TemporaryExposureKeyBuilder setRollingStartIntervalNumber(int i) {
            Preconditions.checkArgument(i >= 0, "rollingStartIntervalNumber (%s) must be >= 0", Integer.valueOf(i));
            this.f47988zzb = i;
            return this;
        }

        @NonNull
        public TemporaryExposureKeyBuilder setTransmissionRiskLevel(@RiskLevel int i) {
            boolean z = false;
            if (i >= 0 && i <= 8) {
                z = true;
            }
            Preconditions.checkArgument(z, "transmissionRiskLevel (%s) must be >= 0 and <= 8", Integer.valueOf(i));
            this.f47989zzc = i;
            return this;
        }

        @NonNull
        public TemporaryExposureKeyBuilder setVariantOfConcern(@VariantOfConcern int i) {
            boolean z = false;
            if (i >= 0 && i <= 4) {
                z = true;
            }
            Preconditions.checkArgument(z, String.format(Locale.getDefault(), "variantOfConcern (%d) is not allowed", Integer.valueOf(i)));
            this.f47993zzg = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public TemporaryExposureKey(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) int i, @RiskLevel @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) @ReportType int i5, @SafeParcelable.Param(id = 6) int i6, @SafeParcelable.Param(id = 7) int i21) {
        this.f47980zza = bArr;
        this.f47981zzb = i;
        this.f47982zzc = i2;
        this.f47983zzd = i3;
        this.f47984zze = i5;
        this.f47985zzf = i6;
        this.f47986zzg = i21;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof TemporaryExposureKey) {
            TemporaryExposureKey temporaryExposureKey = (TemporaryExposureKey) obj2;
            if (Arrays.equals(this.f47980zza, temporaryExposureKey.getKeyData()) && Objects.equal(Integer.valueOf(this.f47981zzb), Integer.valueOf(temporaryExposureKey.getRollingStartIntervalNumber())) && Objects.equal(Integer.valueOf(this.f47982zzc), Integer.valueOf(temporaryExposureKey.getTransmissionRiskLevel())) && Objects.equal(Integer.valueOf(this.f47983zzd), Integer.valueOf(temporaryExposureKey.getRollingPeriod())) && Objects.equal(Integer.valueOf(this.f47984zze), Integer.valueOf(temporaryExposureKey.getReportType())) && this.f47985zzf == temporaryExposureKey.f47985zzf && this.f47986zzg == temporaryExposureKey.f47986zzg) {
                return true;
            }
        }
        return false;
    }

    public int getDaysSinceOnsetOfSymptoms() {
        return this.f47985zzf;
    }

    @NonNull
    public byte[] getKeyData() {
        byte[] bArr = this.f47980zza;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @ReportType
    public int getReportType() {
        return this.f47984zze;
    }

    public int getRollingPeriod() {
        return this.f47983zzd;
    }

    public int getRollingStartIntervalNumber() {
        return this.f47981zzb;
    }

    @RiskLevel
    public int getTransmissionRiskLevel() {
        return this.f47982zzc;
    }

    public int getVariantOfConcern() {
        return this.f47986zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f47980zza)), Integer.valueOf(this.f47981zzb), Integer.valueOf(this.f47982zzc), Integer.valueOf(this.f47983zzd), Integer.valueOf(this.f47984zze), Integer.valueOf(this.f47985zzf), Integer.valueOf(this.f47986zzg));
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        String strBytesToStringLowercase = Hex.bytesToStringLowercase(this.f47980zza);
        Date date = new Date(TimeUnit.MINUTES.toMillis(((long) this.f47981zzb) * 10));
        Integer numValueOf = Integer.valueOf(this.f47982zzc);
        Integer numValueOf2 = Integer.valueOf(this.f47983zzd);
        Integer numValueOf3 = Integer.valueOf(this.f47984zze);
        int i = this.f47985zzf;
        return String.format(locale, "TemporaryExposureKey<keyData: %s, rollingStartIntervalNumber: %s, transmissionRiskLevel: %d, rollingPeriod: %d, reportType: %d, daysSinceOnsetOfSymptoms: %s>", strBytesToStringLowercase, date, numValueOf, numValueOf2, numValueOf3, i == Integer.MAX_VALUE ? "unknown" : Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, getKeyData(), false);
        SafeParcelWriter.writeInt(parcel, 2, getRollingStartIntervalNumber());
        SafeParcelWriter.writeInt(parcel, 3, getTransmissionRiskLevel());
        SafeParcelWriter.writeInt(parcel, 4, getRollingPeriod());
        SafeParcelWriter.writeInt(parcel, 5, getReportType());
        SafeParcelWriter.writeInt(parcel, 6, getDaysSinceOnsetOfSymptoms());
        SafeParcelWriter.writeInt(parcel, 7, getVariantOfConcern());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
