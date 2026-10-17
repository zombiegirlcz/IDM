package du;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117494a;

    public g(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f117494a = number;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f117494a, ((g) obj2).f117494a);
    }

    public final int hashCode() {
        return this.f117494a.hashCode();
    }
}
