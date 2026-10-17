package zq7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f324413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f324414b;

    public f(aim.e items, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f324413a = title;
        this.f324414b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f324414b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f324413a.equals(fVar.f324413a) && Intrinsics.f(this.f324414b, fVar.f324414b);
    }

    public final int hashCode() {
        return this.f324414b.hashCode() + (this.f324413a.hashCode() * 961);
    }
}
