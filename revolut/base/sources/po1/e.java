package po1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237877a;

    public e(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f237877a = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f237877a, ((e) obj2).f237877a);
    }

    public final int hashCode() {
        return this.f237877a.hashCode();
    }
}
