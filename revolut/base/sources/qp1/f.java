package qp1;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f248234a;

    public f(LocalDate value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f248234a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f248234a, ((f) obj2).f248234a);
    }

    public final int hashCode() {
        return this.f248234a.hashCode();
    }
}
