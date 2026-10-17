package a71;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f1733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f1735c;
    public final String d;
    public final boolean e;
    public final List f;

    public g(k userInfo, ArrayList representations, f footerInfo, String date, boolean z, List coOwners) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(representations, "representations");
        Intrinsics.checkNotNullParameter(footerInfo, "footerInfo");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(coOwners, "coOwners");
        this.f1733a = userInfo;
        this.f1734b = representations;
        this.f1735c = footerInfo;
        this.d = date;
        this.e = z;
        this.f = coOwners;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f1733a, gVar.f1733a) && this.f1734b.equals(gVar.f1734b) && this.f1735c.equals(gVar.f1735c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(p.a.c((this.f1735c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f1734b, this.f1733a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e);
    }
}
