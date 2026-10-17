package ve4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f288122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f288123b;

    public o(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f288122a = title;
        this.f288123b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f288122a.equals(oVar.f288122a) && this.f288123b.equals(oVar.f288123b);
    }

    public final int hashCode() {
        return this.f288123b.hashCode() + (this.f288122a.hashCode() * 31);
    }
}
