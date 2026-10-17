package ei1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126347a;

    public g(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f126347a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f126347a, ((g) obj2).f126347a);
    }

    public final int hashCode() {
        return this.f126347a.hashCode();
    }
}
