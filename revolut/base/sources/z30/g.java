package z30;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f319114a;

    public g(ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f319114a = options;
    }

    @Override // z30.j
    public final List a() {
        return this.f319114a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f319114a.equals(((g) obj2).f319114a);
    }

    public final int hashCode() {
        return this.f319114a.hashCode();
    }
}
