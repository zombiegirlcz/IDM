package nr6;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f218565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f218566b;

    public j0(LocalDateTime from, LocalDateTime to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f218565a = from;
        this.f218566b = to6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f218565a, j0Var.f218565a) && Intrinsics.f(this.f218566b, j0Var.f218566b);
    }

    public final int hashCode() {
        return this.f218566b.hashCode() + (this.f218565a.hashCode() * 31);
    }
}
