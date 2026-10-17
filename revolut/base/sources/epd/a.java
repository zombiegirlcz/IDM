package epd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f128157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f128158c;

    public a(List colors, ArrayList icons, f currentSelection) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        this.f128156a = colors;
        this.f128157b = icons;
        this.f128158c = currentSelection;
    }

    public static a a(a aVar, f currentSelection) {
        List colors = aVar.f128156a;
        ArrayList icons = aVar.f128157b;
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        return new a(colors, icons, currentSelection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f128156a, aVar.f128156a) && this.f128157b.equals(aVar.f128157b) && this.f128158c.equals(aVar.f128158c);
    }

    public final int hashCode() {
        return this.f128158c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f128157b, this.f128156a.hashCode() * 31, 31);
    }
}
