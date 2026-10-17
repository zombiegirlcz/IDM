package qcc;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f244694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f244695b;

    public h(aim.e items, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f244694a = title;
        this.f244695b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f244695b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f244694a.equals(hVar.f244694a) && Intrinsics.f(this.f244695b, hVar.f244695b);
    }

    public final int hashCode() {
        return this.f244695b.hashCode() + (this.f244694a.hashCode() * 31);
    }
}
