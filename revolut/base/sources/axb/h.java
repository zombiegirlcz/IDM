package axb;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f10917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10918b;

    public h(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f10917a = title;
        this.f10918b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f10918b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f10917a.equals(hVar.f10917a) && Intrinsics.f(this.f10918b, hVar.f10918b);
    }

    public final int hashCode() {
        return this.f10918b.hashCode() + (this.f10917a.hashCode() * 31);
    }
}
