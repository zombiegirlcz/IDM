package wpl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f299356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f299357b;

    public b(TextLocalisedClause title, Function1 valueCreator) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(valueCreator, "valueCreator");
        this.f299356a = title;
        this.f299357b = valueCreator;
    }

    public final Clause a(Style style) {
        return (Clause) this.f299357b.invoke(style);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f299356a.equals(bVar.f299356a) && this.f299357b.equals(bVar.f299357b);
    }

    public final int hashCode() {
        return this.f299357b.hashCode() + (this.f299356a.hashCode() * 31);
    }
}
