package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3 f113688c;

    public x(String str, String str2, e3 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f113686a = str;
        this.f113687b = str2;
        this.f113688c = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f113686a, xVar.f113686a) && Intrinsics.f(this.f113687b, xVar.f113687b) && this.f113688c == xVar.f113688c;
    }

    public final int hashCode() {
        String str = this.f113686a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f113687b;
        return this.f113688c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
