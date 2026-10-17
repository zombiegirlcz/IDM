package yw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends r {
    public final n14.e e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f317280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f317281h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n14.e background, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, e eVar) {
        super(false, false, 14);
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(title, "title");
        this.e = background;
        this.f = title;
        this.f317280g = textLocalisedClause;
        this.f317281h = eVar;
    }

    @Override // yw0.r
    public final n14.e a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.e.equals(lVar.e) && this.f.equals(lVar.f) && Intrinsics.f(this.f317280g, lVar.f317280g) && Intrinsics.f(this.f317281h, lVar.f317281h);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.e.hashCode() * 31, 31, this.f);
        Clause clause = this.f317280g;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        e eVar = this.f317281h;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
