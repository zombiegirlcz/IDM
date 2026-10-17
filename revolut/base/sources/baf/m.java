package baf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f14059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14060c;
    public final List d;

    public m(Clause title, TextLocalisedClause textLocalisedClause, boolean z, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f14058a = title;
        this.f14059b = textLocalisedClause;
        this.f14060c = z;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f14058a.equals(mVar.f14058a) && Intrinsics.f(this.f14059b, mVar.f14059b) && this.f14060c == mVar.f14060c && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f14058a.hashCode() * 31;
        Clause clause = this.f14059b;
        return this.d.hashCode() + j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f14060c);
    }
}
