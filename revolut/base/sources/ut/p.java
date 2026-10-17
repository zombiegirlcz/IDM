package ut;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f283009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f283010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f283011c;
    public final boolean d;

    public p(aim.e items, TextLocalisedClause title, TextLocalisedClause description, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f283009a = items;
        this.f283010b = title;
        this.f283011c = description;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f283009a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f283009a, pVar.f283009a) && this.f283010b.equals(pVar.f283010b) && this.f283011c.equals(pVar.f283011c) && this.d == pVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + t61.a.a(t61.a.a(this.f283009a.hashCode() * 31, 31, this.f283010b), 31, this.f283011c);
    }
}
