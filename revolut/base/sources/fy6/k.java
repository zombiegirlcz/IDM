package fy6;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f138941a;

    public k(LocalDate localDate) {
        this.f138941a = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f138941a, ((k) obj2).f138941a);
    }

    public final int hashCode() {
        LocalDate localDate = this.f138941a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }
}
