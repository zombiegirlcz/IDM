package bp4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f17555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f17556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f17557c;

    public d(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause actionTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        this.f17555a = title;
        this.f17556b = description;
        this.f17557c = actionTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f17555a.equals(dVar.f17555a) && this.f17556b.equals(dVar.f17556b) && this.f17557c.equals(dVar.f17557c);
    }

    public final int hashCode() {
        return this.f17557c.hashCode() + t61.a.a(this.f17555a.hashCode() * 31, 31, this.f17556b);
    }
}
