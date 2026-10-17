package es6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128872a;

    public f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f128872a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f128872a, ((f) obj2).f128872a);
    }

    public final int hashCode() {
        return this.f128872a.hashCode();
    }
}
