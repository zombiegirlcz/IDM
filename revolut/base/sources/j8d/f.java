package j8d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f172172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f172173b;

    public f(aim.e items, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172172a = title;
        this.f172173b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f172173b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f172172a.equals(fVar.f172172a) && Intrinsics.f(this.f172173b, fVar.f172173b);
    }

    public final int hashCode() {
        return this.f172173b.hashCode() + (this.f172172a.hashCode() * 31);
    }
}
