package vm5;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f290536a;

    public e(LocalDate localDate) {
        this.f290536a = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f290536a, ((e) obj2).f290536a);
    }

    public final int hashCode() {
        LocalDate localDate = this.f290536a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }
}
