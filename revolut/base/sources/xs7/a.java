package xs7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308428a;

    public a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f308428a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f308428a, ((a) obj2).f308428a);
    }

    public final int hashCode() {
        return this.f308428a.hashCode();
    }
}
