package u09;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f276128c;
    public final ArrayList d;
    public final List e;

    public i(String category, String title, j variant, ArrayList courses, List productDomains) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(courses, "courses");
        Intrinsics.checkNotNullParameter(productDomains, "productDomains");
        this.f276126a = category;
        this.f276127b = title;
        this.f276128c = variant;
        this.d = courses;
        this.e = productDomains;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f276126a, iVar.f276126a) && Intrinsics.f(this.f276127b, iVar.f276127b) && this.f276128c == iVar.f276128c && this.d.equals(iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f276128c.hashCode() + p.a.c(this.f276126a.hashCode() * 31, 31, this.f276127b)) * 31, 31);
    }
}
