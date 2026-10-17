package w1m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293899a;

    public /* synthetic */ o(String str) {
        this.f293899a = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof o) {
            return Intrinsics.f(this.f293899a, ((o) obj2).f293899a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f293899a.hashCode();
    }

    public final String toString() {
        return p.a.l(CoreConstants.RIGHT_PARENTHESIS_CHAR, "VerificationId(value=", this.f293899a);
    }
}
