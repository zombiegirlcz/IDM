package ikk;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f161996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f161997b;

    public h(TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f161996a = items;
        this.f161997b = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f161996a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f161996a, hVar.f161996a) && this.f161997b.equals(hVar.f161997b);
    }

    public final int hashCode() {
        return this.f161997b.hashCode() + (this.f161996a.hashCode() * 31);
    }
}
