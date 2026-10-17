package tde;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f269982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f269983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f269984c;
    public final String d;

    public g(Instant createdDate, Instant inTransitDate, Instant completedDate, String str) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(inTransitDate, "inTransitDate");
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        this.f269982a = createdDate;
        this.f269983b = inTransitDate;
        this.f269984c = completedDate;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f269982a, gVar.f269982a) && Intrinsics.f(this.f269983b, gVar.f269983b) && Intrinsics.f(this.f269984c, gVar.f269984c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = r6.b.c(r6.b.c(this.f269982a.hashCode() * 31, 31, this.f269983b), 31, this.f269984c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
