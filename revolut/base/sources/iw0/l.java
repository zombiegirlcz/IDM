package iw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f168897a;

    public l(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f168897a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f168897a.equals(((l) obj2).f168897a);
    }

    public final int hashCode() {
        return this.f168897a.hashCode();
    }
}
