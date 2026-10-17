package x08;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f301535a;

    public g(List notifications) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.f301535a = notifications;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f301535a, ((g) obj2).f301535a);
    }

    public final int hashCode() {
        return this.f301535a.hashCode();
    }
}
