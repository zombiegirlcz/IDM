package rx5;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f258028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f258029b;

    public c(TextLocalisedClause timeframeClause, List items) {
        Intrinsics.checkNotNullParameter(timeframeClause, "timeframeClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f258028a = timeframeClause;
        this.f258029b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f258029b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f258028a, cVar.f258028a) && Intrinsics.f(this.f258029b, cVar.f258029b);
    }

    public final int hashCode() {
        return this.f258029b.hashCode() + (this.f258028a.hashCode() * 31);
    }
}
