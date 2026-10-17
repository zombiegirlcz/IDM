package qbg;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f244274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f244275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f244276c;

    public h(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f244274a = items;
        this.f244275b = textLocalisedClause;
        this.f244276c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f244274a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f244274a, hVar.f244274a) && Intrinsics.f(this.f244275b, hVar.f244275b) && this.f244276c == hVar.f244276c;
    }

    public final int hashCode() {
        int iHashCode = this.f244274a.hashCode() * 31;
        Clause clause = this.f244275b;
        return Boolean.hashCode(this.f244276c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
