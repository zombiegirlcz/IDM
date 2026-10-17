package isl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f168310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f168311b;

    public f(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f168310a = title;
        this.f168311b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f168310a.equals(fVar.f168310a) && this.f168311b.equals(fVar.f168311b);
    }

    public final int hashCode() {
        return this.f168311b.hashCode() + (this.f168310a.hashCode() * 31);
    }
}
