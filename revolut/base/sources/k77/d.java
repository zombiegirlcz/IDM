package k77;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f181828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f181829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f181830c;
    public final LocalDate d;

    public d(dj0.d current, dj0.d dVar, LocalDate updatedAt, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f181828a = current;
        this.f181829b = updatedAt;
        this.f181830c = dVar;
        this.d = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f181828a, dVar.f181828a) && Intrinsics.f(this.f181829b, dVar.f181829b) && Intrinsics.f(this.f181830c, dVar.f181830c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iA = y.a(this.f181828a.hashCode() * 31, 31, this.f181829b);
        dj0.d dVar = this.f181830c;
        int iHashCode = (iA + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate = this.d;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }
}
