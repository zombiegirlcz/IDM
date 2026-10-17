package ukm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f280841a;

    public w(Throwable th10) {
        this.f280841a = th10;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof w) {
            return Intrinsics.f(this.f280841a, ((w) obj2).f280841a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th10 = this.f280841a;
        if (th10 != null) {
            return th10.hashCode();
        }
        return 0;
    }

    @Override // ukm.y
    public final String toString() {
        return "Closed(" + this.f280841a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
