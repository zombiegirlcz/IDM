package k50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f181227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f181228b;

    public s0(int i, UUID messageServerId) {
        Intrinsics.checkNotNullParameter(messageServerId, "messageServerId");
        this.f181227a = messageServerId;
        this.f181228b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f181227a, s0Var.f181227a) && this.f181228b == s0Var.f181228b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f181228b) + (this.f181227a.hashCode() * 31);
    }
}
