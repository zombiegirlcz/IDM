package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zbc implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    private final String f37454zba;

    public zbc(String str) {
        this.f37454zba = str;
    }

    public final boolean equals(Object obj2) {
        return obj2 instanceof zbc;
    }

    public final int hashCode() {
        return Objects.hashCode(zbc.class);
    }

    public final Bundle zba() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.f37454zba);
        return bundle;
    }

    public final String zbb() {
        return this.f37454zba;
    }
}
