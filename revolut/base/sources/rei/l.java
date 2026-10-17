package rei;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f253627c;

    public l(String id10, String name, ArrayList images) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        this.f253625a = id10;
        this.f253626b = name;
        this.f253627c = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f253625a, lVar.f253625a) && Intrinsics.f(this.f253626b, lVar.f253626b) && this.f253627c.equals(lVar.f253627c);
    }

    public final int hashCode() {
        return this.f253627c.hashCode() + p.a.c(this.f253625a.hashCode() * 31, 31, this.f253626b);
    }
}
