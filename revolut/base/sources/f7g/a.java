package f7g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f132606a;

    public a(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f132606a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f132606a.equals(((a) obj2).f132606a);
    }

    public final int hashCode() {
        return this.f132606a.hashCode();
    }
}
