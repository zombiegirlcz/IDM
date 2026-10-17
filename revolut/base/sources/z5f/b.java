package z5f;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f319613b;

    public b(String title, BigDecimal value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f319612a = title;
        this.f319613b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f319612a, bVar.f319612a) && Intrinsics.f(this.f319613b, bVar.f319613b);
    }

    public final int hashCode() {
        return this.f319613b.hashCode() + (this.f319612a.hashCode() * 31);
    }
}
