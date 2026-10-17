package uk9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f280702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f280703b;

    public f(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f280702a = items;
        this.f280703b = title;
    }

    @Override // jki.n
    public final List c() {
        return this.f280702a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f280702a, fVar.f280702a) && this.f280703b.equals(fVar.f280703b);
    }

    public final int hashCode() {
        return this.f280703b.hashCode() + (this.f280702a.hashCode() * 31);
    }
}
