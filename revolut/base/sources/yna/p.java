package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.u f315366a;

    public p(do3.u student) {
        Intrinsics.checkNotNullParameter(student, "student");
        this.f315366a = student;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f315366a, ((p) obj2).f315366a);
    }

    public final int hashCode() {
        return this.f315366a.hashCode();
    }
}
