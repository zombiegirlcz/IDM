package hq9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154647a;

    public l(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f154647a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f154647a, ((l) obj2).f154647a);
    }

    public final int hashCode() {
        return this.f154647a.hashCode();
    }
}
