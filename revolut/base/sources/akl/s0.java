package akl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f6088c;

    public s0(String clientId, Integer num, String sessionToken) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        this.f6086a = clientId;
        this.f6087b = sessionToken;
        this.f6088c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f6086a, s0Var.f6086a) && Intrinsics.f(this.f6087b, s0Var.f6087b) && Intrinsics.f(this.f6088c, s0Var.f6088c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f6086a.hashCode() * 31, 31, this.f6087b);
        Integer num = this.f6088c;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
