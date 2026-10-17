package mbi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od0.i f204222a;

    public f(od0.i genderOptional) {
        Intrinsics.checkNotNullParameter(genderOptional, "genderOptional");
        this.f204222a = genderOptional;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f204222a, ((f) obj2).f204222a);
    }

    public final int hashCode() {
        return this.f204222a.hashCode();
    }
}
