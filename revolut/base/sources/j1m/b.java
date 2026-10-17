package j1m;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes23.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f170635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f170636b;

    public b(int i, int i2) {
        this.f170635a = i;
        this.f170636b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f170635a == bVar.f170635a && this.f170636b == bVar.f170636b;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f170635a) * 31) + Integer.hashCode(this.f170636b);
    }

    public final String toString() {
        return "Size(width=" + this.f170635a + ", height=" + this.f170636b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
