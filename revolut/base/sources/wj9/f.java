package wj9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f298023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f298024b;

    public f(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f298023a = title;
        this.f298024b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f298023a.equals(fVar.f298023a) && this.f298024b.equals(fVar.f298024b);
    }

    public final int hashCode() {
        return this.f298024b.hashCode() + (this.f298023a.hashCode() * 31);
    }
}
