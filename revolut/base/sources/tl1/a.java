package tl1;

import kotlin.jvm.internal.Intrinsics;
import xo9.h;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271994a;

    public a(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f271994a = qrCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f271994a, ((a) obj2).f271994a);
    }

    public final int hashCode() {
        return this.f271994a.hashCode();
    }
}
