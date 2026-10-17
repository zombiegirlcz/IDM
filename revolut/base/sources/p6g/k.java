package p6g;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f233288a;

    public k(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f233288a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f233288a, ((k) obj2).f233288a);
    }

    public final int hashCode() {
        return this.f233288a.hashCode();
    }
}
