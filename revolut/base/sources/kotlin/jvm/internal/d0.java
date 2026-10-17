package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes14.dex */
public final class d0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f186417a;

    public d0(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter("", "moduleName");
        this.f186417a = jClass;
    }

    @Override // kotlin.jvm.internal.j
    public final Class a() {
        return this.f186417a;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof d0) {
            return Intrinsics.f(this.f186417a, ((d0) obj2).f186417a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f186417a.hashCode();
    }

    public final String toString() {
        return this.f186417a.toString() + " (Kotlin reflection is not available)";
    }
}
