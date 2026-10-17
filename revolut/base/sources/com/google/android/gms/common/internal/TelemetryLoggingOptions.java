package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {

    @NonNull
    public static final TelemetryLoggingOptions zaa = builder().build();

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final String f38100zab;

    @KeepForSdk
    public static class Builder {
        private String zaa;

        private Builder() {
        }

        @NonNull
        @KeepForSdk
        public TelemetryLoggingOptions build() {
            return new TelemetryLoggingOptions(this.zaa, null);
        }

        @NonNull
        @KeepForSdk
        public Builder setApi(String str) {
            this.zaa = str;
            return this;
        }

        public /* synthetic */ Builder(zaac zaacVar) {
        }
    }

    public /* synthetic */ TelemetryLoggingOptions(String str, zaad zaadVar) {
        this.f38100zab = str;
    }

    @NonNull
    @KeepForSdk
    public static Builder builder() {
        return new Builder(null);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof TelemetryLoggingOptions) {
            return Objects.equal(this.f38100zab, ((TelemetryLoggingOptions) obj2).f38100zab);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f38100zab);
    }

    @NonNull
    public final Bundle zaa() {
        Bundle bundle = new Bundle();
        String str = this.f38100zab;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
