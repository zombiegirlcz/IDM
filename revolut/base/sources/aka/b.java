package aka;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5748b;

    public b(String text, c style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f5747a = text;
        this.f5748b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f5747a, bVar.f5747a) && this.f5748b == bVar.f5748b;
    }

    public final int hashCode() {
        return this.f5748b.hashCode() + (this.f5747a.hashCode() * 31);
    }
}
