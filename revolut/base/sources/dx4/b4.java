package dx4;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f120559a;

    public b4(List segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f120559a = segments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b4) && this.f120559a.equals(((b4) obj2).f120559a);
    }

    public final int hashCode() {
        return this.f120559a.hashCode();
    }
}
