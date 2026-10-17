package szb;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f266787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f266788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f266789c;

    public d(TextLocalisedClause title, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f266787a = items;
        this.f266788b = title;
        this.f266789c = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f266787a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f266787a, dVar.f266787a) && this.f266788b.equals(dVar.f266788b) && this.f266789c.equals(dVar.f266789c);
    }

    public final int hashCode() {
        return this.f266789c.hashCode() + t61.a.a(this.f266787a.hashCode() * 31, 31, this.f266788b);
    }
}
