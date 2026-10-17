package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class MessagesOptions implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public final int f48029zzc;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final String f48027zza = null;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public final boolean f48028zzb = false;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @NonNull
    public final String f48030zzd = null;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @NonNull
    public final String f48031zze = null;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f48032zza = -1;

        @NonNull
        public MessagesOptions build() {
            return new MessagesOptions(this, null);
        }

        @NonNull
        public Builder setPermissions(int i) {
            this.f48032zza = i;
            return this;
        }
    }

    public /* synthetic */ MessagesOptions(Builder builder, zzd zzdVar) {
        this.f48029zzc = builder.f48032zza;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof MessagesOptions) {
            return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && this.f48029zzc == ((MessagesOptions) obj2).f48029zzc;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.FALSE, null, null, Integer.valueOf(this.f48029zzc));
    }
}
