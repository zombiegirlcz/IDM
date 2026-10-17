package g65;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f140878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f140879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f140880c;

    public h(aim.e items, TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140878a = title;
        this.f140879b = description;
        this.f140880c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f140880c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f140878a.equals(hVar.f140878a) && this.f140879b.equals(hVar.f140879b) && Intrinsics.f(this.f140880c, hVar.f140880c);
    }

    public final int hashCode() {
        return this.f140880c.hashCode() + t61.a.a(this.f140878a.hashCode() * 31, 31, this.f140879b);
    }
}
