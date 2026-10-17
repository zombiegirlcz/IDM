package v4g;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f286081a;

    public j(Set selectedBaggageTokens) {
        Intrinsics.checkNotNullParameter(selectedBaggageTokens, "selectedBaggageTokens");
        this.f286081a = selectedBaggageTokens;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f286081a, ((j) obj2).f286081a);
    }

    public final int hashCode() {
        return this.f286081a.hashCode();
    }
}
