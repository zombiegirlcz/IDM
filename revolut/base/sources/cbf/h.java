package cbf;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ehe.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f22793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f22794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22795c;

    public h(aw0.e nextButton, TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f22793a = title;
        this.f22794b = nextButton;
        this.f22795c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f22795c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f22793a.equals(hVar.f22793a) && this.f22794b.equals(hVar.f22794b) && Intrinsics.f(this.f22795c, hVar.f22795c);
    }

    public final int hashCode() {
        return this.f22795c.hashCode() + n.c(this.f22794b, this.f22793a.hashCode() * 31, 31);
    }
}
