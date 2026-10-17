package b1h;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f11804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f11805b;

    public e(TextLocalisedClause startLabel, TextLocalisedClause endLabel) {
        Intrinsics.checkNotNullParameter("recommended-buy-collection-list-id", "listId");
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        this.f11804a = startLabel;
        this.f11805b = endLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f11804a.equals(eVar.f11804a) && this.f11805b.equals(eVar.f11805b);
    }

    public final int hashCode() {
        return Integer.hashCode(9) + t61.a.a(t61.a.a(395488172, 31, this.f11804a), 31, this.f11805b);
    }
}
