package ts7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274041a;

    public a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f274041a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f274041a, ((a) obj2).f274041a);
    }

    public final int hashCode() {
        return this.f274041a.hashCode();
    }
}
