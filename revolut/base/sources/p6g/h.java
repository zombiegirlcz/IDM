package p6g;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f233283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f233284b;

    public h(LocalDate initial, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(localDate, "final");
        this.f233283a = initial;
        this.f233284b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f233283a, hVar.f233283a) && Intrinsics.f(this.f233284b, hVar.f233284b);
    }

    public final int hashCode() {
        return this.f233284b.hashCode() + (this.f233283a.hashCode() * 31);
    }
}
