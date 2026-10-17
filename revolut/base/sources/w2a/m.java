package w2a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f293996a;

    public m(k newLayoutType) {
        Intrinsics.checkNotNullParameter(newLayoutType, "newLayoutType");
        this.f293996a = newLayoutType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f293996a == ((m) obj2).f293996a;
    }

    public final int hashCode() {
        return this.f293996a.hashCode();
    }
}
