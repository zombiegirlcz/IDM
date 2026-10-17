package du3;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117556c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f117557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f117558h;
    public final List i;

    public b(String id10, String displayName, String str, String htmlUrl, String pdfUrl, String buttonText, String str2, boolean z, List checkboxes) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(htmlUrl, "htmlUrl");
        Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(checkboxes, "checkboxes");
        this.f117554a = id10;
        this.f117555b = displayName;
        this.f117556c = str;
        this.d = htmlUrl;
        this.e = pdfUrl;
        this.f = buttonText;
        this.f117557g = str2;
        this.f117558h = z;
        this.i = checkboxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f117554a, bVar.f117554a) && Intrinsics.f(this.f117555b, bVar.f117555b) && Intrinsics.f(this.f117556c, bVar.f117556c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f117557g, bVar.f117557g) && this.f117558h == bVar.f117558h && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f117554a.hashCode() * 31, 31, this.f117555b);
        String str = this.f117556c;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.f117557g;
        return this.i.hashCode() + j6.a.c((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f117558h);
    }
}
