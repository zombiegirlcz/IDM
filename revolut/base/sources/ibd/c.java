package ibd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f160148a;

    public c(dj0.d threshold) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        this.f160148a = threshold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f160148a, ((c) obj2).f160148a);
    }

    public final int hashCode() {
        return this.f160148a.hashCode();
    }
}
