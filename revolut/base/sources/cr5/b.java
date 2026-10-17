package cr5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f108194a;

    public b(List beneficiaries) {
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        this.f108194a = beneficiaries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f108194a, ((b) obj2).f108194a);
    }

    public final int hashCode() {
        return this.f108194a.hashCode();
    }
}
