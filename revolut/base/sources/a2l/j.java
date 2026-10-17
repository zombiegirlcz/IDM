package a2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f910b;

    public j(String text, String url2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f909a = text;
        this.f910b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f909a, jVar.f909a) && Intrinsics.f(this.f910b, jVar.f910b);
    }

    public final int hashCode() {
        return this.f910b.hashCode() + (this.f909a.hashCode() * 31);
    }
}
