package k50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f181041b;

    public c1(List suggestions, v0 placement) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f181040a = suggestions;
        this.f181041b = placement;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f181040a, c1Var.f181040a) && this.f181041b == c1Var.f181041b;
    }

    public final int hashCode() {
        return this.f181041b.hashCode() + (this.f181040a.hashCode() * 31);
    }
}
