package rp9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f256293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f256294c;

    public c(TextLocalisedClause textLocalisedClause, List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f256292a = items;
        this.f256293b = menuItems;
        this.f256294c = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f256292a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f256292a, cVar.f256292a) && Intrinsics.f(this.f256293b, cVar.f256293b) && Intrinsics.f(this.f256294c, cVar.f256294c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f256292a.hashCode() * 31, 31, this.f256293b);
        Clause clause = this.f256294c;
        return iD + (clause == null ? 0 : clause.hashCode());
    }
}
