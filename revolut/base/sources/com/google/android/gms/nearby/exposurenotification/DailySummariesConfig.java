package com.google.android.gms.nearby.exposurenotification;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DailySummariesConfigCreator")
public class DailySummariesConfig extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DailySummariesConfig> CREATOR = new zzb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "internalGetReportTypeWeights", id = 1)
    final List f47888zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "internalGetInfectiousnessWeights", id = 2)
    final List f47889zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttenuationBucketThresholdDb", id = 3)
    final List f47890zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttenuationBucketWeights", id = 4)
    final List f47891zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDaysSinceExposureThreshold", id = 5)
    final int f47892zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMinimumWindowScore", id = 6)
    final double f47893zzf;

    public static final class DailySummariesConfigBuilder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        int f47894zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        double f47895zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private final Double[] f47896zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private final Double[] f47897zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private List f47898zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private List f47899zzf;

        public DailySummariesConfigBuilder() {
            Double[] dArr = new Double[6];
            this.f47896zzc = dArr;
            Double[] dArr2 = new Double[zzj.values().length];
            this.f47897zzd = dArr2;
            this.f47894zza = 0;
            this.f47895zzb = 0.0d;
            Double dValueOf = Double.valueOf(0.0d);
            Arrays.fill(dArr, dValueOf);
            Arrays.fill(dArr2, dValueOf);
        }

        private static void zza(List list, int i, String str) {
            Locale locale = Locale.ENGLISH;
            Preconditions.checkArgument(list != null, d.r(str, " must not be null"));
            Preconditions.checkArgument(list.size() == i, str + " must must contains " + i + " elements");
        }

        private static void zzb(double d, String str) {
            boolean z = false;
            if (d >= 0.0d && d <= 2.5d) {
                z = true;
            }
            Locale locale = Locale.ENGLISH;
            Preconditions.checkArgument(z, "Element value of " + str + " must between 0 ~ 2.5");
        }

        @NonNull
        public DailySummariesConfig build() {
            Preconditions.checkArgument(this.f47898zze != null, "Must set attenuationBucketThresholdDb");
            Preconditions.checkArgument(this.f47899zzf != null, "Must set attenuationBucketWeights");
            return new DailySummariesConfig(Arrays.asList(this.f47896zzc), Arrays.asList(this.f47897zzd), this.f47898zze, this.f47899zzf, this.f47894zza, this.f47895zzb);
        }

        @NonNull
        public DailySummariesConfigBuilder setAttenuationBuckets(@NonNull List<Integer> list, @NonNull List<Double> list2) {
            zza.zza();
            zza(list, 3, "attenuationBucketThresholdDb");
            for (int i = 0; i < list.size(); i++) {
                Preconditions.checkArgument(list.get(i).intValue() >= 0 && list.get(i).intValue() <= 255, "Element of attenuationBucketThreshold must between 0 ~ 255");
                if (i != 0) {
                    int i2 = i - 1;
                    boolean z = list.get(i2).intValue() < list.get(i).intValue();
                    Locale locale = Locale.ENGLISH;
                    Preconditions.checkArgument(z, "attenuationBucketThresholdDb of index " + i + " must be larger than index " + i2);
                }
            }
            this.f47898zze = new ArrayList(list);
            zza.zza();
            zza(list2, 4, "attenuationBucketWeights");
            Iterator<Double> it8 = list2.iterator();
            while (it8.hasNext()) {
                zzb(it8.next().doubleValue(), "attenuationBucketWeights");
            }
            this.f47899zzf = new ArrayList(list2);
            return this;
        }

        @NonNull
        public DailySummariesConfigBuilder setDaysSinceExposureThreshold(int i) {
            Preconditions.checkArgument(i >= 0, "daysSinceExposureThreshold must not be negative");
            this.f47894zza = i;
            return this;
        }

        @NonNull
        public DailySummariesConfigBuilder setInfectiousnessWeight(@Infectiousness int i, double d) {
            zzj zzjVarZza = zzj.zza(i);
            boolean z = false;
            if (zzjVarZza != null && zzjVarZza != zzj.INFECTIOUSNESS_NONE) {
                z = true;
            }
            Preconditions.checkArgument(z, "Incorrect value of infectiousness");
            zzb(d, "infectiousnessWeights");
            this.f47897zzd[i] = Double.valueOf(d);
            return this;
        }

        @NonNull
        public DailySummariesConfigBuilder setMinimumWindowScore(double d) {
            Preconditions.checkArgument(d >= 0.0d, "minimumWindowScore must not be negative");
            this.f47895zzb = d;
            return this;
        }

        @NonNull
        public DailySummariesConfigBuilder setReportTypeWeight(@ReportType int i, double d) {
            boolean z = false;
            if (i > 0 && i < 5) {
                z = true;
            }
            Preconditions.checkArgument(z, "Incorrect value of reportType");
            zzb(d, "reportTypeWeights");
            this.f47896zzc[i] = Double.valueOf(d);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DailySummariesConfig(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) List list2, @SafeParcelable.Param(id = 3) List list3, @SafeParcelable.Param(id = 4) List list4, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) double d) {
        this.f47888zza = list;
        this.f47889zzb = list2;
        this.f47890zzc = list3;
        this.f47891zzd = list4;
        this.f47892zze = i;
        this.f47893zzf = d;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof DailySummariesConfig) {
            DailySummariesConfig dailySummariesConfig = (DailySummariesConfig) obj2;
            if (this.f47888zza.equals(dailySummariesConfig.f47888zza) && this.f47889zzb.equals(dailySummariesConfig.f47889zzb) && this.f47890zzc.equals(dailySummariesConfig.f47890zzc) && this.f47891zzd.equals(dailySummariesConfig.f47891zzd) && this.f47892zze == dailySummariesConfig.f47892zze && this.f47893zzf == dailySummariesConfig.f47893zzf) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public List<Integer> getAttenuationBucketThresholdDb() {
        return new ArrayList(this.f47890zzc);
    }

    @NonNull
    public List<Double> getAttenuationBucketWeights() {
        return new ArrayList(this.f47891zzd);
    }

    public int getDaysSinceExposureThreshold() {
        return this.f47892zze;
    }

    @NonNull
    public Map<Integer, Double> getInfectiousnessWeights() {
        HashMap map = new HashMap();
        for (int i = 0; i < this.f47889zzb.size(); i++) {
            if (i != 0) {
                map.put(Integer.valueOf(i), (Double) this.f47889zzb.get(i));
            }
        }
        return map;
    }

    public double getMinimumWindowScore() {
        return this.f47893zzf;
    }

    @NonNull
    public Map<Integer, Double> getReportTypeWeights() {
        HashMap map = new HashMap();
        for (int i = 0; i < this.f47888zza.size(); i++) {
            if (i != 0 && i != 5) {
                map.put(Integer.valueOf(i), (Double) this.f47888zza.get(i));
            }
        }
        return map;
    }

    public int hashCode() {
        return Objects.hashCode(this.f47888zza, this.f47889zzb, this.f47890zzc, this.f47891zzd, Integer.valueOf(this.f47892zze), Double.valueOf(this.f47893zzf));
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "DailySummariesConfig<reportTypeWeights: %s, infectiousnessWeights: %s, attenuationBucketThresholdDb: %s, attenuationBucketWeights: %sdaysSinceExposureThreshold: %d,minimumWindowScore: %.3f>", this.f47888zza, this.f47889zzb, this.f47890zzc, this.f47891zzd, Integer.valueOf(this.f47892zze), Double.valueOf(this.f47893zzf));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDoubleList(parcel, 1, new ArrayList(this.f47888zza), false);
        SafeParcelWriter.writeDoubleList(parcel, 2, new ArrayList(this.f47889zzb), false);
        SafeParcelWriter.writeIntegerList(parcel, 3, getAttenuationBucketThresholdDb(), false);
        SafeParcelWriter.writeDoubleList(parcel, 4, getAttenuationBucketWeights(), false);
        SafeParcelWriter.writeInt(parcel, 5, getDaysSinceExposureThreshold());
        SafeParcelWriter.writeDouble(parcel, 6, getMinimumWindowScore());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
