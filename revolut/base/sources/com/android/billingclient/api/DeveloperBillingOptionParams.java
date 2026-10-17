package com.android.billingclient.api;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@zzl
public final class DeveloperBillingOptionParams {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Uri f25675zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f25676zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f25677zzc;

    @zzl
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private Uri f25678zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f25679zzb = 0;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f25680zzc = 0;

        private Builder() {
        }

        @NonNull
        @zzl
        public DeveloperBillingOptionParams build() {
            if (this.f25680zzc == 0) {
                throw new IllegalArgumentException("Billing program is required.");
            }
            Uri uri2 = this.f25678zza;
            if (uri2 == null || uri2.getScheme() != null) {
                return new DeveloperBillingOptionParams(this.f25678zza, this.f25679zzb, this.f25680zzc, null);
            }
            throw new IllegalArgumentException("URI must have a scheme.");
        }

        @NonNull
        public Builder setBillingProgram(int i) {
            this.f25680zzc = i;
            return this;
        }

        @NonNull
        public Builder setLaunchMode(int i) {
            this.f25679zzb = i;
            return this;
        }

        @NonNull
        public Builder setLinkUri(@NonNull Uri uri2) {
            this.f25678zza = uri2;
            return this;
        }

        public /* synthetic */ Builder(zzdi zzdiVar) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @zzl
    public @interface LaunchMode {
        public static final int CALLER_WILL_LAUNCH_LINK = 2;
        public static final int LAUNCH_IN_EXTERNAL_BROWSER_OR_APP = 1;
        public static final int LAUNCH_MODE_UNSPECIFIED = 0;
    }

    public /* synthetic */ DeveloperBillingOptionParams(Uri uri2, int i, int i2, zzdi zzdiVar) {
        this.f25675zza = uri2;
        this.f25676zzb = i;
        this.f25677zzc = i2;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public int getBillingProgram() {
        return this.f25677zzc;
    }

    public int getLaunchMode() {
        return this.f25676zzb;
    }

    public Uri getLinkUri() {
        return this.f25675zza;
    }
}
