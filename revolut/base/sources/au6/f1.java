package au6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9528a;

    public f1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f9528a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f1) && Intrinsics.f(this.f9528a, ((f1) obj2).f9528a);
    }

    public final int hashCode() {
        return this.f9528a.hashCode();
    }
}
