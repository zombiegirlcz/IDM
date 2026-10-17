package v23;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285632a;

    public g(String selectedName) {
        Intrinsics.checkNotNullParameter(selectedName, "selectedName");
        this.f285632a = selectedName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f285632a, ((g) obj2).f285632a);
    }

    public final int hashCode() {
        return this.f285632a.hashCode();
    }
}
