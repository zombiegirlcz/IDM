package ub;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes23.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f278717a;

    public h(boolean z) {
        this.f278717a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f278717a == ((h) obj2).f278717a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f278717a);
    }

    public final String toString() {
        return "Denied(shouldShowRationale=" + this.f278717a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
