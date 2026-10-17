package mid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205756a;

    public s(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f205756a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f205756a, ((s) obj2).f205756a);
    }

    public final int hashCode() {
        return this.f205756a.hashCode();
    }
}
