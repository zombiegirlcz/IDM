package c17;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f20397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f20398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f20399c;

    public m(CompositeClause description, TextLocalisedClause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f20397a = title;
        this.f20398b = description;
        this.f20399c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f20397a.equals(mVar.f20397a) && this.f20398b.equals(mVar.f20398b) && Intrinsics.f(this.f20399c, mVar.f20399c);
    }

    public final int hashCode() {
        return this.f20399c.hashCode() + h30.l.c(this.f20398b, this.f20397a.hashCode() * 31, 31);
    }
}
