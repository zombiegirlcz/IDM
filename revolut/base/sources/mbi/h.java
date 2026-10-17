package mbi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bj0.b f204224a;

    public h(bj0.b gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.f204224a = gender;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f204224a == ((h) obj2).f204224a;
    }

    public final int hashCode() {
        return this.f204224a.hashCode();
    }
}
