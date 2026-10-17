package xya;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f309693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f309694b;

    public r(aim.e items, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f309693a = title;
        this.f309694b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f309694b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f309693a.equals(rVar.f309693a) && Intrinsics.f(this.f309694b, rVar.f309694b);
    }

    public final int hashCode() {
        return this.f309694b.hashCode() + (this.f309693a.hashCode() * 31);
    }
}
