package dt2;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f117349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f117350b;

    public h(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f117349a = items;
        this.f117350b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f117349a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f117349a, hVar.f117349a) && this.f117350b.equals(hVar.f117350b);
    }

    public final int hashCode() {
        return this.f117350b.hashCode() + (this.f117349a.hashCode() * 31);
    }
}
