package p0h;

import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f231542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.wealth.api.ui.extensions.disclaimers.a f231543b;

    public d(z instrumentType, com.revolut.feature.wealth.api.ui.extensions.disclaimers.a screen) {
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f231542a = instrumentType;
        this.f231543b = screen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f231542a == dVar.f231542a && this.f231543b == dVar.f231543b;
    }

    public final int hashCode() {
        return this.f231543b.hashCode() + (this.f231542a.hashCode() * 31);
    }
}
