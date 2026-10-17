package xid;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f306330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f306331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f306332c;
    public final double d;

    public g(double d, List bidOptions, double d5, double d6) {
        Intrinsics.checkNotNullParameter(bidOptions, "bidOptions");
        this.f306330a = d;
        this.f306331b = bidOptions;
        this.f306332c = d5;
        this.d = d6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Double.compare(this.f306330a, gVar.f306330a) == 0 && Intrinsics.f(this.f306331b, gVar.f306331b) && Double.compare(this.f306332c, gVar.f306332c) == 0 && Double.compare(this.d, gVar.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + m72.b.c(p.a.d(Double.hashCode(this.f306330a) * 31, 31, this.f306331b), this.f306332c, 31);
    }
}
