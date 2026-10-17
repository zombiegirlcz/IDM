package du;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f117492a;

    public e(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f117492a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f117492a, ((e) obj2).f117492a);
    }

    public final int hashCode() {
        return this.f117492a.hashCode();
    }
}
