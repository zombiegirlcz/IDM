package nsc;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f218781b;

    public h(TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f218780a = items;
        this.f218781b = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f218780a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f218780a, hVar.f218780a) && Intrinsics.f(this.f218781b, hVar.f218781b);
    }

    public final int hashCode() {
        int iHashCode = this.f218780a.hashCode() * 31;
        Clause clause = this.f218781b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
