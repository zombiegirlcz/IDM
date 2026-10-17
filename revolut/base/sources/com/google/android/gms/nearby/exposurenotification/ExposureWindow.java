package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzua;
import java.util.List;
import java.util.Locale;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ExposureWindowCreator")
public final class ExposureWindow extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ExposureWindow> CREATOR = new zzm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDateMillisSinceEpoch", id = 1)
    final long f47959zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getScanInstances", id = 2)
    final List f47960zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @ReportType
    @SafeParcelable.Field(getter = "getReportType", id = 3)
    final int f47961zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @Infectiousness
    @SafeParcelable.Field(getter = "getInfectiousness", id = 4)
    final int f47962zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @CalibrationConfidence
    @SafeParcelable.Field(getter = "getCalibrationConfidence", id = 5)
    final int f47963zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceName", id = 6)
    final String f47964zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @VariantOfConcern
    @SafeParcelable.Field(getter = "getVariantOfConcern", id = 7)
    final int f47965zzg;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private long f47966zza = 0;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private List f47967zzb = zzua.zzk();

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        @ReportType
        private int f47968zzc = 1;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        @Infectiousness
        private int f47969zzd = 1;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        @CalibrationConfidence
        private int f47970zze = 0;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        @VariantOfConcern
        private int f47971zzf = 0;

        @NonNull
        public ExposureWindow build() {
            return new ExposureWindow(this.f47966zza, this.f47967zzb, this.f47968zzc, this.f47969zzd, this.f47970zze, null, this.f47971zzf);
        }

        @NonNull
        public Builder setCalibrationConfidence(@CalibrationConfidence int i) {
            zzh zzhVar = zzh.LOWEST_CONFIDENCE;
            Preconditions.checkNotNull(i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : zzh.HIGH_CONFIDENCE : zzh.MEDIUM_CONFIDENCE : zzh.LOW_CONFIDENCE : zzh.LOWEST_CONFIDENCE, String.format(Locale.getDefault(), "calibrationConfidence (%d) is invalid", Integer.valueOf(i)));
            this.f47970zze = i;
            return this;
        }

        @NonNull
        public Builder setDateMillisSinceEpoch(long j2) {
            this.f47966zza = j2;
            return this;
        }

        @NonNull
        public Builder setInfectiousness(@Infectiousness int i) {
            Preconditions.checkNotNull(zzj.zza(i), String.format(Locale.getDefault(), "infectiousness (%d) is invalid", Integer.valueOf(i)));
            this.f47969zzd = i;
            return this;
        }

        @NonNull
        public Builder setReportType(@ReportType int i) {
            boolean z = false;
            if (i > 0 && i < 5) {
                z = true;
            }
            Preconditions.checkArgument(z, "reportType (%d) is not allowed", Integer.valueOf(i));
            this.f47968zzc = i;
            return this;
        }

        @NonNull
        public Builder setScanInstances(@NonNull List<ScanInstance> list) {
            this.f47967zzb = (List) Preconditions.checkNotNull(list);
            return this;
        }

        @NonNull
        public Builder setVariantOfConcern(@VariantOfConcern int i) {
            boolean z = false;
            if (i >= 0 && i <= 4) {
                z = true;
            }
            Preconditions.checkArgument(z, String.format(Locale.getDefault(), "variantOfConcern (%d) is not allowed", Integer.valueOf(i)));
            this.f47971zzf = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ExposureWindow(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) @ReportType int i, @Infectiousness @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) @CalibrationConfidence int i3, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) @VariantOfConcern int i5) {
        this.f47959zza = j2;
        this.f47960zzb = zzua.zzj(list);
        this.f47961zzc = i;
        this.f47962zzd = i2;
        this.f47963zze = i3;
        this.f47964zzf = str;
        this.f47965zzg = i5;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && ExposureWindow.class == obj2.getClass()) {
            ExposureWindow exposureWindow = (ExposureWindow) obj2;
            if (this.f47961zzc == exposureWindow.f47961zzc && this.f47959zza == exposureWindow.f47959zza && this.f47960zzb.equals(exposureWindow.f47960zzb) && this.f47962zzd == exposureWindow.f47962zzd && this.f47963zze == exposureWindow.f47963zze && Objects.equal(this.f47964zzf, exposureWindow.f47964zzf) && this.f47965zzg == exposureWindow.f47965zzg) {
                return true;
            }
        }
        return false;
    }

    @CalibrationConfidence
    public int getCalibrationConfidence() {
        return this.f47963zze;
    }

    public long getDateMillisSinceEpoch() {
        return this.f47959zza;
    }

    @Infectiousness
    public int getInfectiousness() {
        return this.f47962zzd;
    }

    @ReportType
    public int getReportType() {
        return this.f47961zzc;
    }

    @NonNull
    public List<ScanInstance> getScanInstances() {
        return this.f47960zzb;
    }

    @VariantOfConcern
    public int getVariantOfConcern() {
        return this.f47965zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f47959zza), this.f47960zzb, Integer.valueOf(this.f47961zzc), Integer.valueOf(this.f47962zzd), Integer.valueOf(this.f47963zze), this.f47964zzf, Integer.valueOf(this.f47965zzg));
    }

    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(this.f47960zzb);
        StringBuilder sb6 = new StringBuilder("ExposureWindow{dateMillisSinceEpoch=");
        sb6.append(this.f47959zza);
        sb6.append(", reportType=");
        sb6.append(this.f47961zzc);
        sb6.append(", scanInstances=");
        sb6.append(strValueOf);
        sb6.append(", infectiousness=");
        sb6.append(this.f47962zzd);
        sb6.append(", calibrationConfidence=");
        sb6.append(this.f47963zze);
        sb6.append(", deviceName=");
        return a.i(sb6, this.f47964zzf, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getDateMillisSinceEpoch());
        SafeParcelWriter.writeTypedList(parcel, 2, getScanInstances(), false);
        SafeParcelWriter.writeInt(parcel, 3, getReportType());
        SafeParcelWriter.writeInt(parcel, 4, getInfectiousness());
        SafeParcelWriter.writeInt(parcel, 5, getCalibrationConfidence());
        SafeParcelWriter.writeString(parcel, 6, this.f47964zzf, false);
        SafeParcelWriter.writeInt(parcel, 7, getVariantOfConcern());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
