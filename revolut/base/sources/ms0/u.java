package ms0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f208446a;

    public u(Clause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f208446a = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f208446a, ((u) obj2).f208446a);
    }

    public final int hashCode() {
        return this.f208446a.hashCode();
    }
}
