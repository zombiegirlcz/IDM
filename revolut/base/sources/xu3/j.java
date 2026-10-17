package xu3;

import dx4.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f308911a;

    public j(a1 contentDrawableIcon) {
        Intrinsics.checkNotNullParameter(contentDrawableIcon, "contentDrawableIcon");
        this.f308911a = contentDrawableIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f308911a == ((j) obj2).f308911a;
    }

    public final int hashCode() {
        return this.f308911a.hashCode();
    }
}
