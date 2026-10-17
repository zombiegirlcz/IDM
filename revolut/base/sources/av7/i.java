package av7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f9934b;

    public i(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f9933a = items;
        this.f9934b = title;
    }

    @Override // jki.n
    public final List c() {
        return this.f9933a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f9933a, iVar.f9933a) && this.f9934b.equals(iVar.f9934b);
    }

    public final int hashCode() {
        return this.f9934b.hashCode() + (this.f9933a.hashCode() * 31);
    }
}
