package g4b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f140461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f140462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f140463c;
    public final boolean d;
    public final List e;

    public t(s sVar, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140461a = sVar;
        this.f140462b = textLocalisedClause;
        this.f140463c = textLocalisedClause2;
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
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f140461a, tVar.f140461a) && Intrinsics.f(this.f140462b, tVar.f140462b) && Intrinsics.f(this.f140463c, tVar.f140463c) && this.d == tVar.d && Intrinsics.f(this.e, tVar.e);
    }

    public final int hashCode() {
        s sVar = this.f140461a;
        int iHashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        Clause clause = this.f140462b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f140463c;
        return this.e.hashCode() + j6.a.c((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.d);
    }
}
