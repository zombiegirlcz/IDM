package xe4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f304532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f304533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f304534c;

    public g(TextLocalisedClause title, TextLocalisedClause description, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f304532a = items;
        this.f304533b = title;
        this.f304534c = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f304532a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f304532a.equals(gVar.f304532a) && this.f304533b.equals(gVar.f304533b) && this.f304534c.equals(gVar.f304534c);
    }

    public final int hashCode() {
        return this.f304534c.hashCode() + t61.a.a(this.f304532a.hashCode() * 31, 31, this.f304533b);
    }
}
