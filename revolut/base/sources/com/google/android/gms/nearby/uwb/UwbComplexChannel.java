package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
public class UwbComplexChannel {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f48247zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f48248zzb;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f48249zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f48250zzb;

        @NonNull
        public UwbComplexChannel build() {
            return new UwbComplexChannel(this.f48249zza, this.f48250zzb, null);
        }

        @NonNull
        public Builder setChannel(int i) {
            this.f48249zza = i;
            return this;
        }

        @NonNull
        public Builder setPreambleIndex(int i) {
            this.f48250zzb = i;
            return this;
        }
    }

    public /* synthetic */ UwbComplexChannel(int i, int i2, zzb zzbVar) {
        this.f48247zza = i;
        this.f48248zzb = i2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UwbComplexChannel)) {
            return false;
        }
        UwbComplexChannel uwbComplexChannel = (UwbComplexChannel) obj2;
        return this.f48247zza == uwbComplexChannel.f48247zza && this.f48248zzb == uwbComplexChannel.f48248zzb;
    }

    public int getChannel() {
        return this.f48247zza;
    }

    public int getPreambleIndex() {
        return this.f48248zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48247zza), Integer.valueOf(this.f48248zzb));
    }

    @NonNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("UwbComplexChannel{channel=");
        sb6.append(this.f48247zza);
        sb6.append(", preambleIndex=");
        return a.v(sb6, "}", this.f48248zzb);
    }
}
