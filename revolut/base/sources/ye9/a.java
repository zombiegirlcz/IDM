package ye9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f312821a;

    public a(List validationErrors) {
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        this.f312821a = validationErrors;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f312821a, ((a) obj2).f312821a);
    }

    public final int hashCode() {
        return this.f312821a.hashCode();
    }
}
