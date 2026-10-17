package q32;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241773a;

    public d(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f241773a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f241773a, ((d) obj2).f241773a);
    }

    public final int hashCode() {
        return this.f241773a.hashCode();
    }
}
