package du3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117553c;
    public final String d;
    public final String e;
    public final boolean f;

    public a(String id10, String displayName, String str, String documentHtmlUrl, String documentPdfUrl, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(documentHtmlUrl, "documentHtmlUrl");
        Intrinsics.checkNotNullParameter(documentPdfUrl, "documentPdfUrl");
        this.f117551a = id10;
        this.f117552b = displayName;
        this.f117553c = str;
        this.d = documentHtmlUrl;
        this.e = documentPdfUrl;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f117551a, aVar.f117551a) && Intrinsics.f(this.f117552b, aVar.f117552b) && Intrinsics.f(this.f117553c, aVar.f117553c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f117551a.hashCode() * 31, 31, this.f117552b);
        String str = this.f117553c;
        return Boolean.hashCode(this.f) + p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
