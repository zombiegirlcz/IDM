package at;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8966a;

    public l(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f8966a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f8966a, ((l) obj2).f8966a);
    }

    public final int hashCode() {
        return this.f8966a.hashCode();
    }
}
