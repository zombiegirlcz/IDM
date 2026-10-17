package tde;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f269970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f269971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f269972c;
    public final String d;

    public b(Instant createdDate, Instant completedDate, Instant inTransitDate, String str) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        Intrinsics.checkNotNullParameter(inTransitDate, "inTransitDate");
        this.f269970a = createdDate;
        this.f269971b = completedDate;
        this.f269972c = inTransitDate;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f269970a, bVar.f269970a) && Intrinsics.f(this.f269971b, bVar.f269971b) && Intrinsics.f(this.f269972c, bVar.f269972c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = r6.b.c(r6.b.c(this.f269970a.hashCode() * 31, 31, this.f269971b), 31, this.f269972c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
