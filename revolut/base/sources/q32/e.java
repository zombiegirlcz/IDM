package q32;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241774a;

    public e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f241774a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f241774a, ((e) obj2).f241774a);
    }

    public final int hashCode() {
        return this.f241774a.hashCode();
    }
}
