package ukm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class z {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f280842b = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f280843a;

    public static final Throwable a(Object obj2) {
        w wVar = obj2 instanceof w ? (w) obj2 : null;
        if (wVar != null) {
            return wVar.f280841a;
        }
        return null;
    }

    public static final Object b(Object obj2) {
        if (obj2 instanceof y) {
            return null;
        }
        return obj2;
    }

    public static final void c(Object obj2) throws Throwable {
        if (obj2 instanceof y) {
            if (!(obj2 instanceof w)) {
                throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
            }
            Throwable th10 = ((w) obj2).f280841a;
            if (th10 == null) {
                throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
            }
            throw th10;
        }
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof z) {
            return Intrinsics.f(this.f280843a, ((z) obj2).f280843a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj2 = this.f280843a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }

    public final String toString() {
        Object obj2 = this.f280843a;
        if (obj2 instanceof w) {
            return ((w) obj2).toString();
        }
        return "Value(" + obj2 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
