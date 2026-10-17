package r88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252385a;

    public h(String firstName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f252385a = firstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f252385a, ((h) obj2).f252385a);
    }

    public final int hashCode() {
        return this.f252385a.hashCode();
    }
}
