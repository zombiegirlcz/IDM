package e65;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f122898a;

    public f(List loans) {
        Intrinsics.checkNotNullParameter(loans, "loans");
        this.f122898a = loans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f122898a, ((f) obj2).f122898a);
    }

    public final int hashCode() {
        return this.f122898a.hashCode();
    }
}
