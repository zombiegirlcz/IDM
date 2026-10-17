package ec5;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f124439b;

    public e(String code, Instant instant) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f124438a = code;
        this.f124439b = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f124438a, eVar.f124438a) && Intrinsics.f(this.f124439b, eVar.f124439b);
    }

    public final int hashCode() {
        int iHashCode = this.f124438a.hashCode() * 31;
        Instant instant = this.f124439b;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }
}
