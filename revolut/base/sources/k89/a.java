package k89;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182101b;

    public a(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f182100a = title;
        this.f182101b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f182100a, aVar.f182100a) && Intrinsics.f(this.f182101b, aVar.f182101b);
    }

    public final int hashCode() {
        return this.f182101b.hashCode() + (this.f182100a.hashCode() * 31);
    }
}
