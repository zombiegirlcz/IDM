package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pl extends ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.s9 f165847a;

    public pl(aw0.s9 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f165847a = data;
    }

    @Override // ip0.ul
    public final Integer a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof pl) && this.f165847a.equals(((pl) obj2).f165847a);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription */
    public final Clause getD() {
        return null;
    }

    public final int hashCode() {
        return this.f165847a.hashCode() * 961;
    }
}
