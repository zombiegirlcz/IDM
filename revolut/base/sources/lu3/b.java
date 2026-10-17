package lu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200015b;

    public b(String name, String pdfUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
        this.f200014a = name;
        this.f200015b = pdfUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f200014a, bVar.f200014a) && Intrinsics.f(this.f200015b, bVar.f200015b);
    }

    public final int hashCode() {
        return this.f200015b.hashCode() + (this.f200014a.hashCode() * 31);
    }
}
