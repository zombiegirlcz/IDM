package fhi;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f135245b;

    public h(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f135244a = items;
        this.f135245b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f135244a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f135244a, hVar.f135244a) && Intrinsics.f(this.f135245b, hVar.f135245b);
    }

    public final int hashCode() {
        return this.f135245b.hashCode() + (this.f135244a.hashCode() * 31);
    }
}
