package rv7;

import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f257724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257725b;

    public g(TextClause title, List values) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f257724a = title;
        this.f257725b = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f257724a.equals(gVar.f257724a) && Intrinsics.f(this.f257725b, gVar.f257725b);
    }

    public final int hashCode() {
        return this.f257725b.hashCode() + (this.f257724a.hashCode() * 31);
    }
}
