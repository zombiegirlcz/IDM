package fo2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f136781a;

    public d(b field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f136781a = field;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f136781a, ((d) obj2).f136781a);
    }

    public final int hashCode() {
        return this.f136781a.hashCode();
    }
}
