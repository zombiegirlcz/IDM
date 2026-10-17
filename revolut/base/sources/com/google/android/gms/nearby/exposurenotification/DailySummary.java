package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DailySummaryCreator")
public class DailySummary extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DailySummary> CREATOR = new zzc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDaysSinceEpoch", id = 1)
    final int f47900zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getReportSummaries", id = 2)
    final List f47901zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSummaryData", id = 3)
    final ExposureSummaryData f47902zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceName", id = 4)
    final String f47903zzd;

    @SafeParcelable.Class(creator = "ExposureSummaryDataCreator")
    public static class ExposureSummaryData extends AbstractSafeParcelable implements ReflectedParcelable {

        @NonNull
        public static final Parcelable.Creator<ExposureSummaryData> CREATOR = new zzl();

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getMaximumScore", id = 1)
        final double f47904zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getScoreSum", id = 2)
        final double f47905zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getWeightedDurationSum", id = 3)
        final double f47906zzc;

        @SafeParcelable.Constructor
        public ExposureSummaryData(@SafeParcelable.Param(id = 1) double d, @SafeParcelable.Param(id = 2) double d5, @SafeParcelable.Param(id = 3) double d6) {
            this.f47904zza = d;
            this.f47905zzb = d5;
            this.f47906zzc = d6;
        }

        public boolean equals(Object obj2) {
            if (obj2 instanceof ExposureSummaryData) {
                ExposureSummaryData exposureSummaryData = (ExposureSummaryData) obj2;
                if (this.f47904zza == exposureSummaryData.f47904zza && this.f47905zzb == exposureSummaryData.f47905zzb && this.f47906zzc == exposureSummaryData.f47906zzc) {
                    return true;
                }
            }
            return false;
        }

        public double getMaximumScore() {
            return this.f47904zza;
        }

        public double getScoreSum() {
            return this.f47905zzb;
        }

        public double getWeightedDurationSum() {
            return this.f47906zzc;
        }

        public int hashCode() {
            return Objects.hashCode(Double.valueOf(this.f47904zza), Double.valueOf(this.f47905zzb), Double.valueOf(this.f47906zzc));
        }

        @NonNull
        public String toString() {
            return String.format(Locale.US, "ExposureSummaryData<maximumScore: %.3f, scoreSum: %.3f, weightedDurationSum: %.3f>", Double.valueOf(this.f47904zza), Double.valueOf(this.f47905zzb), Double.valueOf(this.f47906zzc));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeDouble(parcel, 1, getMaximumScore());
            SafeParcelWriter.writeDouble(parcel, 2, getScoreSum());
            SafeParcelWriter.writeDouble(parcel, 3, getWeightedDurationSum());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    public DailySummary(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) ExposureSummaryData exposureSummaryData, @SafeParcelable.Param(id = 4) String str) {
        this.f47900zza = i;
        this.f47901zzb = list;
        this.f47902zzc = exposureSummaryData;
        this.f47903zzd = str;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof DailySummary) {
            DailySummary dailySummary = (DailySummary) obj2;
            if (this.f47900zza == dailySummary.f47900zza && this.f47901zzb.equals(dailySummary.f47901zzb) && Objects.equal(this.f47902zzc, dailySummary.f47902zzc) && Objects.equal(this.f47903zzd, dailySummary.f47903zzd)) {
                return true;
            }
        }
        return false;
    }

    public int getDaysSinceEpoch() {
        return this.f47900zza;
    }

    @NonNull
    public ExposureSummaryData getSummaryData() {
        return this.f47902zzc;
    }

    @NonNull
    public ExposureSummaryData getSummaryDataForReportType(@ReportType int i) {
        return (ExposureSummaryData) this.f47901zzb.get(i);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47900zza), this.f47901zzb, this.f47902zzc, this.f47903zzd);
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "DailySummary<daysSinceEpoch: %d, reportSummaries: %s, daySummary: %s, deviceName: %s>", Integer.valueOf(this.f47900zza), this.f47901zzb, this.f47902zzc, this.f47903zzd);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getDaysSinceEpoch());
        SafeParcelWriter.writeTypedList(parcel, 2, this.f47901zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getSummaryData(), i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47903zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
