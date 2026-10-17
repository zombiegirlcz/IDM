package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import ch.qos.logback.classic.Level;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.nearby.zzua;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
public final class UwbRangeDataNtfConfig {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzua f48252zza = zzua.zzo(0, 1, 2, 3);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @RangeDataNtfConfig
    private final int f48253zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f48254zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f48255zzd;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f48256zza = 1;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f48257zzb = 0;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f48258zzc = Level.INFO_INT;

        @NonNull
        public UwbRangeDataNtfConfig build() {
            return new UwbRangeDataNtfConfig(this.f48256zza, this.f48257zzb, this.f48258zzc, null);
        }

        @NonNull
        public Builder setNtfProximityFar(int i) {
            this.f48258zzc = i;
            return this;
        }

        @NonNull
        public Builder setNtfProximityNear(int i) {
            this.f48257zzb = i;
            return this;
        }

        @NonNull
        public Builder setRangeDataConfigType(int i) {
            this.f48256zza = i;
            return this;
        }
    }

    public @interface RangeDataNtfConfig {
        public static final int RANGE_DATA_NTF_DISABLE = 0;
        public static final int RANGE_DATA_NTF_ENABLE = 1;
        public static final int RANGE_DATA_NTF_ENABLE_PROXIMITY_EDGE_TRIG = 3;
        public static final int RANGE_DATA_NTF_ENABLE_PROXIMITY_LEVEL_TRIG = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UwbRangeDataNtfConfig(int r4, int r5, int r6, com.google.android.gms.nearby.uwb.zzf r7) {
        /*
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.nearby.zzua r7 = com.google.android.gms.nearby.uwb.UwbRangeDataNtfConfig.f48252zza
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r7 = r7.contains(r0)
            java.lang.String r0 = "Invalid/unsupported range data notification config"
            com.google.android.gms.internal.nearby.zztq.zze(r7, r0)
            r7 = 1
            r0 = 0
            if (r5 > r6) goto L18
            r1 = r7
            goto L19
        L18:
            r1 = r0
        L19:
            java.lang.String r2 = "Proximity near cannot be greater than proximity far"
            com.google.android.gms.internal.nearby.zztq.zze(r1, r2)
            if (r4 == r7) goto L23
            if (r4 != 0) goto L35
            r4 = r0
        L23:
            if (r5 != 0) goto L2f
            r5 = 20000(0x4e20, float:2.8026E-41)
            if (r6 != r5) goto L2c
            r6 = r5
            r5 = r0
            goto L30
        L2c:
            r5 = r0
            r7 = r5
            goto L30
        L2f:
            r7 = r0
        L30:
            java.lang.String r0 = "Proximity near and far distances are not set to default"
            com.google.android.gms.internal.nearby.zztq.zze(r7, r0)
        L35:
            r3.f48253zzb = r4
            r3.f48254zzc = r5
            r3.f48255zzd = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.uwb.UwbRangeDataNtfConfig.<init>(int, int, int, com.google.android.gms.nearby.uwb.zzf):void");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UwbRangeDataNtfConfig)) {
            return false;
        }
        UwbRangeDataNtfConfig uwbRangeDataNtfConfig = (UwbRangeDataNtfConfig) obj2;
        return this.f48253zzb == uwbRangeDataNtfConfig.f48253zzb && this.f48254zzc == uwbRangeDataNtfConfig.f48254zzc && this.f48255zzd == uwbRangeDataNtfConfig.f48255zzd;
    }

    public int getNtfProximityFar() {
        return this.f48255zzd;
    }

    public int getNtfProximityNear() {
        return this.f48254zzc;
    }

    public int getRangeDataNtfConfigType() {
        return this.f48253zzb;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48253zzb), Integer.valueOf(this.f48254zzc), Integer.valueOf(this.f48255zzd));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb6 = new StringBuilder("UwbRangeDataNtfConfig{mRangeDataNtfConfigType=");
        sb6.append(this.f48253zzb);
        sb6.append(", mNtfProximityNear=");
        sb6.append(this.f48254zzc);
        sb6.append(", mNtfProximityFar=");
        return a.v(sb6, "}", this.f48255zzd);
    }
}
