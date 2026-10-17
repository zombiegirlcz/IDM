package pgb;

import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f235849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f235850b;

    public r(TextClause title, List pages) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f235849a = title;
        this.f235850b = pages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f235849a.equals(rVar.f235849a) && Intrinsics.f(this.f235850b, rVar.f235850b);
    }

    public final int hashCode() {
        return this.f235850b.hashCode() + (this.f235849a.hashCode() * 31);
    }
}
