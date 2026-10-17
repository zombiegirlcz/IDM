package azc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11434a;

    public j(String note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.f11434a = note;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f11434a, ((j) obj2).f11434a);
    }

    public final int hashCode() {
        return this.f11434a.hashCode();
    }
}
