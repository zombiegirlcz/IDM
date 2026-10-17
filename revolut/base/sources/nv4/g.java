package nv4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f219462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219463b;

    public g(String statementLink, LocalDate referenceDate) {
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        Intrinsics.checkNotNullParameter(statementLink, "statementLink");
        this.f219462a = referenceDate;
        this.f219463b = statementLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f219462a, gVar.f219462a) && Intrinsics.f(this.f219463b, gVar.f219463b);
    }

    public final int hashCode() {
        return this.f219463b.hashCode() + (this.f219462a.hashCode() * 31);
    }
}
