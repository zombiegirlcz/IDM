package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215928b;

    public l2(String legId, String contentIndex) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(contentIndex, "contentIndex");
        this.f215927a = legId;
        this.f215928b = contentIndex;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.f215927a, l2Var.f215927a) && Intrinsics.f(this.f215928b, l2Var.f215928b);
    }

    public final int hashCode() {
        return this.f215928b.hashCode() + (this.f215927a.hashCode() * 31);
    }
}
