package b8f;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13251a;

    public u(ArrayList screens) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        this.f13251a = screens;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f13251a.equals(((u) obj2).f13251a);
    }

    public final int hashCode() {
        return this.f13251a.hashCode();
    }
}
