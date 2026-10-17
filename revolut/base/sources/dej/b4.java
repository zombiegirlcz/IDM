package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f113501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f113502c;

    public b4(String str, o1 state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f113500a = str;
        this.f113501b = state;
        this.f113502c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return Intrinsics.f(this.f113500a, b4Var.f113500a) && this.f113501b == b4Var.f113501b && this.f113502c == b4Var.f113502c;
    }

    public final int hashCode() {
        String str = this.f113500a;
        return Boolean.hashCode(this.f113502c) + ((this.f113501b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }
}
