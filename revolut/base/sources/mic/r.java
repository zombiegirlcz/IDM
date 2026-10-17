package mic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205677a;

    public r(String str) {
        this.f205677a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f205677a, ((r) obj2).f205677a);
    }

    public final int hashCode() {
        String str = this.f205677a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
