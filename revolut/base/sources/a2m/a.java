package a2m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2m.a f942a;

    public a(m2m.a deviceRepository) {
        Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        this.f942a = deviceRepository;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f942a, ((a) obj2).f942a);
    }

    public final int hashCode() {
        return this.f942a.hashCode();
    }

    public final String toString() {
        return "ClipboardUseCaseImpl(deviceRepository=" + this.f942a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
