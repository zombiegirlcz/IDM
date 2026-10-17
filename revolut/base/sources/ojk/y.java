package ojk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f225847a;

    public y(Map titlesToExpanded) {
        Intrinsics.checkNotNullParameter(titlesToExpanded, "titlesToExpanded");
        this.f225847a = titlesToExpanded;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f225847a.equals(((y) obj2).f225847a);
    }

    public final int hashCode() {
        return this.f225847a.hashCode();
    }
}
