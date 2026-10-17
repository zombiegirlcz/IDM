package t5e;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f268059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f268060b;

    public b(TextLocalisedClause title, TextClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f268059a = title;
        this.f268060b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f268059a.equals(bVar.f268059a) && this.f268060b.equals(bVar.f268060b);
    }

    public final int hashCode() {
        return this.f268060b.hashCode() + (this.f268059a.hashCode() * 31);
    }
}
