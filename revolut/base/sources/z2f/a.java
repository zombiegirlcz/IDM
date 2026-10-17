package z2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f319060a;

    public a(b layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f319060a = layout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f319060a, ((a) obj2).f319060a);
    }

    public final int hashCode() {
        return this.f319060a.hashCode();
    }
}
