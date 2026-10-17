package upf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282022a;

    public g(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f282022a = value;
    }

    @Override // upf.j
    public final String a() {
        return "recipientEmail";
    }

    @Override // upf.j
    public final String b() {
        return this.f282022a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f282022a, ((g) obj2).f282022a);
    }

    public final int hashCode() {
        return this.f282022a.hashCode();
    }
}
