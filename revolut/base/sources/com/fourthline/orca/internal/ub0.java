package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.NfcAuthenticationChecks;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ub0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f33990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MrzInfo f33991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f33992c;
    private final Coordinate d;
    private final Map e;
    private final NfcAuthenticationChecks f;

    public ub0(Bitmap bitmap, MrzInfo mrzInfo, Long l2, Coordinate coordinate, Map dataGroups, NfcAuthenticationChecks authenticationChecks) {
        Intrinsics.checkNotNullParameter(dataGroups, "dataGroups");
        Intrinsics.checkNotNullParameter(authenticationChecks, "authenticationChecks");
        this.f33990a = bitmap;
        this.f33991b = mrzInfo;
        this.f33992c = l2;
        this.d = coordinate;
        this.e = dataGroups;
        this.f = authenticationChecks;
    }

    private final boolean g() {
        if (e() != null) {
            return !kotlin.text.d0.W(r0);
        }
        return false;
    }

    public final NfcAuthenticationChecks a() {
        return this.f;
    }

    public final Map b() {
        return this.e;
    }

    public final Bitmap c() {
        return this.f33990a;
    }

    public final Coordinate d() {
        return this.d;
    }

    public final String e() {
        MrzInfo mrzInfo = this.f33991b;
        if (mrzInfo != null) {
            return mrzInfo.getRawMrz();
        }
        return null;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ub0)) {
            return false;
        }
        ub0 ub0Var = (ub0) obj2;
        return Intrinsics.f(this.f33990a, ub0Var.f33990a) && Intrinsics.f(this.f33991b, ub0Var.f33991b) && Intrinsics.f(this.f33992c, ub0Var.f33992c) && Intrinsics.f(this.d, ub0Var.d) && Intrinsics.f(this.e, ub0Var.e) && Intrinsics.f(this.f, ub0Var.f);
    }

    public final MrzInfo f() {
        return this.f33991b;
    }

    public final Long h() {
        return this.f33992c;
    }

    public int hashCode() {
        Bitmap bitmap = this.f33990a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        MrzInfo mrzInfo = this.f33991b;
        int iHashCode2 = (iHashCode + (mrzInfo == null ? 0 : mrzInfo.hashCode())) * 31;
        Long l2 = this.f33992c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Coordinate coordinate = this.d;
        return ((((iHashCode3 + (coordinate != null ? coordinate.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final boolean i() {
        return l8.a(this.f33992c) && g() && l8.a(this.d);
    }

    public String toString() {
        return "NfcAttachmentBundle(image=" + this.f33990a + ", mrzInfo=" + this.f33991b + ", timestamp=" + this.f33992c + ", location=" + this.d + ", dataGroups=" + this.e + ", authenticationChecks=" + this.f + ")";
    }
}
