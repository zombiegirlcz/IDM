package qs4;

import cli.j;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f248746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f248747b;

    public d(LocalDate currentCycleDueDate, ArrayList discounts) {
        Intrinsics.checkNotNullParameter(currentCycleDueDate, "currentCycleDueDate");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        this.f248746a = currentCycleDueDate;
        this.f248747b = discounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f248746a, dVar.f248746a) && this.f248747b.equals(dVar.f248747b);
    }

    public final int hashCode() {
        return this.f248747b.hashCode() + (this.f248746a.hashCode() * 31);
    }
}
