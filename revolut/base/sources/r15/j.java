package r15;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f250908b;

    public j(TextLocalisedClause screenTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        this.f250907a = items;
        this.f250908b = screenTitle;
    }

    @Override // jki.n
    public final List c() {
        return this.f250907a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f250907a, jVar.f250907a) && this.f250908b.equals(jVar.f250908b);
    }

    public final int hashCode() {
        return this.f250908b.hashCode() + j6.a.c(this.f250907a.hashCode() * 961, 961, false);
    }
}
