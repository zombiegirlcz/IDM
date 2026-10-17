package v1d;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f285298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f285299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f285300c;

    public k(Clause headerClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(headerClause, "headerClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f285298a = headerClause;
        this.f285299b = items;
        this.f285300c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f285298a.equals(kVar.f285298a) && Intrinsics.f(this.f285299b, kVar.f285299b) && this.f285300c == kVar.f285300c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285300c) + p.a.d(this.f285298a.hashCode() * 31, 31, this.f285299b);
    }
}
