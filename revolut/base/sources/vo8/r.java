package vo8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f290910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f290911b;

    public r(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f290910a = title;
        this.f290911b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f290911b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f290910a.equals(rVar.f290910a) && Intrinsics.f(this.f290911b, rVar.f290911b);
    }

    public final int hashCode() {
        return this.f290911b.hashCode() + (this.f290910a.hashCode() * 31);
    }
}
