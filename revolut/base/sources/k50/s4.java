package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f181243b;

    public s4(String text, long j2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f181242a = text;
        this.f181243b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj2;
        return Intrinsics.f(this.f181242a, s4Var.f181242a) && this.f181243b == s4Var.f181243b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f181243b) + (this.f181242a.hashCode() * 31);
    }
}
