package mid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205759a;

    public t(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f205759a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f205759a, ((t) obj2).f205759a);
    }

    public final int hashCode() {
        return this.f205759a.hashCode();
    }
}
