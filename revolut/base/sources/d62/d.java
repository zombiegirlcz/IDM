package d62;

import g12.m;
import kotlin.jvm.internal.Intrinsics;
import xo9.h;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements m, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111439a;

    public d(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f111439a = qrCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f111439a, ((d) obj2).f111439a);
    }

    public final int hashCode() {
        return this.f111439a.hashCode();
    }
}
