package s44;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f259760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f259761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f259762c;
    public final boolean d;
    public final List e;

    public m(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause buttonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f259760a = title;
        this.f259761b = textLocalisedClause;
        this.f259762c = buttonText;
        this.d = z;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f259760a.equals(mVar.f259760a) && Intrinsics.f(this.f259761b, mVar.f259761b) && this.f259762c.equals(mVar.f259762c) && this.d == mVar.d && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f259760a.hashCode() * 31;
        Clause clause = this.f259761b;
        return this.e.hashCode() + j6.a.c(t61.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f259762c), 31, this.d);
    }
}
