package q23;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f241522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f241523c;
    public final Clause d;

    public s(aim.e items, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f241521a = items;
        this.f241522b = textLocalisedClause;
        this.f241523c = textLocalisedClause2;
        this.d = textLocalisedClause3;
    }

    @Override // cli.p
    public final List c() {
        return this.f241521a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f241521a, sVar.f241521a) && this.f241522b.equals(sVar.f241522b) && this.f241523c.equals(sVar.f241523c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(t61.a.a(this.f241521a.hashCode() * 31, 31, this.f241522b), 31, this.f241523c);
        Clause clause = this.d;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
