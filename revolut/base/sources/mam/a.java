package mam;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f204050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f204051b;

    public a(boolean z, Function0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f204050a = z;
        this.f204051b = function;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f204050a == aVar.f204050a && Intrinsics.f(this.f204051b, aVar.f204051b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.f204050a;
        ?? r06 = z;
        if (z) {
            r06 = 1;
        }
        return this.f204051b.hashCode() + (r06 * 31);
    }

    public final String toString() {
        return "Operation(cancellable=" + this.f204050a + ", function=" + this.f204051b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
