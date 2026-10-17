package com.android.billingclient.api;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@zzo
public final class LaunchExternalLinkParams {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Uri f25697zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f25698zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f25699zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f25700zzd;

    @zzo
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private Uri f25701zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f25702zzb = 0;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f25703zzc = 0;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private int f25704zzd = 0;

        private Builder() {
        }

        @NonNull
        @zzo
        public LaunchExternalLinkParams build() {
            int i = this.f25703zzc;
            if (i == 0) {
                throw new IllegalArgumentException("Link type is required.");
            }
            int i2 = this.f25702zzb;
            if (i2 == 0) {
                throw new IllegalArgumentException("Launch mode is required.");
            }
            if (i2 != 1 && i == 2) {
                throw new IllegalArgumentException("App downloads must launch in an external browser or app.");
            }
            if (this.f25704zzd == 0) {
                throw new IllegalArgumentException("Billing program is required.");
            }
            Uri uri2 = this.f25701zza;
            if (uri2 == null) {
                throw new IllegalArgumentException("URI must be set.");
            }
            if (uri2.getScheme() != null) {
                return new LaunchExternalLinkParams(this.f25701zza, this.f25702zzb, this.f25703zzc, this.f25704zzd, null);
            }
            throw new IllegalArgumentException("URI must have a scheme.");
        }

        @NonNull
        @zzo
        public Builder setBillingProgram(int i) {
            this.f25704zzd = i;
            return this;
        }

        @NonNull
        @zzo
        public Builder setLaunchMode(int i) {
            this.f25702zzb = i;
            return this;
        }

        @NonNull
        @zzo
        public Builder setLinkType(int i) {
            this.f25703zzc = i;
            return this;
        }

        @NonNull
        @zzo
        public Builder setLinkUri(@NonNull Uri uri2) {
            this.f25701zza = uri2;
            return this;
        }

        public /* synthetic */ Builder(zzdr zzdrVar) {
        }
    }

    @zzo
    @Retention(RetentionPolicy.SOURCE)
    public @interface LaunchMode {

        @zzo
        public static final int CALLER_WILL_LAUNCH_LINK = 2;

        @zzo
        public static final int LAUNCH_IN_EXTERNAL_BROWSER_OR_APP = 1;

        @zzo
        public static final int LAUNCH_MODE_UNSPECIFIED = 0;
    }

    @zzo
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkType {

        @zzp
        public static final int LINK_TO_APP_DOWNLOAD = 2;

        @zzo
        public static final int LINK_TO_DIGITAL_CONTENT_OFFER = 1;

        @zzo
        public static final int LINK_TYPE_UNSPECIFIED = 0;
    }

    public /* synthetic */ LaunchExternalLinkParams(Uri uri2, int i, int i2, int i3, zzdr zzdrVar) {
        this.f25697zza = uri2;
        this.f25698zzb = i;
        this.f25699zzc = i2;
        this.f25700zzd = i3;
    }

    @NonNull
    @zzo
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @zzo
    public int getBillingProgram() {
        return this.f25700zzd;
    }

    @zzo
    public int getLaunchMode() {
        return this.f25698zzb;
    }

    @zzo
    public int getLinkType() {
        return this.f25699zzc;
    }

    @NonNull
    @zzo
    public Uri getLinkUri() {
        return this.f25697zza;
    }
}
