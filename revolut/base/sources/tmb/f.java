package tmb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272177a;

    public f(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f272177a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f272177a, ((f) obj2).f272177a);
    }

    public final int hashCode() {
        return this.f272177a.hashCode();
    }
}
