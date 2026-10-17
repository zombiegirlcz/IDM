package upf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282023a;

    public h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f282023a = value;
    }

    @Override // upf.j
    public final String a() {
        return "recipientId";
    }

    @Override // upf.j
    public final String b() {
        return this.f282023a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f282023a, ((h) obj2).f282023a);
    }

    public final int hashCode() {
        return this.f282023a.hashCode();
    }
}
