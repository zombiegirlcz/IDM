package fh4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135140a;

    public l(List screens) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        this.f135140a = screens;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f135140a, ((l) obj2).f135140a);
    }

    public final int hashCode() {
        return this.f135140a.hashCode();
    }
}
