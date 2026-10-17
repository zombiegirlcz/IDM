package i47;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f158296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f158297b;

    public l(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f158296a = title;
        this.f158297b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f158296a.equals(lVar.f158296a) && this.f158297b.equals(lVar.f158297b);
    }

    public final int hashCode() {
        return this.f158297b.hashCode() + (this.f158296a.hashCode() * 31);
    }
}
