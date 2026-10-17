package zhb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f322383b;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f322382a, bVar.f322382a) && this.f322383b == bVar.f322383b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322383b) + (this.f322382a.hashCode() * 31);
    }

    public b(String email, boolean z) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f322382a = email;
        this.f322383b = z;
    }

    public /* synthetic */ b(int i) {
        this("", false);
    }
}
