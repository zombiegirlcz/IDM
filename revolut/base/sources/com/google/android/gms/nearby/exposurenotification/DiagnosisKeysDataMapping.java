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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DiagnosisKeysDataMappingCreator")
public class DiagnosisKeysDataMapping extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DiagnosisKeysDataMapping> CREATOR = new zzd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "internalGetDaysSinceOnsetToInfectiousness", id = 1)
    final List f47909zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @ReportType
    @SafeParcelable.Field(getter = "getReportTypeWhenMissing", id = 2)
    final int f47910zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @Infectiousness
    @SafeParcelable.Field(getter = "getInfectiousnessWhenDaysSinceOnsetMissing", id = 3)
    final int f47911zzc;

    public static final class DiagnosisKeysDataMappingBuilder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private List f47912zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        @ReportType
        private int f47913zzb = 0;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        @Infectiousness
        private Integer f47914zzc;

        @NonNull
        public DiagnosisKeysDataMapping build() {
            Preconditions.checkArgument(this.f47912zza != null, "Must set daysSinceOnsetToInfectiousness");
            Preconditions.checkArgument(this.f47913zzb != 0, "Must set reportTypeWhenMissing");
            Preconditions.checkArgument(this.f47914zzc != null, "Must set infectiousnessWhenDaysSinceOnsetMissing");
            return new DiagnosisKeysDataMapping(this.f47912zza, this.f47913zzb, this.f47914zzc.intValue());
        }

        @NonNull
        public DiagnosisKeysDataMappingBuilder setDaysSinceOnsetToInfectiousness(@NonNull Map<Integer, Integer> map) {
            Preconditions.checkArgument(map != null, "daysSinceOnsetToInfectiousness must not be null.");
            Preconditions.checkArgument(map.size() <= 29, "the size of daysSinceOnsetToInfectiousness exceeds maximum size %d.", 29);
            Integer[] numArr = new Integer[29];
            Arrays.fill((Object[]) numArr, (Object) 0);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer key = entry.getKey();
                int iIntValue = key.intValue();
                Integer value = entry.getValue();
                int iIntValue2 = value.intValue();
                Preconditions.checkArgument(Math.abs(iIntValue) <= 14, "Invalid day since onset %d", key);
                Preconditions.checkArgument(zzj.zza(iIntValue2) != null, "Invalid value of Infectiousness %d", value);
                numArr[iIntValue + 14] = value;
            }
            this.f47912zza = Arrays.asList(numArr);
            return this;
        }

        @NonNull
        public DiagnosisKeysDataMappingBuilder setInfectiousnessWhenDaysSinceOnsetMissing(@Infectiousness int i) {
            zzj zzjVarZza = zzj.zza(i);
            Integer numValueOf = Integer.valueOf(i);
            Preconditions.checkArgument(zzjVarZza != null, "Invalid value of Infectiousness %d", numValueOf);
            this.f47914zzc = numValueOf;
            return this;
        }

        @NonNull
        public DiagnosisKeysDataMappingBuilder setReportTypeWhenMissing(@ReportType int i) {
            Preconditions.checkArgument(i != 0, "Invalid reportTypeWhenMissing value");
            Preconditions.checkArgument(i >= 0 && i <= 5, "Invalid value of ReportType %d", Integer.valueOf(i));
            this.f47913zzb = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DiagnosisKeysDataMapping(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) @ReportType int i, @Infectiousness @SafeParcelable.Param(id = 3) int i2) {
        this.f47909zza = list;
        this.f47910zzb = i;
        this.f47911zzc = i2;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof DiagnosisKeysDataMapping) {
            DiagnosisKeysDataMapping diagnosisKeysDataMapping = (DiagnosisKeysDataMapping) obj2;
            if (this.f47909zza.equals(diagnosisKeysDataMapping.f47909zza) && this.f47910zzb == diagnosisKeysDataMapping.f47910zzb && this.f47911zzc == diagnosisKeysDataMapping.f47911zzc) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Map<Integer, Integer> getDaysSinceOnsetToInfectiousness() {
        HashMap map = new HashMap((int) Math.ceil(38.666666666666664d));
        for (int i = 0; i < this.f47909zza.size(); i++) {
            map.put(Integer.valueOf(i - 14), (Integer) this.f47909zza.get(i));
        }
        return map;
    }

    @Infectiousness
    public int getInfectiousnessWhenDaysSinceOnsetMissing() {
        return this.f47911zzc;
    }

    @ReportType
    public int getReportTypeWhenMissing() {
        return this.f47910zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f47909zza, Integer.valueOf(this.f47910zzb), Integer.valueOf(this.f47911zzc));
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "DiagnosisKeysDataMapping<daysSinceOnsetToInfectiousness: %s, reportTypeWhenMissing: %d, infectiousnessWhenDaysSinceOnsetMissing: %d>", getDaysSinceOnsetToInfectiousness(), Integer.valueOf(this.f47910zzb), Integer.valueOf(this.f47911zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, new ArrayList(this.f47909zza), false);
        SafeParcelWriter.writeInt(parcel, 2, getReportTypeWhenMissing());
        SafeParcelWriter.writeInt(parcel, 3, getInfectiousnessWhenDaysSinceOnsetMissing());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
