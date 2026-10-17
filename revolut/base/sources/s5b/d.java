package s5b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260056a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f260056a, ((d) obj2).f260056a);
    }

    public final int hashCode() {
        String str = this.f260056a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public d(String str) {
        this.f260056a = str;
    }
}
