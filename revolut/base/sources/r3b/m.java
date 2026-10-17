package r3b;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f251251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f251252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f251253c;
    public final tx0.r d;

    public m(int i, TextLocalisedClause title, List menuItems, tx0.r rVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f251251a = i;
        this.f251252b = title;
        this.f251253c = menuItems;
        this.d = rVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f251251a == mVar.f251251a && this.f251252b.equals(mVar.f251252b) && Intrinsics.f(this.f251253c, mVar.f251253c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(t61.a.a(Integer.hashCode(this.f251251a) * 31, 31, this.f251252b), 31, this.f251253c);
        tx0.r rVar = this.d;
        return iD + (rVar == null ? 0 : rVar.hashCode());
    }
}
