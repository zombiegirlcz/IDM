package imh;

import aw0.e4;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f162470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f162471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f162472c;

    public f(ArrayList items, TextLocalisedClause searchHint, e4 filterState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(filterState, "filterState");
        this.f162470a = items;
        this.f162471b = searchHint;
        this.f162472c = filterState;
    }

    @Override // cli.p
    public final List c() {
        return this.f162470a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f162470a.equals(fVar.f162470a) && this.f162471b.equals(fVar.f162471b) && this.f162472c == fVar.f162472c;
    }

    public final int hashCode() {
        return this.f162472c.hashCode() + t61.a.a(this.f162470a.hashCode() * 31, 31, this.f162471b);
    }
}
