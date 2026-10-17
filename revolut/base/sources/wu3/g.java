package wu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f300059c;

    public g(String title, String str, f document) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f300057a = title;
        this.f300058b = str;
        this.f300059c = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f300057a, gVar.f300057a) && Intrinsics.f(this.f300058b, gVar.f300058b) && Intrinsics.f(this.f300059c, gVar.f300059c);
    }

    public final int hashCode() {
        int iHashCode = this.f300057a.hashCode() * 31;
        String str = this.f300058b;
        return this.f300059c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
