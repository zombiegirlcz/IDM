package ap7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8104a;

    public e(List drivers) {
        Intrinsics.checkNotNullParameter(drivers, "drivers");
        this.f8104a = drivers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f8104a, ((e) obj2).f8104a);
    }

    public final int hashCode() {
        return this.f8104a.hashCode();
    }
}
