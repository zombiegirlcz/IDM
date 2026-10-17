package pm6;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237478a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f237478a, ((b) obj2).f237478a);
    }

    public final int hashCode() {
        return this.f237478a.hashCode();
    }

    public b(int i) {
        Intrinsics.checkNotNullParameter("", "content");
        this.f237478a = "";
    }
}
