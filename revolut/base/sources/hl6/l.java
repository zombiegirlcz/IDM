package hl6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f152995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f152996c;

    public l(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f152994a = items;
        this.f152995b = title;
        this.f152996c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f152994a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f152994a, lVar.f152994a) && this.f152995b.equals(lVar.f152995b) && this.f152996c.equals(lVar.f152996c);
    }

    public final int hashCode() {
        return this.f152996c.hashCode() + t61.a.a(this.f152994a.hashCode() * 31, 31, this.f152995b);
    }
}
