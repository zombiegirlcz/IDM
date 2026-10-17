package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f209928b;

    public p6(String str, String toItemId) {
        Intrinsics.checkNotNullParameter(toItemId, "toItemId");
        this.f209927a = str;
        this.f209928b = toItemId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj2;
        return Intrinsics.f(this.f209927a, p6Var.f209927a) && Intrinsics.f(this.f209928b, p6Var.f209928b);
    }

    public final int hashCode() {
        String str = this.f209927a;
        return p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f209928b);
    }
}
