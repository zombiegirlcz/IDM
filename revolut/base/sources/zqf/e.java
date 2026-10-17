package zqf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f324479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324480c;

    public e(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f324478a = items;
        this.f324479b = textLocalisedClause;
        this.f324480c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f324478a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f324478a, eVar.f324478a) && Intrinsics.f(this.f324479b, eVar.f324479b) && this.f324480c == eVar.f324480c;
    }

    public final int hashCode() {
        int iHashCode = this.f324478a.hashCode() * 31;
        Clause clause = this.f324479b;
        return Boolean.hashCode(this.f324480c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
