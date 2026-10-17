package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 14, 1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzaf();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 1)
    private int f46486zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", id = 2)
    private long f46487zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", id = 3)
    private long f46488zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getMaxUpdateDelayMillis", id = 8)
    private long f46489zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 10)
    private long f46490zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", id = 6)
    private int f46491zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getMinUpdateDistanceMeters", id = 7)
    private float f46492zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", id = 9)
    private boolean f46493zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "-1", getter = "getMaxUpdateAgeMillis", id = 11)
    private long f46494zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 12)
    private final int f46495zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 13)
    private final int f46496zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 15)
    private final boolean f46497zzl;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 16)
    private final WorkSource zzm;

    @SafeParcelable.Field(getter = "getImpersonation", id = 17)
    private final ClientIdentity zzn;

    @Deprecated
    public LocationRequest() {
        this(102, CoreConstants.MILLIS_IN_ONE_HOUR, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, true, CoreConstants.MILLIS_IN_ONE_HOUR, 0, 0, false, new WorkSource(), null);
    }

    @NonNull
    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, CoreConstants.MILLIS_IN_ONE_HOUR, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, true, CoreConstants.MILLIS_IN_ONE_HOUR, 0, 0, false, new WorkSource(), null);
    }

    private static String zze(long j2) {
        return j2 == Long.MAX_VALUE ? "∞" : zzeo.zzb(j2);
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj2;
            if (this.f46486zza == locationRequest.f46486zza && ((isPassive() || this.f46487zzb == locationRequest.f46487zzb) && this.f46488zzc == locationRequest.f46488zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.f46489zzd == locationRequest.f46489zzd) && this.f46490zze == locationRequest.f46490zze && this.f46491zzf == locationRequest.f46491zzf && this.f46492zzg == locationRequest.f46492zzg && this.f46493zzh == locationRequest.f46493zzh && this.f46495zzj == locationRequest.f46495zzj && this.f46496zzk == locationRequest.f46496zzk && this.f46497zzl == locationRequest.f46497zzl && this.zzm.equals(locationRequest.zzm) && Objects.equal(this.zzn, locationRequest.zzn)))) {
                return true;
            }
        }
        return false;
    }

    public long getDurationMillis() {
        return this.f46490zze;
    }

    @Deprecated
    public long getExpirationTime() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f46490zze;
        long j3 = jElapsedRealtime + j2;
        if (((jElapsedRealtime ^ j3) & (j2 ^ j3)) < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    @Deprecated
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    public int getGranularity() {
        return this.f46495zzj;
    }

    @Deprecated
    public long getInterval() {
        return getIntervalMillis();
    }

    public long getIntervalMillis() {
        return this.f46487zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.f46494zzi;
    }

    public long getMaxUpdateDelayMillis() {
        return this.f46489zzd;
    }

    public int getMaxUpdates() {
        return this.f46491zzf;
    }

    @Deprecated
    public long getMaxWaitTime() {
        return Math.max(this.f46489zzd, this.f46487zzb);
    }

    public float getMinUpdateDistanceMeters() {
        return this.f46492zzg;
    }

    public long getMinUpdateIntervalMillis() {
        return this.f46488zzc;
    }

    @Deprecated
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    public int getPriority() {
        return this.f46486zza;
    }

    @Deprecated
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f46486zza), Long.valueOf(this.f46487zzb), Long.valueOf(this.f46488zzc), this.zzm);
    }

    public boolean isBatched() {
        long j2 = this.f46489zzd;
        return j2 > 0 && (j2 >> 1) >= this.f46487zzb;
    }

    @Deprecated
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    public boolean isPassive() {
        return this.f46486zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.f46493zzh;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationDuration(long j2) {
        Preconditions.checkArgument(j2 > 0, "durationMillis must be greater than 0");
        this.f46490zze = j2;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationTime(long j2) {
        this.f46490zze = Math.max(1L, j2 - SystemClock.elapsedRealtime());
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setFastestInterval(long j2) {
        Preconditions.checkArgument(j2 >= 0, "illegal fastest interval: %d", Long.valueOf(j2));
        this.f46488zzc = j2;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setInterval(long j2) {
        Preconditions.checkArgument(j2 >= 0, "intervalMillis must be greater than or equal to 0");
        long j3 = this.f46488zzc;
        long j5 = this.f46487zzb;
        if (j3 == j5 / 6) {
            this.f46488zzc = j2 / 6;
        }
        if (this.f46494zzi == j5) {
            this.f46494zzi = j2;
        }
        this.f46487zzb = j2;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setMaxWaitTime(long j2) {
        Preconditions.checkArgument(j2 >= 0, "illegal max wait time: %d", Long.valueOf(j2));
        this.f46489zzd = j2;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setNumUpdates(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.s(new StringBuilder(String.valueOf(i).length() + 20), "invalid numUpdates: ", i));
        }
        this.f46491zzf = i;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setPriority(int i) {
        zzan.zza(i);
        this.f46486zza = i;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            this.f46492zzg = f;
            return this;
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(f).length() + 22);
        sb6.append("invalid displacement: ");
        sb6.append(f);
        throw new IllegalArgumentException(sb6.toString());
    }

    @NonNull
    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.f46493zzh = z;
        return this;
    }

    @NonNull
    public String toString() {
        StringBuilder sbS = p.a.s("Request[");
        if (isPassive()) {
            sbS.append(zzan.zzb(this.f46486zza));
            if (this.f46489zzd > 0) {
                sbS.append("/");
                zzeo.zzc(this.f46489zzd, sbS);
            }
        } else {
            sbS.append("@");
            if (isBatched()) {
                zzeo.zzc(this.f46487zzb, sbS);
                sbS.append("/");
                zzeo.zzc(this.f46489zzd, sbS);
            } else {
                zzeo.zzc(this.f46487zzb, sbS);
            }
            sbS.append(" ");
            sbS.append(zzan.zzb(this.f46486zza));
        }
        if (isPassive() || this.f46488zzc != this.f46487zzb) {
            sbS.append(", minUpdateInterval=");
            sbS.append(zze(this.f46488zzc));
        }
        if (this.f46492zzg > 0.0d) {
            sbS.append(", minUpdateDistance=");
            sbS.append(this.f46492zzg);
        }
        if (!isPassive() ? this.f46494zzi != this.f46487zzb : this.f46494zzi != Long.MAX_VALUE) {
            sbS.append(", maxUpdateAge=");
            sbS.append(zze(this.f46494zzi));
        }
        if (this.f46490zze != Long.MAX_VALUE) {
            sbS.append(", duration=");
            zzeo.zzc(this.f46490zze, sbS);
        }
        if (this.f46491zzf != Integer.MAX_VALUE) {
            sbS.append(", maxUpdates=");
            sbS.append(this.f46491zzf);
        }
        if (this.f46496zzk != 0) {
            sbS.append(", ");
            sbS.append(zzar.zzb(this.f46496zzk));
        }
        if (this.f46495zzj != 0) {
            sbS.append(", ");
            sbS.append(zzq.zzb(this.f46495zzj));
        }
        if (this.f46493zzh) {
            sbS.append(", waitForAccurateLocation");
        }
        if (this.f46497zzl) {
            sbS.append(", bypass");
        }
        if (!WorkSourceUtil.isEmpty(this.zzm)) {
            sbS.append(", ");
            sbS.append(this.zzm);
        }
        if (this.zzn != null) {
            sbS.append(", impersonation=");
            sbS.append(this.zzn);
        }
        sbS.append(']');
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.f46496zzk);
        SafeParcelWriter.writeBoolean(parcel, 15, this.f46497zzl);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzn, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f46496zzk;
    }

    public final boolean zzb() {
        return this.f46497zzl;
    }

    @NonNull
    public final WorkSource zzc() {
        return this.zzm;
    }

    public final ClientIdentity zzd() {
        return this.zzn;
    }

    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f46498zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private long f46499zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private long f46500zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private long f46501zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private long f46502zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private int f46503zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private float f46504zzg;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private boolean f46505zzh;

        /* JADX INFO: renamed from: zzi, reason: collision with root package name */
        private long f46506zzi;

        /* JADX INFO: renamed from: zzj, reason: collision with root package name */
        private int f46507zzj;

        /* JADX INFO: renamed from: zzk, reason: collision with root package name */
        private int f46508zzk;

        /* JADX INFO: renamed from: zzl, reason: collision with root package name */
        private boolean f46509zzl;
        private WorkSource zzm;
        private ClientIdentity zzn;

        public Builder(int i, long j2) {
            this(j2);
            setPriority(i);
        }

        @NonNull
        public LocationRequest build() {
            int i = this.f46498zza;
            long j2 = this.f46499zzb;
            long jMin = this.f46500zzc;
            if (jMin == -1) {
                jMin = j2;
            } else if (i != 105) {
                jMin = Math.min(jMin, j2);
            }
            long jMax = Math.max(this.f46501zzd, this.f46499zzb);
            long j3 = this.f46502zze;
            int i2 = this.f46503zzf;
            float f = this.f46504zzg;
            boolean z = this.f46505zzh;
            long j5 = this.f46506zzi;
            if (j5 == -1) {
                j5 = this.f46499zzb;
            }
            return new LocationRequest(i, j2, jMin, jMax, Long.MAX_VALUE, j3, i2, f, z, j5, this.f46507zzj, this.f46508zzk, this.f46509zzl, new WorkSource(this.zzm), this.zzn);
        }

        @NonNull
        public Builder setDurationMillis(long j2) {
            Preconditions.checkArgument(j2 > 0, "durationMillis must be greater than 0");
            this.f46502zze = j2;
            return this;
        }

        @NonNull
        public Builder setGranularity(int i) {
            zzq.zza(i);
            this.f46507zzj = i;
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(long j2) {
            Preconditions.checkArgument(j2 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f46499zzb = j2;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j2) {
            boolean z = true;
            if (j2 != -1 && j2 < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f46506zzi = j2;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(long j2) {
            Preconditions.checkArgument(j2 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f46501zzd = j2;
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(int i) {
            Preconditions.checkArgument(i > 0, "maxUpdates must be greater than 0");
            this.f46503zzf = i;
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(float f) {
            Preconditions.checkArgument(f >= BitmapDescriptorFactory.HUE_RED, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f46504zzg = f;
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(long j2) {
            boolean z = true;
            if (j2 != -1 && j2 < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f46500zzc = j2;
            return this;
        }

        @NonNull
        public Builder setPriority(int i) {
            zzan.zza(i);
            this.f46498zza = i;
            return this;
        }

        @NonNull
        public Builder setWaitForAccurateLocation(boolean z) {
            this.f46505zzh = z;
            return this;
        }

        @NonNull
        public final Builder zza(int i) {
            zzar.zza(i);
            this.f46508zzk = i;
            return this;
        }

        @NonNull
        public final Builder zzb(boolean z) {
            this.f46509zzl = z;
            return this;
        }

        @NonNull
        public final Builder zzc(WorkSource workSource) {
            this.zzm = workSource;
            return this;
        }

        public Builder(long j2) {
            this.f46498zza = 102;
            this.f46500zzc = -1L;
            this.f46501zzd = 0L;
            this.f46502zze = Long.MAX_VALUE;
            this.f46503zzf = Integer.MAX_VALUE;
            this.f46504zzg = BitmapDescriptorFactory.HUE_RED;
            this.f46505zzh = true;
            this.f46506zzi = -1L;
            this.f46507zzj = 0;
            this.f46508zzk = 0;
            this.f46509zzl = false;
            this.zzm = null;
            this.zzn = null;
            setIntervalMillis(j2);
        }

        public Builder(@NonNull LocationRequest locationRequest) {
            this(locationRequest.getPriority(), locationRequest.getIntervalMillis());
            setMinUpdateIntervalMillis(locationRequest.getMinUpdateIntervalMillis());
            setMaxUpdateDelayMillis(locationRequest.getMaxUpdateDelayMillis());
            setDurationMillis(locationRequest.getDurationMillis());
            setMaxUpdates(locationRequest.getMaxUpdates());
            setMinUpdateDistanceMeters(locationRequest.getMinUpdateDistanceMeters());
            setWaitForAccurateLocation(locationRequest.isWaitForAccurateLocation());
            setMaxUpdateAgeMillis(locationRequest.getMaxUpdateAgeMillis());
            setGranularity(locationRequest.getGranularity());
            int iZza = locationRequest.zza();
            zzar.zza(iZza);
            this.f46508zzk = iZza;
            this.f46509zzl = locationRequest.zzb();
            this.zzm = locationRequest.zzc();
            ClientIdentity clientIdentityZzd = locationRequest.zzd();
            boolean z = true;
            if (clientIdentityZzd != null && clientIdentityZzd.zza()) {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.zzn = clientIdentityZzd;
        }
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) long j3, @SafeParcelable.Param(id = 8) long j5, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", id = 5) long j16, @SafeParcelable.Param(id = 10) long j22, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) float f, @SafeParcelable.Param(id = 9) boolean z, @SafeParcelable.Param(id = 11) long j42, @SafeParcelable.Param(id = 12) int i3, @SafeParcelable.Param(id = 13) int i5, @SafeParcelable.Param(id = 15) boolean z3, @SafeParcelable.Param(id = 16) WorkSource workSource, @SafeParcelable.Param(id = 17) ClientIdentity clientIdentity) {
        this.f46486zza = i;
        if (i == 105) {
            this.f46487zzb = Long.MAX_VALUE;
        } else {
            this.f46487zzb = j2;
        }
        this.f46488zzc = j3;
        this.f46489zzd = j5;
        this.f46490zze = j16 == Long.MAX_VALUE ? j22 : Math.min(Math.max(1L, j16 - SystemClock.elapsedRealtime()), j22);
        this.f46491zzf = i2;
        this.f46492zzg = f;
        this.f46493zzh = z;
        this.f46494zzi = j42 != -1 ? j42 : j2;
        this.f46495zzj = i3;
        this.f46496zzk = i5;
        this.f46497zzl = z3;
        this.zzm = workSource;
        this.zzn = clientIdentity;
    }
}
