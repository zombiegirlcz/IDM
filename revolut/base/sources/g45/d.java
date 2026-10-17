package g45;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yy0.j;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f140339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f140340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f140341c;
    public final ArrayList d;

    public d(TextLocalisedClause title, CompositeClause compositeClause, j image, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140339a = title;
        this.f140340b = compositeClause;
        this.f140341c = image;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f140339a.equals(dVar.f140339a) && Intrinsics.f(this.f140340b, dVar.f140340b) && this.f140341c.equals(dVar.f140341c) && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f140339a.hashCode() * 31;
        Clause clause = this.f140340b;
        return this.d.hashCode() + a10.b.c(this.f140341c.f317755a, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
