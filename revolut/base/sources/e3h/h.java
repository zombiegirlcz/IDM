package e3h;

import kotlin.jvm.internal.Intrinsics;
import nel.p0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f122293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f122294b;

    public h(p0 tradingSession, boolean z) {
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        this.f122293a = tradingSession;
        this.f122294b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f122293a == hVar.f122293a && this.f122294b == hVar.f122294b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122294b) + (this.f122293a.hashCode() * 31);
    }
}
