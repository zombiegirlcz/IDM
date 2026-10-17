package u65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277488b;

    public d(String title, String documentUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(documentUrl, "documentUrl");
        this.f277487a = title;
        this.f277488b = documentUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f277487a, dVar.f277487a) && Intrinsics.f(this.f277488b, dVar.f277488b);
    }

    public final int hashCode() {
        return this.f277488b.hashCode() + (this.f277487a.hashCode() * 31);
    }
}
