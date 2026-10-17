package mvk;

import kotlin.jvm.internal.Intrinsics;
import od0.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f209268c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f209270b;

    static {
        i.Companion.getClass();
        f209268c = new b("ANNUAL_TAB", i.f224256b);
    }

    public b(String selectedTabId, i selectedCategory) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        this.f209269a = selectedTabId;
        this.f209270b = selectedCategory;
    }

    public static b a(b bVar, String selectedTabId, i selectedCategory, int i) {
        if ((i & 1) != 0) {
            selectedTabId = bVar.f209269a;
        }
        if ((i & 2) != 0) {
            selectedCategory = bVar.f209270b;
        }
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        return new b(selectedTabId, selectedCategory);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f209269a, bVar.f209269a) && Intrinsics.f(this.f209270b, bVar.f209270b);
    }

    public final int hashCode() {
        return this.f209270b.hashCode() + (this.f209269a.hashCode() * 31);
    }
}
