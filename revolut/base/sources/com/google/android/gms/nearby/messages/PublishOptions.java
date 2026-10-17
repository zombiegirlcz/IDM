package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class PublishOptions {

    @NonNull
    public static final PublishOptions DEFAULT = new Builder().build();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Strategy f48033zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final PublishCallback f48034zzb;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private Strategy f48035zza = Strategy.DEFAULT;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private PublishCallback f48036zzb;

        @NonNull
        public PublishOptions build() {
            return new PublishOptions(this.f48035zza, this.f48036zzb, null);
        }

        @NonNull
        public Builder setCallback(@NonNull PublishCallback publishCallback) {
            this.f48036zzb = (PublishCallback) Preconditions.checkNotNull(publishCallback);
            return this;
        }

        @NonNull
        public Builder setStrategy(@NonNull Strategy strategy) {
            this.f48035zza = (Strategy) Preconditions.checkNotNull(strategy);
            return this;
        }
    }

    public /* synthetic */ PublishOptions(Strategy strategy, PublishCallback publishCallback, zze zzeVar) {
        this.f48033zza = strategy;
        this.f48034zzb = publishCallback;
    }

    public PublishCallback getCallback() {
        return this.f48034zzb;
    }

    @NonNull
    public Strategy getStrategy() {
        return this.f48033zza;
    }
}
