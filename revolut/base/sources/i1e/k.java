package i1e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f157619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f157620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f157621c;

    public k(TextLocalisedClause title, TextLocalisedClause subtitle, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f157619a = title;
        this.f157620b = subtitle;
        this.f157621c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f157621c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f157619a.equals(kVar.f157619a) && this.f157620b.equals(kVar.f157620b) && Intrinsics.f(this.f157621c, kVar.f157621c);
    }

    public final int hashCode() {
        return this.f157621c.hashCode() + t61.a.a(this.f157619a.hashCode() * 31, 31, this.f157620b);
    }
}
