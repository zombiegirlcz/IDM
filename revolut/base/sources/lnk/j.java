package lnk;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f197297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f197298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f197299c;
    public final Clause d;

    public j(List items, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f197297a = items;
        this.f197298b = textLocalisedClause;
        this.f197299c = textLocalisedClause2;
        this.d = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f197297a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f197297a, jVar.f197297a) && Intrinsics.f(this.f197298b, jVar.f197298b) && Intrinsics.f(this.f197299c, jVar.f197299c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f197297a.hashCode() * 31;
        Clause clause = this.f197298b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f197299c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        return iHashCode3 + (clause3 != null ? clause3.hashCode() : 0);
    }
}
