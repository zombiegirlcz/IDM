package qkk;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f247021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f247022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f247023c;

    public h(TextLocalisedClause title, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f247021a = items;
        this.f247022b = title;
        this.f247023c = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f247021a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f247021a, hVar.f247021a) && this.f247022b.equals(hVar.f247022b) && this.f247023c.equals(hVar.f247023c);
    }

    public final int hashCode() {
        return this.f247023c.hashCode() + t61.a.a(this.f247021a.hashCode() * 31, 31, this.f247022b);
    }
}
