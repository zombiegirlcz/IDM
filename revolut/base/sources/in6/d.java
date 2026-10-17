package in6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162667a;

    public d(String institutionName) {
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f162667a = institutionName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f162667a, ((d) obj2).f162667a);
    }

    public final int hashCode() {
        return this.f162667a.hashCode();
    }
}
