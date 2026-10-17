package g2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140000a;

    public j() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f140000a, ((j) obj2).f140000a);
    }

    public final int hashCode() {
        String str = this.f140000a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public j(String str) {
        this.f140000a = str;
    }
}
