package o2m;

import ch.qos.logback.core.CoreConstants;
import do3.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f221665a;

    public c(b charType) {
        Intrinsics.checkNotNullParameter(charType, "charType");
        this.f221665a = charType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f221665a == ((c) obj2).f221665a;
    }

    public final int hashCode() {
        return this.f221665a.hashCode();
    }

    public final String toString() {
        return "IncorrectCharType(charType=" + this.f221665a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
