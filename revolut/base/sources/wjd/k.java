package wjd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f298049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f298050c;

    public k(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f298048a = items;
        this.f298049b = title;
        this.f298050c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f298048a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f298048a, kVar.f298048a) && this.f298049b.equals(kVar.f298049b) && this.f298050c.equals(kVar.f298050c);
    }

    public final int hashCode() {
        return this.f298050c.hashCode() + t61.a.a(this.f298048a.hashCode() * 31, 31, this.f298049b);
    }
}
