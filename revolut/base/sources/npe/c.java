package npe;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f218195a;

    public c(wi0.b selectedCountryCode) {
        Intrinsics.checkNotNullParameter(selectedCountryCode, "selectedCountryCode");
        this.f218195a = selectedCountryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f218195a, ((c) obj2).f218195a);
    }

    public final int hashCode() {
        return this.f218195a.f297794a.hashCode();
    }
}
