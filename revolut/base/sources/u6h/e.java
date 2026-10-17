package u6h;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f277595a;

    public e(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f277595a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f277595a.equals(((e) obj2).f277595a);
    }

    public final int hashCode() {
        return this.f277595a.hashCode();
    }
}
