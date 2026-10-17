package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.uwb.UwbRangeDataNtfConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class RangingParameters {
    public static final int SESSION_ID_UNSET = 0;
    public static final int SLOT_DURATION_DEFAULT = 2;
    public static final int SUB_SESSION_ID_UNSET = 0;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final byte[] f48217zza = {7, 8, 1, 2, 3, 4, 5, 6};

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @UwbConfigId
    private final int f48218zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f48219zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f48220zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final byte[] f48221zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final byte[] f48222zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final UwbComplexChannel f48223zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final List f48224zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @RangingUpdateRate
    private final int f48225zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @NonNull
    private final UwbRangeDataNtfConfig f48226zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SlotDuration
    private final int f48227zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final boolean f48228zzl;

    public static class Builder {

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private byte[] f48234zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private UwbComplexChannel f48235zzg;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        @UwbConfigId
        private int f48230zzb = 0;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f48231zzc = 0;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private int f48232zzd = 0;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private byte[] f48233zze = RangingParameters.f48217zza;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private final List f48236zzh = new ArrayList();

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        @RangingUpdateRate
        int f48229zza = 3;

        /* JADX INFO: renamed from: zzi, reason: collision with root package name */
        private UwbRangeDataNtfConfig f48237zzi = new UwbRangeDataNtfConfig.Builder().build();

        /* JADX INFO: renamed from: zzj, reason: collision with root package name */
        @SlotDuration
        private int f48238zzj = 2;

        /* JADX INFO: renamed from: zzk, reason: collision with root package name */
        private boolean f48239zzk = false;

        @NonNull
        public Builder addPeerDevice(@NonNull UwbDevice uwbDevice) {
            Preconditions.checkNotNull(uwbDevice, "peerDevice cannot be null.");
            this.f48236zzh.add(uwbDevice);
            return this;
        }

        @NonNull
        public RangingParameters build() {
            int length;
            int length2;
            int length3;
            boolean z = true;
            Preconditions.checkArgument(!this.f48236zzh.isEmpty(), "At least 1 peer device must be set.");
            Preconditions.checkArgument(this.f48230zzb != 0);
            Preconditions.checkArgument(this.f48229zza != 0);
            int i = this.f48230zzb;
            if (i == 1 || i == 2 || i == 3 || i == 1000 || i == 1001) {
                byte[] bArr = this.f48233zze;
                Preconditions.checkArgument(bArr != null && bArr.length == 8);
                Preconditions.checkArgument(this.f48232zzd == 0);
                Preconditions.checkArgument(this.f48234zzf == null);
            }
            int i2 = this.f48230zzb;
            if (i2 == 4 || i2 == 5 || i2 == 6) {
                byte[] bArr2 = this.f48233zze;
                Preconditions.checkArgument(bArr2 != null && ((length = bArr2.length) == 16 || length == 32));
                Preconditions.checkArgument(this.f48232zzd == 0);
                Preconditions.checkArgument(this.f48234zzf == null);
            }
            if (this.f48230zzb == 7) {
                Preconditions.checkArgument(this.f48232zzd != 0);
                byte[] bArr3 = this.f48233zze;
                Preconditions.checkArgument(bArr3 != null && ((length3 = bArr3.length) == 16 || length3 == 32));
                byte[] bArr4 = this.f48234zzf;
                if (bArr4 == null || ((length2 = bArr4.length) != 16 && length2 != 32)) {
                    z = false;
                }
                Preconditions.checkArgument(z);
            }
            return new RangingParameters(this.f48230zzb, this.f48231zzc, this.f48232zzd, this.f48233zze, this.f48234zzf, this.f48235zzg, this.f48229zza, this.f48236zzh, this.f48237zzi, this.f48238zzj, this.f48239zzk, null);
        }

        @NonNull
        public Builder setComplexChannel(UwbComplexChannel uwbComplexChannel) {
            this.f48235zzg = uwbComplexChannel;
            return this;
        }

        @NonNull
        public Builder setIsAoaDisabled(boolean z) {
            this.f48239zzk = z;
            return this;
        }

        @NonNull
        public Builder setRangingUpdateRate(@RangingUpdateRate int i) {
            this.f48229zza = i;
            return this;
        }

        @NonNull
        public Builder setSessionId(int i) {
            this.f48231zzc = i;
            return this;
        }

        @NonNull
        public Builder setSessionKeyInfo(byte[] bArr) {
            this.f48233zze = bArr;
            return this;
        }

        @NonNull
        public Builder setSlotDuration(@SlotDuration int i) {
            this.f48238zzj = i;
            return this;
        }

        @NonNull
        public Builder setSubSessionId(int i) {
            this.f48232zzd = i;
            return this;
        }

        @NonNull
        public Builder setSubSessionKeyInfo(byte[] bArr) {
            this.f48234zzf = bArr;
            return this;
        }

        @NonNull
        public Builder setUwbConfigId(@UwbConfigId int i) {
            this.f48230zzb = i;
            return this;
        }

        @NonNull
        public Builder setUwbRangeDataNtfConfig(@NonNull UwbRangeDataNtfConfig uwbRangeDataNtfConfig) {
            this.f48237zzi = uwbRangeDataNtfConfig;
            return this;
        }
    }

    public @interface RangingUpdateRate {
        public static final int AUTOMATIC = 1;
        public static final int FREQUENT = 3;
        public static final int INFREQUENT = 2;
        public static final int UNKNOWN = 0;
    }

    public @interface SlotDuration {
        public static final int DURATION_1_MS = 1;
        public static final int DURATION_2_MS = 2;
    }

    public @interface UwbConfigId {
        public static final int CONFIG_ID_1 = 1;
        public static final int CONFIG_ID_2 = 2;
        public static final int CONFIG_ID_3 = 3;
        public static final int CONFIG_ID_4 = 4;
        public static final int CONFIG_ID_5 = 5;
        public static final int CONFIG_ID_6 = 6;
        public static final int CONFIG_ID_7 = 7;
    }

    public /* synthetic */ RangingParameters(int i, int i2, int i3, byte[] bArr, byte[] bArr2, UwbComplexChannel uwbComplexChannel, int i5, List list, UwbRangeDataNtfConfig uwbRangeDataNtfConfig, int i6, boolean z, zza zzaVar) {
        this.f48218zzb = i;
        this.f48219zzc = i2;
        this.f48220zzd = i3;
        this.f48221zze = bArr;
        this.f48222zzf = bArr2;
        this.f48223zzg = uwbComplexChannel;
        this.f48225zzi = i5;
        this.f48224zzh = list;
        this.f48226zzj = uwbRangeDataNtfConfig;
        this.f48227zzk = i6;
        this.f48228zzl = z;
    }

    public UwbComplexChannel getComplexChannel() {
        return this.f48223zzg;
    }

    @NonNull
    public List<UwbDevice> getPeerDevices() {
        return this.f48224zzh;
    }

    @RangingUpdateRate
    public int getRangingUpdateRate() {
        return this.f48225zzi;
    }

    public int getSessionId() {
        return this.f48219zzc;
    }

    public byte[] getSessionKeyInfo() {
        return this.f48221zze;
    }

    @SlotDuration
    public int getSlotDuration() {
        return this.f48227zzk;
    }

    public int getSubSessionId() {
        return this.f48220zzd;
    }

    public byte[] getSubSessionKeyInfo() {
        return this.f48222zzf;
    }

    @UwbConfigId
    public int getUwbConfigId() {
        return this.f48218zzb;
    }

    @NonNull
    public UwbRangeDataNtfConfig getUwbRangeDataNtfConfig() {
        return this.f48226zzj;
    }

    public boolean isAoaDisabled() {
        return this.f48228zzl;
    }
}
