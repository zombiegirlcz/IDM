package nvl;

import k4l.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f219746a;

    public d(k type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f219746a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f219746a == ((d) obj2).f219746a;
    }

    public final int hashCode() {
        return this.f219746a.hashCode();
    }
}
