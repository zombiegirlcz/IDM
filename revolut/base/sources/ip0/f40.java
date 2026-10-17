package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f40 implements g40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i40 f164190a;

    public f40(i40 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f164190a = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f40) && this.f164190a == ((f40) obj2).f164190a;
    }

    public final int hashCode() {
        return this.f164190a.hashCode();
    }
}
