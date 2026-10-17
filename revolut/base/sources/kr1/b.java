package kr1;

import kotlin.jvm.internal.Intrinsics;
import xo9.h;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188629a;

    public b(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f188629a = qrCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f188629a, ((b) obj2).f188629a);
    }

    public final int hashCode() {
        return this.f188629a.hashCode();
    }
}
