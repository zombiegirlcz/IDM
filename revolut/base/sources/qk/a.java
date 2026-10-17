package qk;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f246923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f246924b;

    public a(Object obj2) {
        this.f246923a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f246923a, ((a) obj2).f246923a);
    }

    public final int hashCode() {
        Object obj2 = this.f246923a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }

    public final String toString() {
        return "Event(content=" + this.f246923a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
