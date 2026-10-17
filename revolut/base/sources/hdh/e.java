package hdh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151437a;

    public e(List actionsInfo) {
        Intrinsics.checkNotNullParameter(actionsInfo, "actionsInfo");
        this.f151437a = actionsInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f151437a, ((e) obj2).f151437a);
    }

    public final int hashCode() {
        return this.f151437a.hashCode();
    }
}
