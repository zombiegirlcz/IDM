package du;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f117488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f117489b;

    public b(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f117488a = items;
        this.f117489b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f117488a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f117488a, bVar.f117488a) && this.f117489b.equals(bVar.f117489b);
    }

    public final int hashCode() {
        return this.f117489b.hashCode() + (this.f117488a.hashCode() * 31);
    }
}
