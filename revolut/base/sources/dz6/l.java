package dz6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f121246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f121247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f121248c;

    public l(TextLocalisedClause title, TextLocalisedClause caption, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f121246a = title;
        this.f121247b = caption;
        this.f121248c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f121246a.equals(lVar.f121246a) && this.f121247b.equals(lVar.f121247b) && Intrinsics.f(this.f121248c, lVar.f121248c);
    }

    public final int hashCode() {
        return this.f121248c.hashCode() + t61.a.a(this.f121246a.hashCode() * 31, 31, this.f121247b);
    }
}
