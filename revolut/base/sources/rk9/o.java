package rk9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f254779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f254780b;

    public o(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f254779a = title;
        this.f254780b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f254779a.equals(oVar.f254779a) && this.f254780b.equals(oVar.f254780b);
    }

    public final int hashCode() {
        return this.f254780b.hashCode() + (this.f254779a.hashCode() * 31);
    }
}
