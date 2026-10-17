package ara;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f8608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f8609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8610c;

    public n(TextLocalisedClause title, TextLocalisedClause description, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f8608a = title;
        this.f8609b = description;
        this.f8610c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f8608a.equals(nVar.f8608a) && this.f8609b.equals(nVar.f8609b) && Intrinsics.f(this.f8610c, nVar.f8610c);
    }

    public final int hashCode() {
        return this.f8610c.hashCode() + t61.a.a(this.f8608a.hashCode() * 31, 31, this.f8609b);
    }
}
