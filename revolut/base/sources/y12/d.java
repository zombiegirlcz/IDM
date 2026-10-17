package y12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310277a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f310277a, ((d) obj2).f310277a);
    }

    public final int hashCode() {
        String str = this.f310277a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public d(String str) {
        this.f310277a = str;
    }
}
