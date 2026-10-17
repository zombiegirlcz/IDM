package f2c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f131503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f131504c;

    public l(List items, aw0.i iVar, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f131502a = items;
        this.f131503b = iVar;
        this.f131504c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f131502a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f131502a, lVar.f131502a) && Intrinsics.f(this.f131503b, lVar.f131503b) && Intrinsics.f(this.f131504c, lVar.f131504c);
    }

    public final int hashCode() {
        int iHashCode = this.f131502a.hashCode() * 31;
        aw0.i iVar = this.f131503b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Clause clause = this.f131504c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
