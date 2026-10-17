package vq1;

import kotlin.jvm.internal.Intrinsics;
import xo9.h;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291302a;

    public c(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f291302a = qrCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f291302a, ((c) obj2).f291302a);
    }

    public final int hashCode() {
        return this.f291302a.hashCode();
    }
}
