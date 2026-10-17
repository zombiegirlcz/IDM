package j4c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171345a;

    public m(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f171345a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f171345a, ((m) obj2).f171345a);
    }

    public final int hashCode() {
        return this.f171345a.hashCode();
    }
}
