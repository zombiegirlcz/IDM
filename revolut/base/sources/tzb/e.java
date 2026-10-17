package tzb;

import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f275903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f275904b;

    public e(TextClause title, List pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f275903a = pages;
        this.f275904b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f275903a, eVar.f275903a) && this.f275904b.equals(eVar.f275904b);
    }

    public final int hashCode() {
        return this.f275904b.hashCode() + (this.f275903a.hashCode() * 31);
    }
}
