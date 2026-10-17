package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3 f166584a;

    public u3(v3 id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f166584a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u3) && Intrinsics.f(this.f166584a, ((u3) obj2).f166584a);
    }

    public final int hashCode() {
        return this.f166584a.f166760a.hashCode();
    }
}
