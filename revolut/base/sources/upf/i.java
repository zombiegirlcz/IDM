package upf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282024a;

    public i(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f282024a = value;
    }

    @Override // upf.j
    public final String a() {
        return "recipientPhone";
    }

    @Override // upf.j
    public final String b() {
        return this.f282024a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f282024a, ((i) obj2).f282024a);
    }

    public final int hashCode() {
        return this.f282024a.hashCode();
    }
}
