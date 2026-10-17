package ta8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f269165a;

    public l(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f269165a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f269165a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f269165a, ((l) obj2).f269165a);
    }

    public final int hashCode() {
        return this.f269165a.hashCode();
    }
}
