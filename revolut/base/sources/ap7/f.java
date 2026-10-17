package ap7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8105a;

    public f(List drivers) {
        Intrinsics.checkNotNullParameter(drivers, "drivers");
        this.f8105a = drivers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f8105a, ((f) obj2).f8105a);
    }

    public final int hashCode() {
        return this.f8105a.hashCode();
    }
}
