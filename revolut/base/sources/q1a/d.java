package q1a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241414b;

    public d(String displayName, String errorText) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        this.f241413a = displayName;
        this.f241414b = errorText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f241413a, dVar.f241413a) && Intrinsics.f(this.f241414b, dVar.f241414b);
    }

    public final int hashCode() {
        return this.f241414b.hashCode() + (this.f241413a.hashCode() * 31);
    }
}
