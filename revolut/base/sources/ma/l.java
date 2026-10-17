package ma;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f203847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f203848b;

    public l(TextClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f203847a = title;
        this.f203848b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f203847a.equals(lVar.f203847a) && this.f203848b == lVar.f203848b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203848b) + (this.f203847a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionButtonState(title=" + this.f203847a + ", enabled=" + this.f203848b + ")";
    }
}
