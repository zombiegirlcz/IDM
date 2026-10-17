package z3a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319232a;

    public g(String buttonTag) {
        Intrinsics.checkNotNullParameter(buttonTag, "buttonTag");
        this.f319232a = buttonTag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f319232a, ((g) obj2).f319232a);
    }

    public final int hashCode() {
        return this.f319232a.hashCode();
    }
}
