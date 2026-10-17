package w1m;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements Serializable {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2m.b f293896b;

    public k(String processId, y2m.b type) {
        Intrinsics.checkNotNullParameter(processId, "processId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f293895a = processId;
        this.f293896b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f293895a, kVar.f293895a) && this.f293896b == kVar.f293896b;
    }

    public final int hashCode() {
        return this.f293896b.hashCode() + (this.f293895a.hashCode() * 31);
    }

    public final String toString() {
        return "Process(processId=" + this.f293895a + ", type=" + this.f293896b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
