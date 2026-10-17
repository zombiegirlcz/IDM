package azc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11435a;

    public k(String note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.f11435a = note;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f11435a, ((k) obj2).f11435a);
    }

    public final int hashCode() {
        return this.f11435a.hashCode();
    }
}
