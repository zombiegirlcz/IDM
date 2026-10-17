package g65;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140876a;

    public d(List loans) {
        Intrinsics.checkNotNullParameter(loans, "loans");
        this.f140876a = loans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f140876a, ((d) obj2).f140876a);
    }

    public final int hashCode() {
        return this.f140876a.hashCode();
    }
}
