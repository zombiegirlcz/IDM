package rx6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f258050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f258051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f258052c;

    public p(TextLocalisedClause title, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f258050a = title;
        this.f258051b = menuItems;
        this.f258052c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f258050a.equals(pVar.f258050a) && this.f258051b.equals(pVar.f258051b) && this.f258052c == pVar.f258052c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258052c) + p.a.d(this.f258050a.hashCode() * 31, 31, this.f258051b);
    }
}
