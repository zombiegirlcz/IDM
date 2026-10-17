package gei;

import aw0.v1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f143310a;

    public g(v1 defaultColorScheme) {
        Intrinsics.checkNotNullParameter(defaultColorScheme, "defaultColorScheme");
        this.f143310a = defaultColorScheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f143310a == ((g) obj2).f143310a;
    }

    public final int hashCode() {
        return this.f143310a.hashCode();
    }
}
