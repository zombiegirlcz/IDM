package r40;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f251354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f251355b;

    public n() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f251354a == nVar.f251354a && this.f251355b == nVar.f251355b;
    }

    public final int hashCode() {
        return this.f251355b.hashCode() + (this.f251354a.hashCode() * 31);
    }

    public n(int i) {
        m secondaryButton = m.NONE;
        Intrinsics.checkNotNullParameter(secondaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f251354a = secondaryButton;
        this.f251355b = secondaryButton;
    }
}
