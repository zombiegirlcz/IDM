package gs4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql4.g f146322a;

    public j(ql4.g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f146322a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f146322a == ((j) obj2).f146322a;
    }

    public final int hashCode() {
        return this.f146322a.hashCode();
    }
}
