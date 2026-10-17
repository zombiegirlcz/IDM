package j1k;

import com.revolut.core.ui_kit.models.TimeClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeClause f170626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f170627b;

    public e(TimeClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f170626a = title;
        this.f170627b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f170627b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f170626a.equals(eVar.f170626a) && Intrinsics.f(this.f170627b, eVar.f170627b);
    }

    public final int hashCode() {
        return this.f170627b.hashCode() + (this.f170626a.hashCode() * 31);
    }
}
