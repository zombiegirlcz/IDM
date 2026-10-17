package jgg;

import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f174043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f174044b;

    public g(TextLocalisedClause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f174043a = title;
        this.f174044b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f174043a.equals(gVar.f174043a) && Intrinsics.f(this.f174044b, gVar.f174044b);
    }

    public final int hashCode() {
        return this.f174044b.hashCode() + (this.f174043a.hashCode() * 31);
    }
}
