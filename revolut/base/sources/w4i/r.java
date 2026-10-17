package w4i;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f294585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f294586b;

    public r(CompositeClause description, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f294585a = title;
        this.f294586b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f294585a.equals(rVar.f294585a) && this.f294586b.equals(rVar.f294586b);
    }

    public final int hashCode() {
        return this.f294586b.hashCode() + (this.f294585a.hashCode() * 31);
    }
}
