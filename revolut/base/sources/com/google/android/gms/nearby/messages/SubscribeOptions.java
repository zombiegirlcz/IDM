package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
public final class SubscribeOptions {

    @NonNull
    public static final SubscribeOptions DEFAULT = new Builder().build();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final boolean f48050zza = false;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public final int f48051zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Strategy f48052zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final MessageFilter f48053zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final SubscribeCallback f48054zze;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private Strategy f48055zza = Strategy.DEFAULT;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private MessageFilter f48056zzb = MessageFilter.INCLUDE_ALL_MY_TYPES;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private SubscribeCallback f48057zzc;

        @NonNull
        public SubscribeOptions build() {
            return new SubscribeOptions(this.f48055zza, this.f48056zzb, this.f48057zzc, false, 0, null);
        }

        @NonNull
        public Builder setCallback(@NonNull SubscribeCallback subscribeCallback) {
            this.f48057zzc = (SubscribeCallback) Preconditions.checkNotNull(subscribeCallback);
            return this;
        }

        @NonNull
        public Builder setFilter(@NonNull MessageFilter messageFilter) {
            this.f48056zzb = messageFilter;
            return this;
        }

        @NonNull
        public Builder setStrategy(@NonNull Strategy strategy) {
            this.f48055zza = strategy;
            return this;
        }
    }

    public /* synthetic */ SubscribeOptions(Strategy strategy, MessageFilter messageFilter, SubscribeCallback subscribeCallback, boolean z, int i, zzg zzgVar) {
        this.f48052zzc = strategy;
        this.f48053zzd = messageFilter;
        this.f48054zze = subscribeCallback;
    }

    public SubscribeCallback getCallback() {
        return this.f48054zze;
    }

    @NonNull
    public MessageFilter getFilter() {
        return this.f48053zzd;
    }

    @NonNull
    public Strategy getStrategy() {
        return this.f48052zzc;
    }

    @NonNull
    public String toString() {
        return a.s("SubscribeOptions{strategy=", String.valueOf(this.f48052zzc), ", filter=", String.valueOf(this.f48053zzd), "}");
    }
}
