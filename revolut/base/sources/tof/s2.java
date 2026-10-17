package tof;

import java.io.Serializable;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f273040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273041b;

    public s2(LocalDateTime localDateTime, boolean z) {
        this.f273040a = localDateTime;
        this.f273041b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj2;
        return Intrinsics.f(this.f273040a, s2Var.f273040a) && this.f273041b == s2Var.f273041b;
    }

    public final int hashCode() {
        LocalDateTime localDateTime = this.f273040a;
        return Boolean.hashCode(this.f273041b) + ((localDateTime == null ? 0 : localDateTime.hashCode()) * 31);
    }
}
