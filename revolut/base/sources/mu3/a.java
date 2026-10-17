package mu3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f208944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f208945c;
    public final ArrayList d;

    public a(String id10, String title, String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f208943a = id10;
        this.f208944b = title;
        this.f208945c = str;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f208943a, aVar.f208943a) && Intrinsics.f(this.f208944b, aVar.f208944b) && Intrinsics.f(this.f208945c, aVar.f208945c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f208943a.hashCode() * 31, 31, this.f208944b);
        String str = this.f208945c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
