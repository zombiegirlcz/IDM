package i84;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f159436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f159437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f159438c;
    public final List d;

    public g(aim.e items, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159436a = title;
        this.f159437b = description;
        this.f159438c = buttonTitle;
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
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f159436a.equals(gVar.f159436a) && this.f159437b.equals(gVar.f159437b) && this.f159438c.equals(gVar.f159438c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f159436a.hashCode() * 31, 31, this.f159437b), 31, this.f159438c);
    }
}
