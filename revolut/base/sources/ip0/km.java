package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class km implements tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an f165040a;

    public km() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof km) && this.f165040a == ((km) obj2).f165040a;
    }

    public final int hashCode() {
        return this.f165040a.hashCode();
    }

    public /* synthetic */ km(int i) {
        this(an.ITEMS_ONLY);
    }

    public km(an scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f165040a = scope;
    }
}
