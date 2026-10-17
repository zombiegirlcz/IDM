package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public final class zbd implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    public static final zbd f37537zba = new zbd(new zbc());

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    private final String f37538zbb = null;
    private final boolean zbc;

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    private final String f37539zbd;

    public zbd(zbc zbcVar) {
        this.zbc = zbcVar.f37535zba.booleanValue();
        this.f37539zbd = zbcVar.f37536zbb;
    }

    public static /* bridge */ /* synthetic */ String zbb(zbd zbdVar) {
        String str = zbdVar.f37538zbb;
        return null;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj2;
        return Objects.equal(null, null) && this.zbc == zbdVar.zbc && Objects.equal(this.f37539zbd, zbdVar.f37539zbd);
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.valueOf(this.zbc), this.f37539zbd);
    }

    public final Bundle zba() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.zbc);
        bundle.putString("log_session_id", this.f37539zbd);
        return bundle;
    }
}
