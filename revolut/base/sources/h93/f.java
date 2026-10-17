package h93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f150108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f150109b;

    public f(LocalDate from, LocalDate to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f150108a = from;
        this.f150109b = to6;
    }

    public final LocalDate a() {
        return this.f150109b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f150108a, fVar.f150108a) && Intrinsics.f(this.f150109b, fVar.f150109b);
    }

    public final int hashCode() {
        return this.f150109b.hashCode() + (this.f150108a.hashCode() * 31);
    }
}
