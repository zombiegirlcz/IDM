package pmk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f237627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f237628b;

    public q(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f237627a = title;
        this.f237628b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f237628b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f237627a.equals(qVar.f237627a) && Intrinsics.f(this.f237628b, qVar.f237628b);
    }

    public final int hashCode() {
        return this.f237628b.hashCode() + (this.f237627a.hashCode() * 31);
    }
}
