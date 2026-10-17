package mkl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206501a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f206501a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f206501a, ((b) obj2).f206501a);
    }

    public final int hashCode() {
        return this.f206501a.hashCode();
    }
}
