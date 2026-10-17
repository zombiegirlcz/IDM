package u91;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f278385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f278386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f278387c;
    public final boolean d;

    public u(LocalDate createdDate, LocalDate estimatedCompletionDate, LocalDate estimatedClosureDate, boolean z) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(estimatedCompletionDate, "estimatedCompletionDate");
        Intrinsics.checkNotNullParameter(estimatedClosureDate, "estimatedClosureDate");
        this.f278385a = createdDate;
        this.f278386b = estimatedCompletionDate;
        this.f278387c = estimatedClosureDate;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f278385a, uVar.f278385a) && Intrinsics.f(this.f278386b, uVar.f278386b) && Intrinsics.f(this.f278387c, uVar.f278387c) && this.d == uVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + y.a(y.a(this.f278385a.hashCode() * 31, 31, this.f278386b), 31, this.f278387c);
    }
}
