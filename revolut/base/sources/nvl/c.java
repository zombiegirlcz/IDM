package nvl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f219745a;

    public c(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f219745a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f219745a, ((c) obj2).f219745a);
    }

    public final int hashCode() {
        return this.f219745a.hashCode();
    }
}
