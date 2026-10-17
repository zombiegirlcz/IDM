package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166760a;

    public v3(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f166760a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v3) && Intrinsics.f(this.f166760a, ((v3) obj2).f166760a);
    }

    public final int hashCode() {
        return this.f166760a.hashCode();
    }
}
