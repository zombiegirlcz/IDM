package vr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f291438a;

    public c(b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f291438a = errorCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f291438a == ((c) obj2).f291438a;
    }

    public final int hashCode() {
        return this.f291438a.hashCode();
    }
}
