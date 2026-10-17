package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x5 implements z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.v1 f208489a;

    public x5(aw0.v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f208489a = colorScheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x5) && this.f208489a == ((x5) obj2).f208489a;
    }

    public final int hashCode() {
        return this.f208489a.hashCode();
    }
}
