package ed3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl4.a f124915a;

    public b(cl4.a details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f124915a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f124915a, ((b) obj2).f124915a);
    }

    public final int hashCode() {
        return this.f124915a.hashCode();
    }
}
