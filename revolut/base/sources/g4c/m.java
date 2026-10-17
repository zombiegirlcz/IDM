package g4c;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f140481b;

    public m(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f140480a = items;
        this.f140481b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f140480a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f140480a, mVar.f140480a) && this.f140481b.equals(mVar.f140481b);
    }

    public final int hashCode() {
        return this.f140481b.hashCode() + (this.f140480a.hashCode() * 31);
    }
}
