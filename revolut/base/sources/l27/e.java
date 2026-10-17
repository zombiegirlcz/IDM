package l27;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import yy0.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f191685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f191686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f191687c;

    public e(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, yy0.j jVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f191685a = title;
        this.f191686b = textLocalisedClause;
        this.f191687c = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f191685a.equals(eVar.f191685a) && Intrinsics.f(this.f191686b, eVar.f191686b) && Intrinsics.f(this.f191687c, eVar.f191687c);
    }

    public final int hashCode() {
        int iHashCode = this.f191685a.hashCode() * 31;
        Clause clause = this.f191686b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        l lVar = this.f191687c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
