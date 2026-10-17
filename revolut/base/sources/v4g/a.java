package v4g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f286072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f286073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f286074c;
    public final List d;

    public a(TextLocalisedClause title, TextLocalisedClause description, Integer num, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f286072a = title;
        this.f286073b = description;
        this.f286074c = num;
        this.d = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f286072a.equals(aVar.f286072a) && this.f286073b.equals(aVar.f286073b) && this.f286074c.equals(aVar.f286074c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f286074c.hashCode() + t61.a.a(this.f286072a.hashCode() * 31, 31, this.f286073b)) * 31);
    }
}
