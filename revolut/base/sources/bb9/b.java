package bb9;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f14193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f14194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14195c;

    public b(TextLocalisedClause title, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f14193a = title;
        this.f14194b = description;
        this.f14195c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f14195c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f14193a.equals(bVar.f14193a) && this.f14194b.equals(bVar.f14194b) && Intrinsics.f(this.f14195c, bVar.f14195c);
    }

    public final int hashCode() {
        return this.f14195c.hashCode() + t61.a.a(this.f14193a.hashCode() * 31, 31, this.f14194b);
    }
}
