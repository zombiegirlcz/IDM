package dl7;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f115711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f115713c;

    public b(a subtype, String title, String str) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f115711a = subtype;
        this.f115712b = title;
        this.f115713c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f115711a == bVar.f115711a && Intrinsics.f(this.f115712b, bVar.f115712b) && Intrinsics.f(this.f115713c, bVar.f115713c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f115711a.hashCode() * 31, 31, this.f115712b);
        String str = this.f115713c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
