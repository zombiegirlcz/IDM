package ju3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f178572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f178573b;

    public c(Map screens, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(screens, "screens");
        this.f178572a = countryCode;
        this.f178573b = screens;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f178572a, cVar.f178572a) && Intrinsics.f(this.f178573b, cVar.f178573b);
    }

    public final int hashCode() {
        return this.f178573b.hashCode() + (this.f178572a.f297794a.hashCode() * 31);
    }
}
