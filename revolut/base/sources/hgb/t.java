package hgb;

import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f152153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f152154b;

    public t(TextClause title, List pages) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f152153a = title;
        this.f152154b = pages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f152153a.equals(tVar.f152153a) && Intrinsics.f(this.f152154b, tVar.f152154b);
    }

    public final int hashCode() {
        return this.f152154b.hashCode() + (this.f152153a.hashCode() * 31);
    }
}
