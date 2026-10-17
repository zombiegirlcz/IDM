package e17;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121898b;

    public b(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f121898b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f121898b, ((b) obj2).f121898b);
    }

    public final int hashCode() {
        return this.f121898b.hashCode();
    }
}
