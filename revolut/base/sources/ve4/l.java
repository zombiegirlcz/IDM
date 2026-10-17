package ve4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy3.i f288119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f288121c;
    public final long d;

    public l(yy3.i method, String processId, String oneTimePassword, long j2) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(processId, "processId");
        Intrinsics.checkNotNullParameter(oneTimePassword, "oneTimePassword");
        this.f288119a = method;
        this.f288120b = processId;
        this.f288121c = oneTimePassword;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f288119a, lVar.f288119a) && Intrinsics.f(this.f288120b, lVar.f288120b) && Intrinsics.f(this.f288121c, lVar.f288121c) && this.d == lVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + p.a.c(p.a.c(this.f288119a.hashCode() * 31, 31, this.f288120b), 31, this.f288121c);
    }
}
