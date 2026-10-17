package b4b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f12247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f12248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12249c;

    public u(Clause subtitle, TextLocalisedClause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f12247a = title;
        this.f12248b = subtitle;
        this.f12249c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f12247a.equals(uVar.f12247a) && Intrinsics.f(this.f12248b, uVar.f12248b) && Intrinsics.f(this.f12249c, uVar.f12249c);
    }

    public final int hashCode() {
        return this.f12249c.hashCode() + p.a.a(this.f12247a.hashCode() * 31, 31, this.f12248b);
    }
}
