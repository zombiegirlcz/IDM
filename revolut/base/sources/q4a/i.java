package q4a;

import aw0.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9 f242103a;

    public i(k9 searchActionButtons) {
        Intrinsics.checkNotNullParameter(searchActionButtons, "searchActionButtons");
        this.f242103a = searchActionButtons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f242103a, ((i) obj2).f242103a);
    }

    public final int hashCode() {
        return this.f242103a.hashCode();
    }
}
