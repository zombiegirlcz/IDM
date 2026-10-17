package uif;

import com.revolut.domain.interactors.transactions.Priority;
import kotlin.jvm.internal.Intrinsics;
import ueg.p0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f280420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Priority f280421b;

    public a(long j2, Priority priority) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f280420a = j2;
        this.f280421b = priority;
    }

    public final long a() {
        return this.f280420a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        a other = (a) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        return cim.b.c(this, other, new p0(25), new p0(26));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f280420a == aVar.f280420a && Intrinsics.f(this.f280421b, aVar.f280421b);
    }

    public final int hashCode() {
        return this.f280421b.hashCode() + (Long.hashCode(this.f280420a) * 31);
    }
}
