package com.google.android.gms.nearby.connection;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class ConnectionsOptions implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f47808zza = null;

    public static class Builder {
        @NonNull
        public ConnectionsOptions build() {
            return new ConnectionsOptions(this, null);
        }
    }

    public /* synthetic */ ConnectionsOptions(Builder builder, zzq zzqVar) {
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof ConnectionsOptions) {
            return Objects.equal(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(null);
    }
}
