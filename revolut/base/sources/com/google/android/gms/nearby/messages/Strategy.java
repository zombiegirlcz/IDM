package com.google.android.gms.nearby.messages;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j6.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "StrategyCreator")
public class Strategy extends AbstractSafeParcelable {

    @NonNull
    @Deprecated
    public static final Strategy BLE_ONLY;

    @NonNull
    public static final Parcelable.Creator<Strategy> CREATOR = new zzf();

    @NonNull
    public static final Strategy DEFAULT = new Builder().build();
    public static final int DISCOVERY_MODE_BROADCAST = 1;
    public static final int DISCOVERY_MODE_DEFAULT = 3;
    public static final int DISCOVERY_MODE_SCAN = 2;
    public static final int DISTANCE_TYPE_DEFAULT = 0;
    public static final int DISTANCE_TYPE_EARSHOT = 1;
    public static final int TTL_SECONDS_DEFAULT = 300;
    public static final int TTL_SECONDS_INFINITE = Integer.MAX_VALUE;
    public static final int TTL_SECONDS_MAX = 86400;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    @ShowFirstParty
    @Deprecated
    public static final Strategy f48037zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    final int f48038zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    @Deprecated
    final int f48039zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f48040zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f48041zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    @Deprecated
    final boolean f48042zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDiscoveryMedium", id = 5)
    final int f48043zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDiscoveryMode", id = 6)
    final int f48044zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBackgroundScanMode", id = 7)
    private final int f48045zzi;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f48046zza = 3;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f48047zzb = 300;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f48048zzc = 0;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private int f48049zzd = -1;

        @NonNull
        public Strategy build() {
            if (this.f48049zzd == 2 && this.f48048zzc == 1) {
                throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
            }
            return new Strategy(2, 0, this.f48047zzb, this.f48048zzc, false, this.f48049zzd, this.f48046zza, 0);
        }

        @NonNull
        public Builder setDiscoveryMode(int i) {
            this.f48046zza = i;
            return this;
        }

        @NonNull
        public Builder setDistanceType(int i) {
            this.f48048zzc = i;
            return this;
        }

        @NonNull
        public Builder setTtlSeconds(int i) {
            boolean z = true;
            if (i != Integer.MAX_VALUE && (i <= 0 || i > 86400)) {
                z = false;
            }
            Preconditions.checkArgument(z, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), 86400);
            this.f48047zzb = i;
            return this;
        }

        @NonNull
        @ShowFirstParty
        public final Builder zza(int i) {
            this.f48049zzd = 2;
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.zza(2);
        builder.setTtlSeconds(Integer.MAX_VALUE);
        Strategy strategyBuild = builder.build();
        BLE_ONLY = strategyBuild;
        f48037zza = strategyBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000b A[PHI: r8
      0x000b: PHI (r8v2 int) = (r8v0 int), (r8v1 int) binds: [B:3:0x0009, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Strategy(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1000) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) int r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) int r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.f48038zzb = r2
            r1.f48039zzc = r3
            r2 = 1
            r0 = 2
            if (r3 != 0) goto Le
        Lb:
            r1.f48044zzh = r8
            goto L19
        Le:
            if (r3 == r0) goto L17
            r8 = 3
            if (r3 == r8) goto L14
            goto Lb
        L14:
            r1.f48044zzh = r0
            goto L19
        L17:
            r1.f48044zzh = r2
        L19:
            r1.f48041zze = r5
            r1.f48042zzf = r6
            if (r6 == 0) goto L27
            r1.f48043zzg = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.f48040zzd = r2
            goto L38
        L27:
            r1.f48040zzd = r4
            r3 = -1
            if (r7 == r3) goto L36
            if (r7 == 0) goto L36
            if (r7 == r2) goto L36
            r2 = 6
            if (r7 == r2) goto L36
            r1.f48043zzg = r7
            goto L38
        L36:
            r1.f48043zzg = r3
        L38:
            r1.f48045zzi = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.Strategy.<init>(int, int, int, int, boolean, int, int, int):void");
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj2;
        return this.f48038zzb == strategy.f48038zzb && this.f48044zzh == strategy.f48044zzh && this.f48040zzd == strategy.f48040zzd && this.f48041zze == strategy.f48041zze && this.f48043zzg == strategy.f48043zzg && this.f48045zzi == strategy.f48045zzi;
    }

    public int hashCode() {
        return (((((((((this.f48038zzb * 31) + this.f48044zzh) * 31) + this.f48040zzd) * 31) + this.f48041zze) * 31) + this.f48043zzg) * 31) + this.f48045zzi;
    }

    @NonNull
    public String toString() {
        String strN;
        String strN2;
        int i = this.f48041zze;
        String strN3 = i != 0 ? i != 1 ? d.n("UNKNOWN:", i) : "EARSHOT" : "DEFAULT";
        int i2 = this.f48043zzg;
        if (i2 == -1) {
            strN = "DEFAULT";
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i2 & 2) > 0) {
                arrayList.add("BLE");
            }
            strN = arrayList.isEmpty() ? d.n("UNKNOWN:", i2) : arrayList.toString();
        }
        int i3 = this.f48044zzh;
        if (i3 == 3) {
            strN2 = "DEFAULT";
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i3 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i3 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            strN2 = arrayList2.isEmpty() ? d.n("UNKNOWN:", i3) : arrayList2.toString();
        }
        int i5 = this.f48045zzi;
        String strN4 = i5 != 0 ? i5 != 1 ? d.n("UNKNOWN: ", i5) : "ALWAYS_ON" : "DEFAULT";
        int i6 = this.f48040zzd;
        StringBuilder sb6 = new StringBuilder("Strategy{ttlSeconds=");
        sb6.append(i6);
        sb6.append(", distanceType=");
        sb6.append(strN3);
        sb6.append(", discoveryMedium=");
        a.D(sb6, strN, ", discoveryMode=", strN2, ", backgroundScanMode=");
        return v0.a.i(sb6, strN4, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f48039zzc;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f48040zzd);
        SafeParcelWriter.writeInt(parcel, 3, this.f48041zze);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f48042zzf);
        SafeParcelWriter.writeInt(parcel, 5, this.f48043zzg);
        SafeParcelWriter.writeInt(parcel, 6, this.f48044zzh);
        SafeParcelWriter.writeInt(parcel, 7, this.f48045zzi);
        SafeParcelWriter.writeInt(parcel, 1000, this.f48038zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f48045zzi;
    }
}
