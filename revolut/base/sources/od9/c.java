package od9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224332a;

    public c() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f224332a, ((c) obj2).f224332a);
    }

    public final int hashCode() {
        String str = this.f224332a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public c(String str) {
        this.f224332a = str;
    }
}
