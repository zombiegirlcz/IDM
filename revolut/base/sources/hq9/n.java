package hq9;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f154649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f154650c;

    public n(aw0.e footer, TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f154648a = items;
        this.f154649b = title;
        this.f154650c = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f154648a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f154648a, nVar.f154648a) && this.f154649b.equals(nVar.f154649b) && this.f154650c.equals(nVar.f154650c);
    }

    public final int hashCode() {
        return this.f154650c.hashCode() + t61.a.a(this.f154648a.hashCode() * 31, 31, this.f154649b);
    }
}
