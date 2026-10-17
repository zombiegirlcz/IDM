package zp;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui0.d f324084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ui0.d f324085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f324086c;

    public b(ui0.d currentVersion, ui0.d minimumSupportedVersion, LocalDate expiration) {
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        Intrinsics.checkNotNullParameter(minimumSupportedVersion, "minimumSupportedVersion");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        this.f324084a = currentVersion;
        this.f324085b = minimumSupportedVersion;
        this.f324086c = expiration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f324084a, bVar.f324084a) && Intrinsics.f(this.f324085b, bVar.f324085b) && Intrinsics.f(this.f324086c, bVar.f324086c);
    }

    public final int hashCode() {
        return this.f324086c.hashCode() + ((this.f324085b.hashCode() + (this.f324084a.hashCode() * 31)) * 31);
    }
}
