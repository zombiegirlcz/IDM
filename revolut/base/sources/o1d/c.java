package o1d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f221378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f221379b;

    public c(TextLocalisedClause headerClause, List items) {
        Intrinsics.checkNotNullParameter(headerClause, "headerClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f221378a = headerClause;
        this.f221379b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f221378a.equals(cVar.f221378a) && Intrinsics.f(this.f221379b, cVar.f221379b);
    }

    public final int hashCode() {
        return this.f221379b.hashCode() + (this.f221378a.hashCode() * 31);
    }
}
