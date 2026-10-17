package ko8;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f186274b;

    public h(TextClause headerTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        this.f186273a = items;
        this.f186274b = headerTitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f186273a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f186273a, hVar.f186273a) && this.f186274b.equals(hVar.f186274b);
    }

    public final int hashCode() {
        return this.f186274b.hashCode() + (this.f186273a.hashCode() * 31);
    }
}
