package p9e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f234307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f234308b;

    public f(TextLocalisedClause navBarText, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarText, "navBarText");
        this.f234307a = items;
        this.f234308b = navBarText;
    }

    @Override // jki.n
    public final List c() {
        return this.f234307a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f234307a.equals(fVar.f234307a) && this.f234308b.equals(fVar.f234308b);
    }

    public final int hashCode() {
        return this.f234308b.hashCode() + (this.f234307a.hashCode() * 31);
    }
}
