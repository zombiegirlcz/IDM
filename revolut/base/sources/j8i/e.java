package j8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172217a;

    public e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f172217a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f172217a, ((e) obj2).f172217a);
    }

    public final int hashCode() {
        return this.f172217a.hashCode();
    }
}
