package wga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oga.j f297274a;

    public g(oga.j text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f297274a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f297274a, ((g) obj2).f297274a);
    }

    public final int hashCode() {
        return this.f297274a.hashCode();
    }
}
