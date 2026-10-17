package rd6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253355a;

    public f(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f253355a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f253355a, ((f) obj2).f253355a);
    }

    public final int hashCode() {
        return this.f253355a.hashCode();
    }
}
