package od9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224333a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f224333a, ((d) obj2).f224333a);
    }

    public final int hashCode() {
        String str = this.f224333a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public d(String str) {
        this.f224333a = str;
    }
}
