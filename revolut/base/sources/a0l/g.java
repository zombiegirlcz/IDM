package a0l;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f434c;

    public g(TextClause title, TextClause textClause, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f432a = title;
        this.f433b = textClause;
        this.f434c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f432a.equals(gVar.f432a) && this.f433b.equals(gVar.f433b) && this.f434c.equals(gVar.f434c);
    }

    public final int hashCode() {
        return this.f434c.hashCode() + v7.b(this.f432a.hashCode() * 31, 31, this.f433b);
    }
}
