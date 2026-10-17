package yy6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f317853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f317854b;

    public p(TextLocalisedClause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f317853a = title;
        this.f317854b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f317853a.equals(pVar.f317853a) && Intrinsics.f(this.f317854b, pVar.f317854b);
    }

    public final int hashCode() {
        return this.f317854b.hashCode() + (this.f317853a.hashCode() * 31);
    }
}
