package fo2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f136782a;

    public e(b field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f136782a = field;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f136782a, ((e) obj2).f136782a);
    }

    public final int hashCode() {
        return this.f136782a.hashCode();
    }
}
