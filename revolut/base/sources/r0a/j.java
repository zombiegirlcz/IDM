package r0a;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f250738a;

    public j(Clause footerText) {
        Intrinsics.checkNotNullParameter(footerText, "footerText");
        this.f250738a = footerText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f250738a.equals(((j) obj2).f250738a);
    }

    public final int hashCode() {
        return this.f250738a.hashCode();
    }
}
