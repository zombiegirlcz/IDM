package zdc;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f321447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321448b;

    public h(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f321447a = title;
        this.f321448b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f321448b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f321447a.equals(hVar.f321447a) && Intrinsics.f(this.f321448b, hVar.f321448b);
    }

    public final int hashCode() {
        return this.f321448b.hashCode() + (this.f321447a.hashCode() * 31);
    }
}
