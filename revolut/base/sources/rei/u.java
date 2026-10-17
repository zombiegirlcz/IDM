package rei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253638b;

    public u(String first, String last) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(last, "last");
        this.f253637a = first;
        this.f253638b = last;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f253637a, uVar.f253637a) && Intrinsics.f(this.f253638b, uVar.f253638b);
    }

    public final int hashCode() {
        return this.f253638b.hashCode() + (this.f253637a.hashCode() * 31);
    }
}
