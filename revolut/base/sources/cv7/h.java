package cv7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109301a;

    public h(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f109301a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f109301a, ((h) obj2).f109301a);
    }

    public final int hashCode() {
        return this.f109301a.hashCode();
    }
}
