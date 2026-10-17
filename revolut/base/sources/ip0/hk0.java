package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f164571a;

    public hk0(ik0 selected) {
        Intrinsics.checkNotNullParameter("ID_THEME_MODE_SWITCHER", "listId");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f164571a = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof hk0) && this.f164571a == ((hk0) obj2).f164571a;
    }

    public final int hashCode() {
        return this.f164571a.hashCode() + 861539229;
    }
}
