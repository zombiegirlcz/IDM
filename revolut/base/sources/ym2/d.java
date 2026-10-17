package ym2;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f314837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f314838c;
    public final boolean d;

    public d(String selectedThemeId, Map categorisedThemes, Set viewedFeaturedThemes, boolean z) {
        Intrinsics.checkNotNullParameter(selectedThemeId, "selectedThemeId");
        Intrinsics.checkNotNullParameter(categorisedThemes, "categorisedThemes");
        Intrinsics.checkNotNullParameter(viewedFeaturedThemes, "viewedFeaturedThemes");
        this.f314836a = selectedThemeId;
        this.f314837b = categorisedThemes;
        this.f314838c = viewedFeaturedThemes;
        this.d = z;
    }

    public static d a(d dVar, Map categorisedThemes, Set viewedFeaturedThemes, int i) {
        String selectedThemeId = dVar.f314836a;
        if ((i & 2) != 0) {
            categorisedThemes = dVar.f314837b;
        }
        if ((i & 4) != 0) {
            viewedFeaturedThemes = dVar.f314838c;
        }
        boolean z = (i & 8) != 0 ? dVar.d : true;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(selectedThemeId, "selectedThemeId");
        Intrinsics.checkNotNullParameter(categorisedThemes, "categorisedThemes");
        Intrinsics.checkNotNullParameter(viewedFeaturedThemes, "viewedFeaturedThemes");
        return new d(selectedThemeId, categorisedThemes, viewedFeaturedThemes, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f314836a, dVar.f314836a) && Intrinsics.f(this.f314837b, dVar.f314837b) && Intrinsics.f(this.f314838c, dVar.f314838c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.f(p.a.e(this.f314836a.hashCode() * 31, 31, this.f314837b), 31, this.f314838c);
    }
}
