package wu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300054a;

    public b(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f300054a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f300054a, ((b) obj2).f300054a);
    }

    public final int hashCode() {
        return this.f300054a.hashCode();
    }
}
