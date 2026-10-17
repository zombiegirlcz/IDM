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
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ExposureSummaryCreator")
@Deprecated
public final class ExposureSummary extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ExposureSummary> CREATOR = new zzk();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDaysSinceLastExposure", id = 1)
    final int f47949zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMatchedKeyCount", id = 2)
    final int f47950zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMaximumRiskScore", id = 3)
    final int f47951zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttenuationDurationsInMinutes", id = 4)
    final int[] f47952zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSummationRiskScore", id = 5)
    final int f47953zze;

    public static final class ExposureSummaryBuilder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f47954zza = 0;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f47955zzb = 0;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f47956zzc = 0;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private int[] f47957zzd = {0, 0, 0};

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private int f47958zze = 0;

        @NonNull
        public ExposureSummary build() {
            return new ExposureSummary(this.f47954zza, this.f47955zzb, this.f47956zzc, this.f47957zzd, this.f47958zze);
        }

        @NonNull
        public ExposureSummaryBuilder setAttenuationDurations(@NonNull int[] iArr) {
            int length = iArr.length;
            Preconditions.checkArgument(length == 3);
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                Preconditions.checkArgument(i2 >= 0, "attenuationDuration (%s) must be >= 0", Integer.valueOf(i2));
            }
            this.f47957zzd = Arrays.copyOf(iArr, iArr.length);
            return this;
        }

        @NonNull
        public ExposureSummaryBuilder setDaysSinceLastExposure(int i) {
            Preconditions.checkArgument(i >= 0, "daysSinceLastExposure (%s) must be >= 0", Integer.valueOf(i));
            this.f47954zza = i;
            return this;
        }

        @NonNull
        public ExposureSummaryBuilder setMatchedKeyCount(int i) {
            Preconditions.checkArgument(i >= 0, "matchedKeyCount (%s) must be >= 0", Integer.valueOf(i));
            this.f47955zzb = i;
            return this;
        }

        @NonNull
        public ExposureSummaryBuilder setMaximumRiskScore(int i) {
            boolean z = false;
            if (i >= 0 && i <= 4096) {
                z = true;
            }
            Preconditions.checkArgument(z, "maximumRiskScore (%s) must be >= 0 and <= 4096", Integer.valueOf(i));
            this.f47956zzc = i;
            return this;
        }

        @NonNull
        public ExposureSummaryBuilder setSummationRiskScore(int i) {
            Preconditions.checkArgument(i >= 0, "summationRiskScore (%s) must be >= 0", Integer.valueOf(i));
            this.f47958zze = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ExposureSummary(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int[] iArr, @SafeParcelable.Param(id = 5) int i5) {
        this.f47949zza = i;
        this.f47950zzb = i2;
        this.f47951zzc = i3;
        this.f47952zzd = iArr;
        this.f47953zze = i5;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof ExposureSummary) {
            ExposureSummary exposureSummary = (ExposureSummary) obj2;
            if (Objects.equal(Integer.valueOf(this.f47949zza), Integer.valueOf(exposureSummary.getDaysSinceLastExposure())) && Objects.equal(Integer.valueOf(this.f47950zzb), Integer.valueOf(exposureSummary.getMatchedKeyCount())) && Objects.equal(Integer.valueOf(this.f47951zzc), Integer.valueOf(exposureSummary.getMaximumRiskScore())) && Arrays.equals(this.f47952zzd, exposureSummary.getAttenuationDurationsInMinutes()) && Objects.equal(Integer.valueOf(this.f47953zze), Integer.valueOf(exposureSummary.getSummationRiskScore()))) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public int[] getAttenuationDurationsInMinutes() {
        int[] iArr = this.f47952zzd;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getDaysSinceLastExposure() {
        return this.f47949zza;
    }

    public int getMatchedKeyCount() {
        return this.f47950zzb;
    }

    public int getMaximumRiskScore() {
        return this.f47951zzc;
    }

    public int getSummationRiskScore() {
        return this.f47953zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47949zza), Integer.valueOf(this.f47950zzb), Integer.valueOf(this.f47951zzc), this.f47952zzd, Integer.valueOf(this.f47953zze));
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        int i = this.f47949zza;
        int i2 = this.f47950zzb;
        int i3 = this.f47951zzc;
        String string = Arrays.toString(this.f47952zzd);
        int i5 = this.f47953zze;
        StringBuilder sbW = a.w("ExposureSummary<daysSinceLastExposure: ", i, i2, ", matchedKeyCount: ", ", maximumRiskScore: ");
        sbW.append(i3);
        sbW.append(", attenuationDurations: ");
        sbW.append(string);
        sbW.append(", summationRiskScore: ");
        return j6.a.v(sbW, ">", i5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getDaysSinceLastExposure());
        SafeParcelWriter.writeInt(parcel, 2, getMatchedKeyCount());
        SafeParcelWriter.writeInt(parcel, 3, getMaximumRiskScore());
        SafeParcelWriter.writeIntArray(parcel, 4, getAttenuationDurationsInMinutes(), false);
        SafeParcelWriter.writeInt(parcel, 5, getSummationRiskScore());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
