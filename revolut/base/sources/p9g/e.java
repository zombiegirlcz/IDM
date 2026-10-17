package p9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234314a;

    public e(String rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f234314a = rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f234314a, ((e) obj2).f234314a);
    }

    public final int hashCode() {
        return this.f234314a.hashCode();
    }
}
