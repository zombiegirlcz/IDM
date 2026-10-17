package w1m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293898a;

    public static String a(String str) {
        return p.a.l(CoreConstants.RIGHT_PARENTHESIS_CHAR, "TransactionToken(value=", str);
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof m) {
            return Intrinsics.f(this.f293898a, ((m) obj2).f293898a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f293898a.hashCode();
    }

    public final String toString() {
        return a(this.f293898a);
    }
}
