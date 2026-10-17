package upf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282021a;

    public f(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f282021a = value;
    }

    @Override // upf.j
    public final String a() {
        return "recipientCode";
    }

    @Override // upf.j
    public final String b() {
        return this.f282021a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f282021a, ((f) obj2).f282021a);
    }

    public final int hashCode() {
        return this.f282021a.hashCode();
    }
}
