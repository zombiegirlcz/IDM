package lr4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f199390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f199391c;

    public a(int i, TextLocalisedClause title, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f199389a = id10;
        this.f199390b = title;
        this.f199391c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f199389a, aVar.f199389a) && this.f199390b.equals(aVar.f199390b) && this.f199391c == aVar.f199391c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f199391c) + t61.a.a(this.f199389a.hashCode() * 31, 961, this.f199390b);
    }
}
