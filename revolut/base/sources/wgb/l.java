package wgb;

import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f297283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f297284b;

    public l(TextClause title, List pages) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f297283a = title;
        this.f297284b = pages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f297283a.equals(lVar.f297283a) && Intrinsics.f(this.f297284b, lVar.f297284b);
    }

    public final int hashCode() {
        return this.f297284b.hashCode() + (this.f297283a.hashCode() * 31);
    }
}
