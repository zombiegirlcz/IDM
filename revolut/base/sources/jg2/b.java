package jg2;

import kotlin.jvm.internal.Intrinsics;
import xo9.h;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f173906b;

    public b(String qrCode, boolean z) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f173905a = qrCode;
        this.f173906b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f173905a, bVar.f173905a) && this.f173906b == bVar.f173906b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173906b) + (this.f173905a.hashCode() * 31);
    }
}
