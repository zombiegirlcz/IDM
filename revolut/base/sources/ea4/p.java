package ea4;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f124139a;

    public p(Map documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f124139a = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f124139a, ((p) obj2).f124139a);
    }

    public final int hashCode() {
        return this.f124139a.hashCode();
    }
}
