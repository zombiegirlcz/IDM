package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzah;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzaa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f38340zza = null;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private long f38341zzb = -1;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzah f38342zzc = zzah.zzj();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private zzah f38343zzd = zzah.zzj();

    public final zzaa zza(String str) {
        this.f38340zza = str;
        return this;
    }

    public final zzaa zzb(long j2) {
        this.f38341zzb = j2;
        return this;
    }

    public final zzaa zzc(List list) {
        Preconditions.checkNotNull(list);
        this.f38342zzc = zzah.zzp(list);
        return this;
    }

    public final zzaa zzd(List list) {
        Preconditions.checkNotNull(list);
        this.f38343zzd = zzah.zzp(list);
        return this;
    }

    public final zzab zze() {
        if (this.f38340zza == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.f38341zzb < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.f38342zzc.isEmpty() && this.f38343zzd.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new zzab(this.f38340zza, this.f38341zzb, this.f38342zzc, this.f38343zzd, null);
    }
}
