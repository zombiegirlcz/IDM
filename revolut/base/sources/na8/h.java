package na8;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f213824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u98.a f213825b;

    public h(LocalDate date, u98.a reason) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f213824a = date;
        this.f213825b = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f213824a, hVar.f213824a) && this.f213825b == hVar.f213825b;
    }

    @Override // na8.k
    public final LocalDate getDate() {
        return this.f213824a;
    }

    public final int hashCode() {
        return this.f213825b.hashCode() + (this.f213824a.hashCode() * 31);
    }
}
