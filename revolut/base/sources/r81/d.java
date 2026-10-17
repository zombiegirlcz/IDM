package r81;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f252305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f252306b;

    public d(c value, String description) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f252305a = value;
        this.f252306b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f252305a, dVar.f252305a) && Intrinsics.f(this.f252306b, dVar.f252306b);
    }

    public final int hashCode() {
        return this.f252306b.hashCode() + (this.f252305a.hashCode() * 31);
    }
}
