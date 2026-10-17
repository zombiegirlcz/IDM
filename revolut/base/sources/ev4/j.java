package ev4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f129714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f129715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f129716c;

    public j(TextLocalisedClause title, TextLocalisedClause toolbarTitle, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f129714a = title;
        this.f129715b = toolbarTitle;
        this.f129716c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f129714a.equals(jVar.f129714a) && this.f129715b.equals(jVar.f129715b) && this.f129716c.equals(jVar.f129716c);
    }

    public final int hashCode() {
        return this.f129716c.hashCode() + t61.a.a(this.f129714a.hashCode() * 31, 31, this.f129715b);
    }
}
